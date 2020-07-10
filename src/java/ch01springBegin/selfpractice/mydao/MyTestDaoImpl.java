/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch01springBegin.selfpractice.mydao;

/**
 *
 * @author jason
 */
public class MyTestDaoImpl implements MyTestDao{

    @Override
    public void sayHi() {
        System.out.println("Hi, you");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye, you");
    }
    
}
