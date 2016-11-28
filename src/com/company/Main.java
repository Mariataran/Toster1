package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Tabke table = new Tabke();
        while(true){
            table.makeBets();
            table.dealCards();
            table.playGame();
            table.decideWinners();
            table.payBets();
            table.discardCards();
        }













        //игра
        for (Player player : players) {
            while (true) {
                System.out.println(player.hand.getScore() + " " + player.hand);
                Command command = player.decision();
                System.out.println(command);
                if (command == Command.STAND)
                    break;
                if (command == Command.HIT)
                    dealer.deal(player);
            }
        }

        //опр. победителей
        for (Player player : players) {
            if (player != dealer) {
                if (player.hand.getScore() > 21)
                    player.con = Condition.PLAYER_LOSE;
                else if (dealer.hand.getScore() > 21)
                    player.con = Condition.PLAYER_WIN;
                else if (player.hand.getScore() < dealer.hand.getScore())
                    player.con = Condition.PLAYER_LOSE;
                else if (player.hand.getScore() == dealer.hand.getScore())
                    player.con = Condition.PLAYER_NICHYA;
                else
                    player.con = Condition.PLAYER_WIN;
            }
            System.out.println(player.name + " " + player.con + " with " + player.hand.getScore());
        }
    }
}
