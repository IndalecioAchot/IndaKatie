package com.qa;

public class InvalidLocationException extends Exception {

    public InvalidLocationException (){
        super("Your name contains a number");
    }
    public InvalidLocationException (String error){
        super("Error"+ error);
    }


}
