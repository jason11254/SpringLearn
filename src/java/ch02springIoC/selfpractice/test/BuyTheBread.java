/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02springIoC.selfpractice.test;

import ch02springIoC.selfpractice.service.Purchaser;
import ch02springIoC.selfpractice.service.PurchaserSec;
import ch02springIoC.selfpractice.service.PurchaserThir;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jason
 */
public class BuyTheBread {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch02springIoC\\selfpractice\\applicationContext.xml");
        Purchaser purchase =(Purchaser) context.getBean("purchase");
        purchase.purchaseBread();
        PurchaserSec purchaserSec =(PurchaserSec) context.getBean("purchase2");
        purchaserSec.purchaseBread();
        PurchaserThir purchaserThir =(PurchaserThir) context.getBean("purchase3");
        purchaserThir.purchaseBread();
    }
}
