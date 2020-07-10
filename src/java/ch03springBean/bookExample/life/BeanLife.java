/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.bookExample.life;

/**
 *
 * @author jason
 */
public class BeanLife {
    public void initMyself(){
        System.out.println(this.getClass().getName()+"執行Bean自訂義的初始化方法");
    }
    public void destroyMyself(){
        System.out.println(this.getClass().getName()+"執行Bean自訂義的銷毀方法");
    }
}
