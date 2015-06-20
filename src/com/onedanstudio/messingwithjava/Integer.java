package com.onedanstudio.messingwithjava;

/**
 * Created by dan on 20/06/15.
 */

//FFS, I cannot extend integer because it's a final class, so I just have to make my own wrapper class.

public class Integer {

    protected int value;

    public Integer(int value) {
        this.value = value;
    }

    public Integer(String s) throws NumberFormatException {
        this.value = java.lang.Integer.parseInt(s);
    }

    public Integer(Integer value) {
        this.value = value.value;
    }

    public void times(Runnable runnable) {
        for (int i = 0; i<value; i++) {
            runnable.run();
        }

    }
}
