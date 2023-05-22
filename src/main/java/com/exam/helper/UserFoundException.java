package com.exam.helper;

public class UserFoundException extends Exception{
    public UserFoundException(){
        super("User with username is already present the records");
    }
    public UserFoundException(String msg){
        super(msg);
    }
}
