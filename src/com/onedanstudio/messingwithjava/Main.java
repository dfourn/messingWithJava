package com.onedanstudio.messingwithjava;

import java.lang.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!\n-----------------------------------\n");

        Integer number = new Integer(10);

        number.times(new Runnable() {
            @Override
            public void run() {
                System.out.println("Problem? :D");
            }
        });


    }
}
