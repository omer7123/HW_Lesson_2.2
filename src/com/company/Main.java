package com.company;

public class Main {

    public static void main(String[] args) {
       int result = generate();
        System.out.println(result);

    }

    public static int generate() {
        int a = (int) (Math.random() * 108);
        return a;
    }

}
