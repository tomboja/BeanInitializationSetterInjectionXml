package edu.miu.cs544.temesgen.service;

/**
 * @ProjectName: BeanInitializationSetterInjectionXml
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

public class Game {
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void play() {
        vehicle.move();
    }
}
