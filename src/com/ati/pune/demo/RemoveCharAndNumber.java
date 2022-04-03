package com.ati.pune.demo;

public class RemoveCharAndNumber 
{
	public static void main(String[] args)
	{
		String s="amol123mane456";
		String ch = s.replaceAll("[0-9]", "");
		System.out.println(ch);
		String number = s.replaceAll("[^0-9]","" );
		System.out.println(number);
	}

}
