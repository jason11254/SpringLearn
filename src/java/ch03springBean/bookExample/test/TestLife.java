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
        // ��l��Spring�e��, �[��xml
        //  �ϥ�ClassPathXmlApplicationContext��K�t�ܾP��
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ch03springBean\\bookExample\\applicationContext.xml");
        System.out.println("��o��H�e");
        BeanLife beanLife = (BeanLife) context.getBean("beanLife");
        System.out.println("��o��H�� "+beanLife);
        context.close(); //������P��Bean
    }
}
