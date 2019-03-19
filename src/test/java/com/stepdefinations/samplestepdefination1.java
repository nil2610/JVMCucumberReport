package com.stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class samplestepdefination1{
	
	@Given("^This is precondition steps$")
	public void this_is_precondition_steps() throws Throwable {
		System.out.println("This is preconditions steps");
	}

	@Then("^first step$")
	public void first_step() throws Throwable {
		System.out.println("First Step");
	}

	@Then("^sencond step$")
	public void sencond_step() throws Throwable {
		System.out.println("Second Step");
	}

	@Then("^third step$")
	public void third_step() throws Throwable {
		System.out.println("Third Step");
	}

	@Then("^third step change$")
	public void third_step_change() throws Throwable {
		System.out.println("Third Step Change");
	}
	
	@Then("^third step change2$")
	public void third_step_change2() throws Throwable {
		System.out.println("Third Step Change2");
	}

}
