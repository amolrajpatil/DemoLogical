package com.ati.pune.demo;

import java.util.Arrays;

public class PracticeAnagram
{
	public static void main(String[] args)
	{
		String str="race";
		String str2="care";

		if(str.length()==str.length())
		{
		char[]A=str.toCharArray();
		char[]B=str2.toCharArray();
		Arrays.sort(A);
		Arrays.sort(B);
		Boolean result=Arrays.equals(A,B);
		System.out.println(result);

		if(result)
		{
		  System.out.println("Anagram string");
		}
		else
		{
		   System.out.println("Not a Anagram string");
		}
		}
		
	}

}
