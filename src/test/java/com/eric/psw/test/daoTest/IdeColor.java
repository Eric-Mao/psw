package com.eric.psw.test.daoTest;

import sun.util.locale.StringTokenIterator;

interface ColorTest{
    void doNothing(String str);
}
/**
 * Created by eric on 15-8-30.
 */
public class IdeColor implements ColorTest{
    private String str = new String("String");
    private final static int FINAL_CONSTANT = 54;
    private static int CONSTANT = 60;
    public IdeColor(){
        IdeColor.CONSTANT = 45;
    }
    /*Block Comment*/
    public void doNothing(String str) {
        String ss = "What the hall"; //line comment
        IdeColor obj = new IdeColor();
        obj.setStr(ss);
        System.out.println(IdeColor.FINAL_CONSTANT + " " + str);
    }
    public void saying(){}
    public static void staticSaying(){}
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }
    public static int getCONSTANT() {
        return CONSTANT;
    }
    public static void main(String[] args){
        int a=-67,b=116,c=78;
        int d = ~a | b&c;
        System.out.println(d);
    }
}


class TestColor{
    public ColorTest color = new IdeColor();
    private void test(){
        IdeColor.getCONSTANT();
        color.doNothing("HeHe");
        ((IdeColor)color).saying();
        IdeColor.staticSaying();
    }
}
