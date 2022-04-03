package com.ati.pune.demo;


public class Primenumber2 {

	public static void main(String[] args)
	{
		int a=1;
		int b=100;
		
		for(int i=a;i<=b;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(+i+"");
			}
		}

	}

}
