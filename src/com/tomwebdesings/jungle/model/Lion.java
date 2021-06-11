package com.tomwebdesings.jungle.model;

import com.tomwebdesings.jungle.util.Utillity;

public class Lion extends Animal {
    public Lion() {
        super("Lion", 8);
    }

    public void interact() {
        boolean quit = false;
        do {
            System.out.println(" The current energy of the " + getSpecie() + " is: " + getEnergy());
            int selectionNum = new Utillity().makeSelection(); //It's calling a function.
            if (selectionNum >= 1 && selectionNum <= 6) {
                switch (selectionNum) {
                    case 1:
                        System.out.println("The " + getSpecie() + " knows there is " + getAmountOfSpecie() + " kinds in there specie ");
                        break;
                    case 2:
                        howAnimalPlay();
                        break;
                    case 3:
                        System.out.println("The " + getSpecie() + " is eating a dying animal");
                        eatFood();
                        break;
                    case 4:
                        System.out.println("Woahu, !");
                        makeSound();
                        break;
                    case 5:
                        System.out.println("zzzzzzzz");
                        goSleep();
                        break;
                    case 6:
                        System.out.println("Quit was selected. Bye Lion!");
                        quit = true;
                }
            } else {
                System.out.println("Invalid input try again. \n" +
                        "Selection is from 1-6");
            }
        } while (!quit);


    }//method

}
