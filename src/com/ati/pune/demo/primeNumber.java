package com.ati.pune.demo;

public class primeNumber
{
	public static void main(String[] args)
	{
		int a=20;
		int b=50;
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
				System.out.print(i+",");
			}
		}
	}

}
