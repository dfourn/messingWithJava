package com.onedanstudio.messingwithjava;

import java.lang.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!\n-----------------------------------\n");

        Integer number = new Integer(10);


        String value = (String)number.times(new Returnable() {

            String test = "";

            @Override
            public void run() {
                test = test + "Problem?:D ";
            }

            @Override
            public Object ret() {
                return test;
            }
        });


        System.out.println(value);
    }
}
