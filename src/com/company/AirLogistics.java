
package com.company;

public class AirLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
