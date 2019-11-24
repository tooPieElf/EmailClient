package com.company;

public class Main {

    public static void main(String[] args) {

    Email one = new Email("Chukwudi","Ndimneze");
    one.setAlternateEmail("chu@hd.com");
    one.setMailBoxCapacity(344);
    one.setPassword("chukwudi1");


        System.out.println(one.show());

    }
}
