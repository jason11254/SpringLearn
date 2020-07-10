/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02springIoC.selfpractice.service;

import ch02springIoC.selfpractice.dao.Bread;

/**
 *
 * @author jason
 */
public class PurchaserSec implements Purchase{
    private Bread bread;
    
    public void setBread(Bread bread){
        this.bread=bread;
    }

    @Override
    public void purchaseBread() {
        bread.LongBread();
        bread.greenBeanBread();
        bread.redBeanBread();
        System.out.println("我也代購了這些麵包!");
    }
    
    
}
