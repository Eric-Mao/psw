package com.eric.psw.model;

/**
 * Created by eric on 15-9-18.
 */
public enum EOptionType{

    LISTALL(0, "列表"), SEARCH(1, "查找"), ADD(2, "新增"), GET(3, "获取详细"), DEL(4, "删除");

    private int key;
    private String describe;

    EOptionType(int _key, String _describe){
        this.key = _key;
        this.describe = _describe;
    }
    public int getKey(){
        return this.key;
    }
    public String getDescribe(){
        return this.describe;
    }

    @Override
    public String toString(){
        return this.getKey() + ": " + this.getDescribe();
    }

}
