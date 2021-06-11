package com.company;

public enum Color {
    // каждое значение enum ,  является отдельным объектом этого enum
    RED("#ff0000") {
        @Override
        public void test () {
            System.out.println("Красный");
        };
    },
    WHITE ("#ffffff") {
        @Override
        public void test (){
            System.out.println("Белый");
        }
    };
    private String code;
    // у enum могут быть конструктор
    // у enum по дефолту конструктор приватный
    Color (String code) {
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public abstract void test ();
}
