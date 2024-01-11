package com.java.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

	public static void main(String[] args) {
		
		//First
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");  
		boolean b = m.matches();  		  		
		boolean b2=Pattern.compile(".s").matcher("as").matches();  		
		boolean b3 = Pattern.matches(".s", "as");  
		System.out.println(b+" "+b2+" "+b3);  
		
		//Second
		System.out.println(Pattern.compile("[abc]+").matcher("abcabcabc").matches());
		System.out.println(Pattern.compile("/w").matcher("abcabcabc").groupCount());

	}

}
