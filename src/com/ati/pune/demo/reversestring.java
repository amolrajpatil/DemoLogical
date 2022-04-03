
package com.ati.pune.demo;

public class reversestring
{
	public static void main(String[] args)
	{

	String str="my name is amol";
	String[]str2=str.split("");
	for(int i=str.length()-1;i>=0;i--)
	{
	  System.out.print(str2[i]);

	}

}
}