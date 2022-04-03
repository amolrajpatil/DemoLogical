package com.ati.pune.demo;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String a="kayak";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);
		if(a.equals(b))
		{
			System.out.println("String is a palindrome");
		}
		else
		{
			System.out.println("String is a not palindrome");
		}
	}

}
