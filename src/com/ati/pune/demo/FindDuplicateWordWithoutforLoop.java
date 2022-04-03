package com.ati.pune.demo;

import java.util.HashSet;

public class FindDuplicateWordWithoutforLoop {

	public static void main(String[] args)
	{
		String []str= {"amol","abhijeet","shweta","amol","nilam","shweta"};
		
		HashSet<String> set = new HashSet<String>();
		for (String st : str) 
		{
			
			if(set.add(st)==false)
			{
				System.out.println("duplicate element="+st);
			}
		}

	}

}
