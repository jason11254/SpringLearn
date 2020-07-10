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
        // ��l�Ʈe��, �[��xml
        ApplicationContext  context = new ClassPathXmlApplicationContext("ch02springIoC\\bookExample\\applicationContext.xml");
        // �q�L�e����otestDIService����, ���իغc�l�`�J
        TestDIService ts = (TestDIService) context.getBean("testDIService");
        ts.sayHello();
        
        // �q�L�e����otestDIService����, ����setter��k�`�J
        TestDIService ts2 = (TestDIService) context.getBean("testDIService2");
        ts2.sayHello();
    }
}
