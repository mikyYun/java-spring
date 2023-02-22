package com.fastcampus.ch3.diCopy1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

class Car {}
class SportsCar extends Car {}
class Truck extends Car {}
class Engine {}

public class Main1 {
    public static void main(String[] args) throws Exception {
//        Car car = getCar();
//        System.out.println("Car = " + car);

        Car carObj = (Car) getObject("car");
            Engine engine = (Engine) getObject("engine");
        System.out.println("newCar = " + carObj);
        System.out.println("Engine = " + engine);

    }

    static Car getCar() throws Exception {
        Properties p = new Properties();
        p.load(new FileReader("config.txt"));

        Class clazz = Class.forName(p.getProperty("car"));

        return (Car)clazz.newInstance();
    }

    static Object getObject(String key) throws Exception {
        Properties p = new Properties();
        p.load(new FileReader("config.txt"));

        Class clazz = Class.forName(p.getProperty(key));
        return clazz.newInstance();
    }
}
