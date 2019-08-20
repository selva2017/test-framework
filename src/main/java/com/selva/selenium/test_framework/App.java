package com.selva.selenium.test_framework;

import java.util.regex.Pattern;

public class App 
{
	public static void main( String[] args )
	{
		//		int arr[]=new int[3];
		//		arr[0]=90;
		//		arr[2]=9;
		//		OR
		String str = "";
//		StringBuilder str1 = "123";
//		str1.reverse();
		int arr[]={100,2,3,60,90,100};
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
			if(min>arr[i]){
				min=arr[i];
			}
		else if(max<arr[i]){
			max=arr[i];
		}
		System.out.println("Min - "+min);
		System.out.println("Max - "+max);
		//Reg exp
		System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
		
	}

}
