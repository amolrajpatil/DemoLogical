package com.ati.pune.demo;

import java.util.HashSet;

public class FindDupicateNumberInArray {

	public static void main(String[] args)
	{
Integer []number= {10,20,30,10,40,50,60,40,90,50};
		
		HashSet<Integer> set = new HashSet<Integer>();
		for (Integer st : number) 
		{
			if(set.add(st)==false)
			{
				System.out.println("duplicate element="+st);
			}
		}

	}

}
