/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04springAop.bookExample.dynamic.cglib;

/**
 *
 * @author jason
 */
public class TestDao {
    public void save(){
        System.out.println("保存");
    }
    public void modify(){
        System.out.println("修改");
    }
    public void delete(){
        System.out.println("刪除");
    }
}
