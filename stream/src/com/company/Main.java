package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);

        // тернарный оператор
        // <логическое выражение> ? <x> : <y>;
        // вернется  <x> если  b==true;
        // вернется  <y> если  b==false;
        //аргументы х и у должны быть одного типа
        int age = 21;
        String answer = age>= 18 ? "совершеннолетний" : "несовершеннолетний";
        System.out.println(answer);
        System.out.println(list.stream().max((a,b) -> a>b ? 1: a==b ? 0: -1).get());

        System.out.println(list.stream().max((Integer::compare)).get());

        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().reduce((prev, x) -> prev + x).get());
        System.out.println(list.stream().reduce(1000,(prev,x) ->prev -x));

    }
}
