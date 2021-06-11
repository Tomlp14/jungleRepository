package com.tomwebdesings.jungle;

import com.tomwebdesings.jungle.model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean game= true;

        do{
            Scanner myScanner=  new Scanner(System.in);
            System.out.println("Select one of the Species" +
                    "  \n 1: Tiger" +
                    "  \n 2: Lion" +
                    "  \n 3: Monkey " +
                    "  \n 4: Snake " +
                    "  \n 5: Gecko  " +
                    "  \n 6: Quit");
            String selection= myScanner.nextLine();
            int selectionNum= Integer.parseInt(selection);

            if(selectionNum >=1 && selectionNum <=6) {
                switch (selectionNum) {
                    case 1: System.out.println("Tiger was selected.");
                        new Tiger().interact();
                        break;
                    case 2:
                        System.out.println("Lion was selected.");
                        new Lion().interact();
                        break;
                    case 3:  System.out.println("Monkey was selected.");
                        new Monkey().interact();
                        break;
                    case 4:  System.out.println("Snake was selected.");
                        new Snake().interact();
                        break;
                    case 5:
                        System.out.println("Gecko was selected.");
                        new Gecko().interact();
                        break;
                    default:
                        System.out.println("Quit was selected");
                        game = false;
                }
            }else{
                System.out.println("Invalid input try again. \n" +
                        "Selection is from 1-6");
            }

        }while(game == true );
        if(!game)
            System.out.println("Bye!");
    }// main


}
