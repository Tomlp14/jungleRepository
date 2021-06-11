package com.tomwebdesings.jungle.util;

import com.tomwebdesings.jungle.model.Animal;

import java.util.Scanner;

public class Utillity {

    public int makeSelection(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println(
                "  \n 1: How many in there specie? " +
                        "  \n 2: Do they play? "+
                        "  \n 3:  Do you want them it eat?" +
                        "  \n 4: Do you want them to make a sound? " +
                        "  \n 5: Do you want them to sleep?  " +
                        "  \n 6: Quit ");
        String selection= myScanner.nextLine();
        int selectionNum= Integer.parseInt(selection);

        return selectionNum;
    }//end of function
}
