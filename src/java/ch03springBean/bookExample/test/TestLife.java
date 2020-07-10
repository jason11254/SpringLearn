/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.bookExample.test;

import ch03springBean.bookExample.life.BeanLife;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jason
 */
public class TestLife {
    public static void main(String[] args) {
        // 初始化Spring容器, 加載xml
        //  使用ClassPathXmlApplicationContext方便演示銷毀
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ch03springBean\\bookExample\\applicationContext.xml");
        System.out.println("獲得對象前");
        BeanLife beanLife = (BeanLife) context.getBean("beanLife");
        System.out.println("獲得對象後 "+beanLife);
        context.close(); //關閉後銷毀Bean
    }
}
