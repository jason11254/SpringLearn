/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.bookExample.instance;

/**
 *
 * @author jason
 */
public class BeanClass {
    public String message;

    public BeanClass() {
        message = "建構子實體化為Bean";
    }

    public BeanClass(String message) {
        this.message = message;
    }
    
}
