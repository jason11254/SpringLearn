/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.selfpractice.controller;

import ch03springBean.selfpractice.service.Purchase;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 *
 * @author jason
 */
@Controller()
public class PurchaseWeb {
    @Resource(name = "purchaser")
    private Purchase purchase;
    @Resource(name = "purchaser2")
    private Purchase purchase2;
    @Resource(name = "purchaser3")
    private Purchase purchase3;
    
    public void BuyTheBread(){
        purchase.purchase();
        purchase2.purchase();
        purchase3.purchase();
        System.out.println("共有這些人賣麵包");
    }
}
