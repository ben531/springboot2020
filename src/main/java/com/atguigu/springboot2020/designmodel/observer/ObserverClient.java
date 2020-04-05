package com.atguigu.springboot2020.designmodel.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverClient implements Observer {

    public void openPush(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ObserverServer) {
            ObserverServer os = (ObserverServer) o;
            System.out.println("服务器更新了消息:" + os.getMsg());
        }
    }

    public void closePush(Observable observable) {
        observable.deleteObserver(this);
    }

}
