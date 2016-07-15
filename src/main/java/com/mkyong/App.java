package com.mkyong;

import java.util.UUID;

/**
 * Generate a unique number
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
    }
    
    public String generateUniqueKey(){
    	
    	String id = UUID.randomUUID().toString();
    	return id;
    	
    }
    
    public String test(){
        String aString = "bob";
        aString.replace('b', 'p');
        if(aString.equals("pop"))
            return aString;
        return "";
    }
}
