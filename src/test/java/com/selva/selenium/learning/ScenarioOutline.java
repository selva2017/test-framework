package com.selva.selenium.learning;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ScenarioOutline {

	@Given("^I open my application$")
	public void i_open_my_application() throws Throwable {
		System.out.println("Opened...");
	}

	@When("^I login with following credentials$")
	public void i_login_with_following_credentials(DataTable dt) {
		List<String> list = dt.asList(String.class);
		System.out.println("Username - " + list.get(0));
		System.out.println("Password - " + list.get(1));
	}

	@Given("^I open Facebook URL$")
	public void i_open_Facebook_URL() {
		System.out.println("Logged in...");

	}

	@Given("^fill up the new account form with the following data$")
	public void fill_up_the_new_account_form_with_the_following_data(DataTable dt) {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		System.out.println(list.get(0).get("First Name"));
		System.out.println(list.get(0).get("Last Name"));
		System.out.println(list.get(0).get("Phone No"));
		System.out.println(list.get(0).get("DOB Day"));
		System.out.println(list.get(0).get("DOB Month"));
		System.out.println(list.get(0).get("DOB Year"));
	}
	@Given("^I open Facebook URL and create new accounts with below data$")
	public void i_open_Facebook_URL_and_create_new_accounts_with_below_data(DataTable dt) {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).get("First Name"));
			System.out.println(list.get(i).get("Last Name"));
			System.out.println(list.get(i).get("Phone No"));
			System.out.println(list.get(i).get("DOB Day"));
			System.out.println(list.get(i).get("DOB Month"));
			System.out.println(list.get(i).get("DOB Year"));
		}	
	}
}