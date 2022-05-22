package week3.Day3;

import java.util.Arrays;

public class Lowercaseassessment {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text1 ="Stops";
		String text2 ="Potss";
		
		
		
		char[]arr= {'S','t','o','p','s'};
		char[]arr1= {'p','o','t','s','s'};
		int length =arr.length;
		int length1=arr1.length;
		if(length==length1) {
		System.out.println("true");
		}
		else  
		System.out.println("false");
		String lowercase = text1.toLowerCase();
		System.out.println(lowercase);
		
		String lowercase1 = text2.toLowerCase();
		System.out.println(lowercase1);
		
		// Lowercase = "Stops";
		char[]charArray = lowercase.toCharArray();
		Arrays.sort(charArray);
		for(int i =0;i<charArray.length;i++)  {
		System.out.println(charArray[i]);
		}
		
		//String str1 = "Potss";
		char[]charArray1 = lowercase1.toCharArray();
		Arrays.sort(charArray1);
		for(int i = 0;i<charArray1.length;i++) {
		System.out.println(charArray1[i]);
		}
		
		boolean equals = Arrays.equals(charArray, charArray1);
		if(equals==true)  {
			System.out.println("It's an Anagaram");
			
		}
		
		else {
			System.out.println("It's not an anagram");
		}
		

	}

}
