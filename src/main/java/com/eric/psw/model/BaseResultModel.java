package com.eric.psw.model;

/**
 * Created by eric on 15-8-31.
 */
public class BaseResultModel{
    private String code;
    private String message;
    private Object value;
    private String redirect ;

    public BaseResultModel(){
        this("200", "ok", "", "#");
    }

    public BaseResultModel( Object _value ){
        this("200", "ok", _value, "#");
    }

    public BaseResultModel(String _code, String _message, Object _value, String _redirect){
        this.code = _code;
        this.message = _message;
        this.value = _value;
        this.redirect = _redirect;
    }

    public String getCode(){
        return code;
    }

    public void setCode( String code ){
        this.code = code;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage( String message ){
        this.message = message;
    }

    public Object getValue(){
        return value;
    }

    public void setValue( Object value ){
        this.value = value;
    }

    public String getRedirect(){
        return redirect;
    }

    public void setRedirect( String redirect ){
        this.redirect = redirect;
    }
}
