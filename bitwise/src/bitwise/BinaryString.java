/*
 * Copyright 2017 Lassaad 
 */

package bitwise;

/**
 * @author lassaad
 */

public class BinaryString {
BinaryString(String string, Integer integer){
        String binaryInteger = Integer.toBinaryString(integer);
        
        for( byte b : string.getBytes() ){
            // Perform a bitwise operation using byte and integer operands, save result as tmp:
            int tmp = b & integer; 
            System.out.println( Integer.toBinaryString(b) + " OR " + Integer.toBinaryString(integer) 
                + " = " + Integer.toBinaryString(tmp) + " = " + tmp );
        }
    }
}
