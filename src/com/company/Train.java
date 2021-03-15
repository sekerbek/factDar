package com.company;

public class Train implements Transport{
    Train(){

    }
    @Override
    public void deliver(){
        System.out.println("Please, send it by to place by train in railway");
    }
}
