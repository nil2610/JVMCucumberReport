package com.stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class samplestepdefination2{

	@Given("^This is precondition steps1$")
	public void this_is_precondition_steps1() throws Throwable {
		System.out.println("This is preconditions steps1");
	}

	@Then("^first step1$")
	public void first_step1() throws Throwable {
		System.out.println("First Step1");
	}

	@Then("^sencond step1$")
	public void sencond_step1() throws Throwable {
		System.out.println("Second Step1");
	}

	@Then("^third step1$")
	public void third_step() throws Throwable {
		System.out.println("Third Step1");
	}

	@Then("^third step change1$")
	public void third_step_change1() throws Throwable {
		System.out.println("Third Step Change1");
	}

	@Then("^third step change21$")
	public void third_step_change21() throws Throwable {
		System.out.println("Third Step Change21");
	}

}
