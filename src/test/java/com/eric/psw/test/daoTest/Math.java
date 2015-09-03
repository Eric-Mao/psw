package com.eric.psw.test.daoTest;

import com.eric.psw.service.MainPageService;

/**
 * Created by eric on 15-8-30.
 */
public class Math {
    public static void main(String[] args){
        PrintName printName = new PrintName();
        printName.count = 20;
        printName.sleepTime = 300;
        new Thread(printName).start();

    }
}

class PrintName implements Runnable{
    public int count  = 0;
    public int sleepTime = 0;

    public void run() {
        while(count-- > 0){
            System.out.println(Thread.currentThread().getName() + "  count: " + count);
            try {
                Thread.currentThread().sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
