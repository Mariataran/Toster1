package com.company;

/**
 * Created by student2 on 14.11.16.
 */
public class Computer extends Player{

    static String names[]={"Roberta", "Snegana", "Florentina", "Kristina", "Natasha", "Phoxtrot" };
    public Computer(Intellect intellect) {

        super("", intellect);
        //1: выбрать случайное имя из массива
        int randomnumber = (int) (Math.random()*Computer.names.length);

        //2: присвоить эт имя компуктеру
        name = names[randomnumber];
       }
    }

