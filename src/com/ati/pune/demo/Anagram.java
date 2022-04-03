package com.ati.pune.demo;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args)
	{
		String str="race";
		String str1="care";
		
		if(str.length()==str1.length())
		{
			char[] A = str.toCharArray();
			char[] B = str1.toCharArray();
			Arrays.sort(A);
			Arrays.sort(B);
			boolean result = Arrays.equals(A, B);
			System.out.println(result);
			if(result)
			{
				System.out.println("This Is Anagram");
			}
			else
			{
				System.out.println("This Is Not Anagram");
			}
		}
	}

}
