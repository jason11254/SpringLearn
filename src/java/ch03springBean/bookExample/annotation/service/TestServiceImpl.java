/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.bookExample.annotation.service;

import ch03springBean.bookExample.annotation.dao.TestDao;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author jason
 */
@Service("testService")
public class TestServiceImpl implements TestService{
    @Resource(name = "testDao")
    private TestDao testDao;
    
    @Override
    public void save() {
        testDao.save();
        System.out.println("testService save");
    }
    
}
