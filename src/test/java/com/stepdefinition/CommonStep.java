package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;

import io.cucumber.java.en.Then;

public class CommonStep extends BaseClass {
	
	
	
	@Then("User verify the status code is {int}")
	public void userVerifyTheStatusCodeIs(int status) {
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals("verify",status,statusCode);
	}
	

	
	

}
