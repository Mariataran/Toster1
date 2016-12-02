package com.company;

/**
 * Created by student2 on 14.11.16.
 */
public abstract class Player {
    Hand hand = new Hand();
    private Intellect intellect;
    String name;
    Condition con = Condition.PLAYER_IN_GAME;
    Integer balance;
    Integer reserve_balance;
    private Bets_Decision bets_decision;

    public Player(String name, Intellect intellect) {
        this.intellect = intellect;
        this.name = name;
        this.balance = 1000;
        this.reserve_balance = 0;
        this.bets_decision = bets_decision;
    }

    public void take(Card current) {
        hand.add(current);

    }

    public Command decision() {
        int score = hand.getScore();
        if (score > 21)
            return Command.STAND;
        return intellect.decide(score);
    }

    public void makeBets() {


    }
}
