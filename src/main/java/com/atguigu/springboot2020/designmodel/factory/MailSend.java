package com.atguigu.springboot2020.designmodel.factory;

public class MailSend implements Send {

    @Override
    public void send() {
        System.out.println("mail send");
    }

}
