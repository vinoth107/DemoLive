package com.StepDefination;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\VINOTH KUMAR\\eclipse-workspace\\CucumberLiveDomo\\src\\test\\resources\\Feature\\BookingAFlight\\BookingAFlight.feature",
glue = { "com.StepDefination" })
	
public class TestRunner {

}
