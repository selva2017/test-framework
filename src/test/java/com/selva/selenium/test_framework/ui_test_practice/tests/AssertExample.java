package com.selva.selenium.test_framework.ui_test_practice.tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssertExample {
@Test
	public void TestAssert(){
		// TODO Auto-generated method stub
		String str = "My name is Selva";
		String str1 = "90";
//		Verify.verify(false);
		Integer x = Integer.parseInt(str1);
		System.out.println(x);
		Assert.assertTrue(x>1000);
		Assert.assertTrue(str.contains("Selva"));
	}
}