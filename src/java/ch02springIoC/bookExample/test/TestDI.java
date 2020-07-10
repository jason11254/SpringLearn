/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02springIoC.bookExample.test;

import ch02springIoC.bookExample.service.TestDIService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author jason
 */
public class TestDI {
    public static void main(String[] args) {
        // 初始化容器, 加載xml
        ApplicationContext  context = new ClassPathXmlApplicationContext("ch02springIoC\\bookExample\\applicationContext.xml");
        // 通過容器獲得testDIService實體, 測試建構子注入
        TestDIService ts = (TestDIService) context.getBean("testDIService");
        ts.sayHello();
        
        // 通過容器獲得testDIService實體, 測試setter方法注入
        TestDIService ts2 = (TestDIService) context.getBean("testDIService2");
        ts2.sayHello();
    }
}
