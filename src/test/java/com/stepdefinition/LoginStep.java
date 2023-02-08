package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.base.BaseClass;
import com.endpoints.Endpoints;
import com.pojo.Get_Output;
import com.pojo.IdInput;
import com.pojo.IdOutput;
import com.pojo.Post_Input;
import com.pojo.Post_Output;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class LoginStep extends BaseClass {

	Response response;

	@Given("User add header")
	public void userAddHeader() {

		// addHeader("accept", "application/json");

	}

	@When("User send {string} request for login endpoint")
	public void userSendRequestForLoginEndpoint(String get) {
		// response = requestMethodType(get, Endpoints.GETUSERNAME);

	}

	@Then("User verify the login response body first_name present as {string}")
	public void userVerifyTheLoginResponseBodyFirstNamePresentAs(String string) {
		Get_Output getOutput = response.as(Get_Output.class);
		String firstName = getOutput.getFirstName();
		System.out.println(firstName);
		Assert.assertEquals("name", string, firstName);
	}

	@Given("User add headers")
	public void userAddHeaders() {
		List<Header> h = new ArrayList<>();
		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");
		h.add(h1);
		h.add(h2);
		Headers headers = new Headers(h);
		addHeaders(headers);

	}

	@When("User add request body {string}, {string},{string},{string}, {string},{string},{string} and {string}")
	public void userAddRequestBodyAnd(String id, String username, String firstname, String lastname, String email,
			String password, String phone, String userstatus) {
		Post_Input post_Input = new Post_Input(Integer.valueOf(id), username, firstname, lastname, email, password,
				phone, Integer.valueOf(userstatus));
		addBodyObject(post_Input);

	}

	@When("User send {string} request for create endpoint")
	public void userSendRequestForCreateEndpoint(String post) {
		response = requestMethodType(post, Endpoints.POSTINPUT);

	}

	@Then("User verify the message {string}")
	public void userVerifyTheMessage(String expected) {

		Post_Output post_Output = response.as(Post_Output.class);
		String message = post_Output.getType();
		Assert.assertEquals("verify", expected, message);

	}

	@When("User add request body {string}, {string}, {string}, {string}, {string} and {string}")
	public void userAddRequestBodyAnd(String id, String petId, String quantity, String shipDate, String status,
			String complete) {

		IdInput idInput = new IdInput(id, petId, quantity, shipDate, status, complete);
		addBodyObject(idInput);
	}

	@When("User send {string} request for id endpoint")
	public void userSendRequestForIdEndpoint(String post) {
		response = requestMethodType(post, Endpoints.POSTORDER);

	}
	

	@Then("User verify the message orderplaced {string}")
	public void userVerifyTheMessageOrderplaced(String expected) {
		
		IdOutput idOutput = response.as(IdOutput.class);
		
		String quantity = idOutput.getQuantity();
		
		Assert.assertEquals("verify", expected, quantity);
		
		
		
	    
	}




}
