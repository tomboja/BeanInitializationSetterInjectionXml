package edu.miu.cs544.temesgen.service;

/**
 * @ProjectName: BeanInitializationSetterInjectionXml
 * @Author: Temesgen D.
 * @Date: 3/6/22
 */

public class Car implements Vehicle{
    private int year;

    @Override
    public void move() {
        System.out.println("Car moves at 50 mph");
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                '}';
    }
}
