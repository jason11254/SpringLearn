/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02springIoC.selfpractice.dao;

/**
 *
 * @author jason
 */
public class Bakery implements Bread{

    @Override
    public void redBeanBread() {
        System.out.println("This is redBeanBread!");
    }

    @Override
    public void greenBeanBread() {
        System.out.println("This is greenBeanBread!");
    }

    @Override
    public void LongBread() {
        System.out.println("This is LongBread!");
    }
    
}
