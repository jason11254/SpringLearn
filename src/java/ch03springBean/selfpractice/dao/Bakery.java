/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.selfpractice.dao;

import org.springframework.stereotype.Repository;

/**
 *
 * @author jason
 */
@Repository("bread")
public class Bakery implements Bread{

    @Override
    public void redBean() {
        System.out.println("硂琌ě难");
    }

    @Override
    public void greenBean() {
        System.out.println("硂琌厚ě难");
    }

    @Override
    public void suger() {
        System.out.println("硂琌并难");
    }

    @Override
    public void milk() {
        System.out.println("硂琌イ难");
    }
    
}
