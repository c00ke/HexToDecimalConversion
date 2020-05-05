import java.util.Scanner;
/* Level 2, Task 17, Compulsory Task 2
 * Estine van der Berg, 15 April 2020
 * This program implements the hexToDecimal(String hexString) method, 
 * which converts a hex string into a decimal number.
 * It will implement the hexToDecimal method to throw a NumberFormatException 
 * if the string is not a hex string.
 */

public class HexToDecimalConversion {
	/** Main method */
    public static void main (String [] args) {
    	Scanner input = new Scanner (System.in);
    
    	// Prompt the user to enter a string
    	
    	// Create a try/Catch to handle the NumberFormatException when user inputs hex number
    	try {
    		System.out.print("Enter a hex number: ");
    		String hex = input.nextLine();
    		System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
    	}
    	catch (NumberFormatException ex) {
    		System.out.println("Not a hexadecimal number"); 
    	}

    }
  
    public static int hexToDecimal (String hex){
    	
    	int decimalValue = 0;
    
    	for (int i = 0 ; i < hex.length (); i ++) {
    		char hexChar = hex.charAt (i);
    		decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
    	}
    	return decimalValue;
    }
    
    public static int hexCharToDecimal (char ch) {
    	if (ch >= 'A' && ch <= 'F')
    		return 10 + ch - 'A';
    	
    	else if ((ch >='0') && (ch <= '9')) // ch is '0', '1', ..., or '9'
    		return ch - '0' ;
    	// Throw the NumberFormatException if the input does not match the above conditions
    	else {
    		throw new NumberFormatException ("Not a hexadecimal number");
    	}
    }
}