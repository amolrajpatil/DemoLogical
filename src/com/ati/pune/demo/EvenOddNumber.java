package com.ati.pune.demo;

public class EvenOddNumber {

	public static void main(String[] args) 
	{
		int[]a= {1,2,3,4,5,6,7,8,9,10,11,122,13,14,15};
		
		for(int i=0;i<=a.length;i=+2)
		{
			System.out.println("Even number"+a[i]+",");
		}
		for(int j=2;j<=a.length;j=+2)
		{
			System.out.println("Odd Number"+a[j]+",");
		}

	}

}
