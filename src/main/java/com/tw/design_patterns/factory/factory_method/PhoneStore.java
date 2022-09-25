package com.tw.design_patterns.factory.factory_method;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PhoneStore {

    private PhoneFactory factory;

    public Phone bookPhone() {
        return factory.producePhone();
    }
}
