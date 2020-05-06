package com.atguigu.springboot2020.designmodel.singleton;

/**
 * 饿汉模式
 */
public class HungerySingleton {

    private static HungerySingleton singleton = new HungerySingleton();

    private HungerySingleton() {
    }

    public static HungerySingleton getInstance() {
        return singleton;
    }
}
