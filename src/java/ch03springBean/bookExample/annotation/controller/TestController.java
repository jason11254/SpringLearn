/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.bookExample.annotation.controller;

import ch03springBean.bookExample.annotation.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author jason
 */
@Controller
public class TestController {
    @Autowired
    private TestService testService;
    public void save(){
        testService.save();
        System.out.println("testController save");
    }
}
