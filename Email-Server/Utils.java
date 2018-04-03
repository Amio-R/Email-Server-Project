import java.io.*;
import hsa.*;
public class Utils{
    public static String generateRandomCode(int len){
	String num = "";
	for(int i = 0; i < len; i++){
	    num = num + ((int) (Math.random() * 10));
	}
	return num;
    }
    
    public static boolean isANumber(String s){
	int count = 0;
	boolean isNumber = true;
	for(int i = 0; i< s.length(); i++){
	    if(Character.isDigit(s.charAt(i))){
		isNumber = true;            
	    }
	    else{
		count = 1;
	    }
	}
	if(count > 0){
	    isNumber = false;
	}
	return isNumber;
    }
    
    public static String leftPad(String text, int desiredLength, char paddingItem){
	String padding = "";
	for(int i = 0; i < desiredLength - text.length(); i ++){
	    padding = padding + paddingItem;
	}
	padding = padding + text;
	return padding;
    }
    
    public static String removeChars(String text, char c){
	String text1 = "";
	for(int i = 0; i < text.length(); i++){
	    if(text.charAt(i) == c){ 
	    }
	    else{    
		text1 = text1 + text.charAt(i);
	    }
	}
	return text1;
    }
    
    public static void delay(int ms){
	try{
	    Thread.sleep(ms);
	}
	catch(InterruptedException ex){
	    Thread.currentThread().interrupt();
	    System.out.println("Process error in delay method.");
	}
    }
    
    public static void main(String [] args){
	//Stdout.println(generateRandomCode(3));
	//Stdout.println(isANumber("893434342"));
	//Stdout.println(leftPad("AS", 1, '*'));
	Stdout.println(removeChars("ALLLO", 'l'));
    }
}
