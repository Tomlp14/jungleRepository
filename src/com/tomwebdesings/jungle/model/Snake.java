package com.tomwebdesings.jungle.model;

import com.tomwebdesings.jungle.util.Utillity;

import java.util.Scanner;

public class Snake extends Animal {
    public Snake() {
        super("Snake", 25);
    }


   public void interact(){
        boolean quit=false;
        System.out.println("Snake was selected.");

        do {
            System.out.println( " The current energy of the "+getSpecie()+" is: " + getEnergy());
            int selectionNum= new Utillity().makeSelection(); //It's calling a function.
            if(selectionNum >=1 && selectionNum <=6) {
                switch (selectionNum) {
                    case 1:
                        System.out.println("The "+getSpecie() +" knows there is " +getAmountOfSpecie() + " kinds in there specie ");
                        break;
                    case 2:
                        howAnimalPlay();
                        break;
                    case 3:
                        System.out.println("The Snake is eating a rat.");
                        eatFood();
                        break;
                    case 4:
                        System.out.println("Raaaah!");
                        makeSound();
                        break;
                    case 5:
                        System.out.println("ZZZZZ.");
                        goSleep();
                        break;
                    default:
                        System.out.println("Quit was selected. Bye Snake!");
                        quit = true;
                }
            }else{
                System.out.println("Invalid input try again. \n" +
                        "Selection is from 1-6");
            }
        }while (!quit);


    }// end of method
}
