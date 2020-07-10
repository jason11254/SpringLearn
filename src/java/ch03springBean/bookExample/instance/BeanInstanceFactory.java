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
public class BeanInstanceFactory {
    public BeanClass createBeanClassInstance(){
        return new BeanClass("調用實體工廠方法實體化Bean");
    }
}
