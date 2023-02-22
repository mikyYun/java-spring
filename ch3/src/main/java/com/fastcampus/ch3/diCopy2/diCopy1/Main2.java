package com.fastcampus.ch3.diCopy2.diCopy1;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

class Car {}
class SportsCar extends Car {}
class Truck extends Car {}
class Engine {}

class AppContext {
    // object storage
    Map map;
    AppContext() {
        map = new HashMap();

        try {
            Properties p = new Properties();
            p.load(new FileReader("config.txt"));

            

            Class clazz = Class.forName(p.getProperty("car"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Object getBean(String key) {
        return map.get(key);
    }
}

public class Main2 {
    public static void main(String[] args) throws Exception {
        AppContext ac = new AppContext();
        Car car = (Car) ac.getBean("car");
        Engine engine = (Engine) ac.getBean("engine");
        System.out.println("newCar = " + car);
        System.out.println("Engine = " + engine);

    }


}
