/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02springIoC.ch01bookExample.dao;

/**
 *
 * @author jason
 */
public class TestDaoImpl implements TestDao{

    @Override
    public void sayHello() {
        System.out.println("Hello, spring study!");
    }
    
}
