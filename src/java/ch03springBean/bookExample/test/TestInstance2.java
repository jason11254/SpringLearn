/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.bookExample.test;

import ch03springBean.bookExample.instance.BeanClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jason
 */
public class TestInstance2 {
    public static void main(String[] args) {
        // 初始化Spring 容器ApplicationContext, 加載xml
        ApplicationContext context = new ClassPathXmlApplicationContext("ch03springBean\\bookExample\\applicationContext.xml");
        // Bean scope默認設定為 singleton 只會生成一個實體, 每次用id 或name呼叫Bean都會得到同一個共享實體。
        //建構子實體化Bean, 返回的為同一個Bean實體
        BeanClass b1 = (BeanClass) context.getBean("singletonInstance");
        System.out.println(b1);
        BeanClass b2 = (BeanClass) context.getBean("singletonInstance");
        System.out.println(b2);
        // Bean scope設定為 prototype 每次都會生成一個實體, 用id 或name呼叫Bean都會得到不同實體。
        BeanClass b3 = (BeanClass) context.getBean("prototypeInstance");
        System.out.println(b3);
        BeanClass b4 = (BeanClass) context.getBean("prototypeInstance");
        System.out.println(b4);       
    }  
}
