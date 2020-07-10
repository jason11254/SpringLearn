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
public class BeanStaticFactory {
    private static BeanClass beanInstance = new BeanClass("調用靜態工廠方法實體化Bean");
    
    public static BeanClass createInstance(){
        return beanInstance;
    }
}
