package com.tw.design_patterns.prototype.deep_clone;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.*;

@Slf4j
public class CloneUtils {

    public static <T extends Serializable> T getDeepCloneObject(T t) {

        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(t);
            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            T object = (T) ois.readObject();
            return object;
        } catch (Exception e) {
            log.error("深拷贝对象异常！ 异常信息：" + e);
        } finally {
            IOUtils.closeQuietly(baos);
            IOUtils.closeQuietly(oos);
            IOUtils.closeQuietly(bais);
            IOUtils.closeQuietly(ois);
        }
        return null;
    }

}