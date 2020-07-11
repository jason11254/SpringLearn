/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04springAop.bookExample.aspect;

/**
建立多個通知 增強處理方法
 */
public class MyAspect {
    public void check(){
        System.out.println("模擬權限控制");
    }
    public void except(){
        System.out.println("模擬異常處理");
    }
    public void log(){
        System.out.println("模擬日誌紀錄");
    }
    public void monitor(){
        System.out.println("性能監測");
    }
}
