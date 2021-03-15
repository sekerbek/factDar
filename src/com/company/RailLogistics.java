package com.company;

public class RailLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Train();
    }
}
