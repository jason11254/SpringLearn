/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.selfpractice.service;

import ch03springBean.selfpractice.dao.Bread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jason
 */
@Service
public class Purchaser2 implements Purchase{
    
    @Autowired
    private Bread bread;
    
    @Override
    public void purchase() {
        bread.greenBean();
        bread.redBean();
        System.out.println("�ڽ�����P���ѥ]");
    }
    
}
