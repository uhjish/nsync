package com.rocana.nsync;

public class Main {

    public static void main(String[] args) {

        Account a = new Account(100);
        Account b = new Account(0);
        Comptroller c = Comptroller.getInstance();

        ThreadDemo T1 = new ThreadDemo( "T1_add5", c, a, b, 5);
        ThreadDemo T2 = new ThreadDemo( "T2_add10", c, a, b, 10);
        ThreadDemo T3 = new ThreadDemo( "T3_sub5", c, b, a, 5);
        ThreadDemo T4 = new ThreadDemo( "T4_sub20", c, b, a, 20);

        T1.start();
        T2.start();
        T3.start();
        T4.start();

        // wait for threads to end
        try {
            T1.join();
            T2.join();
            T3.join();
            T4.join();
        } catch( Exception e) {
            System.out.println("Interrupted");
        }

    }
}
