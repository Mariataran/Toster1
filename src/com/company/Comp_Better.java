package com.company;

/**
 * Created by student2 on 02.12.16.
 */
public class Comp_Better extends Bets_Decision {
    public int makeBets(int balance){

      Integer reserve_balance = (int) (Math.random()*balance+1);
        return((Integer) reserve_balance);
    }

}
