/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch01springBegin.selfpractice.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ch01springBegin.selfpractice.mydao.MyTestDao;

/**
 *
 * @author jason
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch01springBegin\\selfpractice\\applicationContext.xml");
        MyTestDao mtd = (MyTestDao) context.getBean("mytest");
        mtd.sayHi();
        mtd.sayBye();
    }
}
