package com.rocana.nsync;

/**
 * Created by ajish on 5/5/16.
 */
public class Comptroller {

    private static Comptroller instance = new Comptroller();

    private Comptroller() {
        //prevent direct instantiation
    }

    public static Comptroller getInstance(){
        return instance;
    }

    public synchronized void transferFunds(Account source, Account destination, int amount) {
        System.out.println("(" + source.getAvailableFunds() + ", " + destination.getAvailableFunds() + ") " + amount);
        if (source.getAvailableFunds() >= amount) {
            source.setAvailableFunds(source.getAvailableFunds() - amount);
            destination.setAvailableFunds(destination.getAvailableFunds() + amount);
            System.out.println("(" + source.getAvailableFunds() + ", " + destination.getAvailableFunds() + ") ");
        } else {
            System.out.println("failed");
            throw new IllegalArgumentException("Insufficient funds in source: " + source);
        }
    }
}
