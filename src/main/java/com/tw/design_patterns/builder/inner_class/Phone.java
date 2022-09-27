package com.tw.design_patterns.builder;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Phone {

    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainBoard = builder.mainboard;
    }


    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder mainBoard(String mainBoard) {
            this.mainboard = mainBoard;
            return this;
        }

        //使用构建者创建Phone对象
        public Phone build() {
            return new Phone(this);
        }
    }
}
