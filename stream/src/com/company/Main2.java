package com.company;

public class Main2 {
    public static void main(String[] args) {
        User u = new User();
        u.gender = Gender.FEMALE;
        System.out.println(u.gender.name());
        System.out.println(u.gender.ordinal());
        Gender [] genders = Gender.values();
        for (Gender g : genders){
            System.out.println(g);
        }
        u.gender = Gender.valueOf("MALE");
        System.out.println(u.gender);
        u.hairColor = Color.RED;
        System.out.println(u.hairColor.getCode());
        u.hairColor.test();



    }
}
