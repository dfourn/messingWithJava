package com.onedanstudio.messingwithjava;

/**
 * Created by dan on 22/06/15.
 */
public abstract class Returnable implements Runnable {
    @Override
    public void run() {

    }

    abstract public Object ret();
}
