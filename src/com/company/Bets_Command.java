package com.company;

/**
 * Created by student2 on 02.12.16.
 */
public enum Bets_Command {
  FIFTY(50),STO(100), DVESTY(200), OTSOSI_U_TRACTORISTA(300), CHETIRESTA(400), PYATIHAT(500), SHESTSOT(600);
    private int balance;
    Bets_Command(int balance) {this.balance = balance;}
}
