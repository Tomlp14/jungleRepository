package com.tomwebdesings.jungle.model;

import com.tomwebdesings.jungle.util.Utillity;

public class Monkey extends Animal {
    public Monkey() {
        super("Monky", 17);
    }

    @Override
    public void howAnimalPlay(){
        System.out.println("The Monkey plays with other monkeys and zebras");
    }

     @Override
     public void eatFood(){
         eat+=2;
     }
     @Override
     public void makeSound(){
        sound-=4;
    }

    public void interact(){
        boolean quit=false;
        do {
            System.out.println( " The current energy of the " +getSpecie() +" is: " + getEnergy());
            int selectionNum= new Utillity().makeSelection(); //It's calling a function.
            if(selectionNum >=1 && selectionNum <=6) {
                switch (selectionNum) {
                    case 1:
                        System.out.println("The " +getSpecie()+ " knows there is " +getAmountOfSpecie() + " kinds in there specie ");
                        break;
                    case 2:
                        howAnimalPlay();
                        break;
                    case 3:
                        System.out.println("The "+ getSpecie() + " is eating a banana");
                        eatFood();
                        break;
                    case 4:
                        System.out.println("Uh, uh, ha, ha, ha, !");
                        makeSound();
                        break;
                    case 5:
                        System.out.println("ZZZZZ.");
                        goSleep();
                        break;
                    case 6:
                        System.out.println("Quit was selected. Bye Monkey!");
                        quit = true;
                }
            }else{
                System.out.println("Invalid input try again. \n" +
                        "Selection is from 1-6");
            }
        }while (!quit);


    }// method
}

