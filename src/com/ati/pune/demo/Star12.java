package com.ati.pune.demo;
//         *
//        **
//       ***
//      ****
//     *****
//    ******
//   *******
//  ********
// *********
//**********

public class Star12 
{

	public static void main(String[] args)
	{

		for(int i=1;i<=10;i++)
		{
			for(int j=9;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

//		     * 
//	        * * 
//	       * * * 
//	      * * * * 
//	     * * * * * 
//	    * * * * * * 
//	   * * * * * * * 
//	  * * * * * * * * 
//	 * * * * * * * * * 
//	* * * * * * * * * * 


		for(int i=1;i<=10;i++)
		{
			for(int j=9;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
