package com.ati.pune.demo;
//*
//**
//***
//****
//*****



public class Star1 {

	public static void main(String[] args) 
	{
		String str="******";
		String[] a = str.split("");
		StringBuilder ssb=new StringBuilder();
		for(int i=str.length()-1;i>0;i--) 
		{
			ssb.append(a[i]);
			System.out.println(ssb.reverse());
			ssb.reverse();

		}
		System.out.println();
		
	}

}
