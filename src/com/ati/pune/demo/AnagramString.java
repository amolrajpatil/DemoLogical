package com.ati.pune.demo;

import java.util.Arrays;

public class AnagramString 
{
	public static void main(String[] args) 
	
	{
		String str="care";
		String str2="race";
		
		if(str.length()==str2.length())
		{
			char[] A=str.toCharArray();
			char[] B=str2.toCharArray();
			Arrays.sort(A);
			Arrays.sort(B);
			boolean result = Arrays.equals(A,B);
			System.out.println(result);
			if(result)
			{
		        System.out.println("string is Anagram");		
			}
			else
			{
				System.out.println("string is not Anagram string");
			}
		
		}
		
	}

}
