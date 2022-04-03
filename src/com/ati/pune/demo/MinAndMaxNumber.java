package com.ati.pune.demo;

import java.util.Arrays;
import java.util.Collections;

public class MinAndMaxNumber
{
	public static void main(String[] args)
	{
		Integer[]a
		= {10,20,30,40,50,60,70,80};
		int min=Collections.min(Arrays.asList(a));
		int max=Collections.max(Arrays.asList(a));
		System.out.println("minimum values of array"+min);
		System.out.println("maximum values of aaray"+max);
	}

}
