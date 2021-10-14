package com.company;


import java.util.ArrayList;


public class Dog {
    boolean isHungry = true;
    private ArrayList<String> offSpring;

    public Dog(Object woodie, boolean b) {
    }

    public String feedDog (){
        if(isHungry==true){
            feedDog();
            isHungry = false;
        }

        return null;
    }
    public void getPuppies(){
        if(myDog.offSpring){

        }
    }
}
