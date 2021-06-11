package com.tomwebdesings.jungle.model;

public class Animal {

    protected   int sound, eat, sleep, amountOfSpecie;
    protected String specie;

    public Animal(String specie, int amountOfSpecie) {
        this.specie = specie;
        this.amountOfSpecie= amountOfSpecie;
    }

    public String getSpecie() {
        return specie;
    }

    public int getAmountOfSpecie() {
        return amountOfSpecie;
    }

    public int getSound() {
        return sound;
    }

    public void makeSound(){
        sound-=3;
    }

    public int getEat() {
        return eat;
    }

    public void eatFood(){
        eat+=5;
    }

    public int getSleep() {
        return sleep;
    }

    public void goSleep(){
        sleep+=10;
    }

     public int getEnergy() {
         return getSleep() + getEat() + getSound();
     }

     public void howAnimalPlay(){
             System.out.println("The animal doesn't play");
     }
}
