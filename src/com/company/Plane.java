package com.company;

public class Plane implements Transport{
    Plane(){

    }
    @Override
    public void deliver() {
        System.out.println("Please, send it to place by plane in air");
    }
}
