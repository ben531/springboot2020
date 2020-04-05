package com.atguigu.springboot2020.designmodel.factory;

public class SmsSend implements Send {

    @Override
    public void send() {
        System.out.println("sms send");
    }

}
