package com.selva.selenium.test_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class CoreJavaPrograms1 {
	static String strGlobal = null;
	public static void main(String[] args) {
				reverseStringBuilder();
//				reverseStringWithoutFunctions();
		//		getFromCMDLine();
//				getFromCMDStoreInVariable();
		//		swapTwoNumbers();
		//		countNumberOfWords();
		//		hashWhileAdvFor();
//		isPrimeNumber();
//		fibonacciSeries();
	}

	private static void reverseStringBuilder(){
		//Reverse string using Stringbuilder
		String string = "madam";
		StringBuilder strBuilder = new StringBuilder();
		StringBuilder strBuilder2 = new StringBuilder();
		strBuilder.append(string);
//		strBuilder = strBuilder.toString();
//		strBuilder2.append(string);
		String str= strBuilder.reverse().toString();
		System.out.println(strBuilder);
		System.out.println(strBuilder2);
		if(str.equals(string))
			System.out.println("Match");
		else
			System.out.println("Not...");
	}

	private static void reverseStringWithoutFunctions(){
		String str = "I am Selva";
		char ch[] = str.toCharArray();

		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
	}
	private static void getFromCMDLine(){
		String str = null;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		str = in.nextLine();
		String strReverse[] = str.split("");
		for (int i=strReverse.length-1;i>=0;i--){
			System.out.print(strReverse[i]);
		}
	}
	private static void getFromCMDStoreInVariable(){
		String original,reversed="";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String:");
		original = in.nextLine();
		for(int i=original.length()-1;i>=0;i--){
			reversed=reversed+original.charAt(i);
		}
		System.out.println(reversed);
		if(original.equals(reversed)) 
			System.out.println("Equals");
		else
			System.out.println("Not equal");
	}

	private static void swapTwoNumbers(){
		Scanner in =new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int x= in.nextInt();
		int y=in.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("New x = "+ x + "New y = "+ y);
	}

	private static void countNumberOfWords(){
		strGlobal="Hi I am here";
		String[] words = strGlobal.split(" ");
		System.out.println(words.length);
	}

	private static void hashWhileAdvFor(){
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "Selva");
		map.put("2","Saul");
		map.put("3","AVS");
		Set<String> coutn = map.keySet();
		for (String s: coutn){
			System.out.println(map.get(s));
		}
		//		Iterator<String> it = coutn.iterator();
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry me = (Map.Entry) it.next();
			//			System.out.println(it.next());
			System.out.println(me.getKey()+" " + me.getValue());		}
	}

	private static void isPrimeNumber(){
		Integer num = 11;
		Boolean bool = false;

		if(num%2 == 0){
			bool = true;
		}
		if(bool) System.out.println("Prime");
		else System.out.println("Not Priem");
	}
	
	private static void fibonacciSeries(){
		int times =9;
		int a=0,b=0,c=1;
		for (int i=0;i<=times;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.println(a + " ");
		}
	}
}
