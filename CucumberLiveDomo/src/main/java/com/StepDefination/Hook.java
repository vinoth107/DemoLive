package com.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;
@Before

public static void Lunch () {
	   System.setProperty("webdriver.gecko.driver","C:\\Users\\VINOTH KUMAR\\eclipse-workspace\\CucumberLiveDomo\\src\\test\\resources\\Driver\\geckodriver.exe");
	   driver = new FirefoxDriver();
}
@After

public static void quit() {
	driver.quit();
}

}
