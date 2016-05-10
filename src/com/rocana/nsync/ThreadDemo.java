package com.rocana.nsync;

import com.rocana.nsync.Account;
import com.rocana.nsync.Comptroller;

/**
 * Created by ajish on 5/5/16.
 */
public class ThreadDemo extends Thread{

    private Thread t;
    private String threadName;
    Comptroller compt;
    Account source;
    Account sink;
    int xferAmt;

    ThreadDemo(String name,  Comptroller c, Account src, Account snk, int amt){
        threadName = name;
        compt = c;
        source = src;
        sink = snk;
        xferAmt = amt;
    }

    public void run() {

        for (int i = 0; i < 1000; i++){
            System.out.println(threadName);
            compt.transferFunds(source, sink, xferAmt);
        }

        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
