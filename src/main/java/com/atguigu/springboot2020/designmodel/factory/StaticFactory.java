package com.atguigu.springboot2020.designmodel.factory;

public class StaticFactory {
    public static Send mailSend() {
        return new MailSend();
    }

    public static Send smsSend() {
        return new SmsSend();
    }
}
