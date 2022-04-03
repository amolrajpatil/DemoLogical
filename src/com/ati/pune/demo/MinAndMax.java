package com.ati.pune.demo;

import java.util.Arrays;
import java.util.Collections;

public class MinAndMax
{

	public static void main(String[] args)
	{  
		
		Integer []a= {10,20,30,40,50,60,70,80};
		
		int min=Collections.min(Arrays.asList(a));
		int max=Collections.max(Arrays.asList(a));
		System.out.println("minimum number of array"+min);
		System.out.println("maximum number of array"+max);
	}
}