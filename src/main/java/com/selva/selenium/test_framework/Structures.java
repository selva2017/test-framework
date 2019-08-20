package com.selva.selenium.test_framework;

public class Structures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		ifElse("name1");
		whileExample("false");
		caseExamples();
	}
	public  static void ifElse(String argument){
		if(argument.equals("name")){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
	public  static void whileExample(String argument){
		while(argument.equals("true")){
			System.out.println("True in While");
			break;
		}

		int count=0;
		do {
			System.out.println("Count is: " + count);
			count++;
		} while (count < 10);
		//		do{
		//			System.out.println("False in While");
		//			argument="false";
		//			break;
		//		} while(argument.equals("false"));
		for(int i=0;i<10;i++){
			System.out.println(i);
		}

	}
	private static void caseExamples(){
		int days = 2;
		String day = null;
		switch(days){
		case 1:
		System.out.println("Monday");
		case 2:
		System.out.println("Tuesday");
		}

	}
}
