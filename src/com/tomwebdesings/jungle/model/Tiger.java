package com.tomwebdesings.jungle.model;

import com.tomwebdesings.jungle.util.Utillity;

import java.util.Scanner;

public class Tiger extends Animal {



    public Tiger() {
        super("Tiger", 12);
    }

    @Override
    public void goSleep(){
        sleep+=5;
    }


    @Override
    public void howAnimalPlay(){
        System.out.println("Yes, they do. The Tiger plays with other tigers.");
    }

    public void interact(){
        boolean quit=false;
        do {
            System.out.println( " The current energy of the "+getSpecie() +" is: " + getEnergy());
            int selectionNum= new Utillity().makeSelection(); //It's calling a function.
            if(selectionNum >=1 && selectionNum <=6) {
                switch (selectionNum) {
                    case 1:
                        System.out.println("The"+getSpecie() +" knows there is " +getAmountOfSpecie() + " kinds in there specie ");
                        break;
                    case 2:
                        howAnimalPlay();
                        break;
                    case 3:
                        System.out.println("The Tiger is eating a zebra. It cannot eat grains" );
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
                    case 6:
                        System.out.println("Quit was selected. Bye Tiger!");
                        quit = true;
                }
            }else{
                System.out.println("Invalid input try again. \n" +
                        "Selection is from 1-6");
            }
        }while (!quit);


    }// method


}
