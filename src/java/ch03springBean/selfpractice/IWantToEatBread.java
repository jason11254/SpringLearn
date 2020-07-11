/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.selfpractice;

import ch03springBean.selfpractice.controller.PurchaseWeb;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jason
 */
public class IWantToEatBread {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("ch03springBean\\selfpractice\\applicationContext.xml");
        PurchaseWeb pw = (PurchaseWeb) context.getBean("purchaseWeb");
        pw.BuyTheBread();

    }
}
