package com.atguigu.springboot2020.designmodel.observer;

public class ObserverTest {
    public static void main(String[] args) {
        ObserverServer server = new ObserverServer();
        ObserverClient client = new ObserverClient();

        client.openPush(server);
        server.setMsg("第一次更新信息");

    }
}
