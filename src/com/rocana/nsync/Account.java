package com.rocana.nsync;

/**
 * Created by ajish on 5/5/16.
 */

public class Account {

    private long id;
    private int availableFunds;

    public Account(int starting){
        availableFunds = starting;
    }

    public int getAvailableFunds(){
        return availableFunds;
    }

    public void setAvailableFunds(int funds){
        availableFunds = funds;
    }

    public long getId(){
        return id;
    }

    public void setId(long newId){
        id = newId;
    }

}
