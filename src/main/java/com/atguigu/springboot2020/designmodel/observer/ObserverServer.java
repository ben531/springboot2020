package com.atguigu.springboot2020.designmodel.observer;

import java.util.Observable;

public class ObserverServer extends Observable {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }

}
