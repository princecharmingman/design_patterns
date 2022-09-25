package com.tw.design_patterns.prototype.clone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Person implements Cloneable {

    private Phone phone;

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
