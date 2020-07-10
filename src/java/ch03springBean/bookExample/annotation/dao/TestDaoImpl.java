/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.bookExample.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 *
 * @author jason
 */
@Repository("testDao")
public class TestDaoImpl implements TestDao{

    @Override
    public void save() {
        System.out.println("TestDao save");
    }
    
}
