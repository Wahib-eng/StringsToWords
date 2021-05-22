package com.withWahib;

public class Main {
    public static void main(String[] args) {

        String mesg3 = new String(" Python Java bir Programlama Dildir ");
        String mesg2 = new String(" انا احبك ");
        String[] s2 = mesg3.split(" ");
        String[] s1 = mesg2.split(" ");
        for (int i = 0; i <6; i++) {
            System.out.println(s2[i]);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(s1[i]);
        }

    }
}