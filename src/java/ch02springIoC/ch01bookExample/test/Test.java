/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02springIoC.ch01bookExample.test;


import ch02springIoC.ch01bookExample.dao.TestDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


/**
 *
 * @author jason
 */
public class Test {
    public static void main(String[] args) {
        // ��l��Spring�e��, ���Jxml
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("D:\\javaproject\\SpringMVCProject\\src\\java\\ch02springIoC\\ch01bookExample\\applicationContext.xml"));
        // �q�L�e�����otest���
        TestDao tt = (TestDao)beanFactory.getBean("test");
        tt.sayHello();
    }
}
