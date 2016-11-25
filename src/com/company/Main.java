package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> players = new LinkedList<>();
        players.add(new Computer("C1", new LimitIntellect(14)));
        players.add(new Computer("C2", new LimitIntellect(20)));
        players.add(new Human("Ya", new ConsoleIntellect()));
        Dealer dealer = new Dealer();
        players.add(dealer);

        for (Player player : players) {
            dealer.deal(player);
            dealer.deal(player);
            System.out.println(player.hand);
        }
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
