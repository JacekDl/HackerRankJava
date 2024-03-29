package exercises;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


//https://www.hackerrank.com/challenges/30-regex-patterns/problem
public class RegExPatternsAndIntroToDatabases {

	public static final String regularExpression = "[a-z.]+@gmail.com";

    public static void main(String[] args) {
    	
    	List<String> firstNames = new ArrayList<String>();
    	
    	String[] input = new String[30];
    	input[0] = "riya riya@gmail.com";
    	input[1] = "julia julia@julia.me";
    	input[2] = "julia sjulia@gmail.com";
    	input[3] = "julia julia@gmail.com";
    	input[4] = "samantha samantha@gmail.com";
    	input[5] = "tanya tanya@gmail.com";
    	input[6] = "riya ariya@gmail.com";
    	input[7] = "julia bjulia@julia.me";
    	input[8] = "julia csjulia@gmail.com";
    	input[9] = "julia djulia@gmail.com";
    	input[10] = "samantha esamantha@gmail.com";
    	input[11] = "tanya ftanya@gmail.com";
    	input[12] = "riya riya@live.com";
    	input[13] = "julia julia@live.com";
    	input[14] = "julia sjulia@live.com";
    	input[15]= "julia julia@live.com";
    	input[16] = "samantha samantha@live.com";
    	input[17] = "tanya tanya@live.com";
    	input[18] = "riya ariya@live.com";
    	input[19] = "julia bjulia@live.com";
    	input[20] = "julia csjulia@live.com";
    	input[21] = "julia djulia@live.com";
    	input[22] = "samantha esamantha@live.com";
    	input[23] = "tanya ftanya@live.com";
    	input[24] = "riya gmail@riya.com";
    	input[25] = "priya priya@gmail.com";
    	input[26] = "preeti preeti@gmail.com";
    	input[27] = "alice alice@alicegmail.com";
    	input[28] = "alice alice@gmail.com";
    	input[29] = "alice gmail.alice@gmail.com";
    	
    	for(String line : input) {
    		String[] splitLine = line.split(" ");
    		
    		if(splitLine[1].matches(regularExpression)) {
        		firstNames.add(splitLine[0]);
        	}
    	}
    	
    	firstNames.sort(String.CASE_INSENSITIVE_ORDER);
    	for(String name : firstNames) {
    		System.out.println(name);
    	}
    }
}

