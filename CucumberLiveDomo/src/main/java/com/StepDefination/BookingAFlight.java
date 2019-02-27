package com.StepDefination;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.support.ui.Select;

import com.ObjectRepository.Homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class BookingAFlight {
 
@Given("The User is in Delta homepage")
public void the_User_is_in_Delta_homepage() {
   
   Hook.driver.get("https://www.delta.com/apac/en");
}

@When("The user enters source and destination")
public void the_user_enters_source_and_destination(io.cucumber.datatable.DataTable dataTable) throws AWTException {
   List<String> des=dataTable.asList();
   Homepage homepage1 = new Homepage();
   homepage1.getClick_orgin().click();
   homepage1.getOrgin().sendKeys(des.get(0));
   Robot r = new Robot();
   r.keyPress(KeyEvent.VK_DOWN);
   r.keyRelease(KeyEvent.VK_DOWN);
   r.keyPress(KeyEvent.VK_ENTER);
   r.keyRelease(KeyEvent.VK_ENTER);
  
   homepage1.getClick_desc().click();
   homepage1.getDesc().sendKeys(des.get(1));
   Robot r1 = new Robot();
   r1.keyPress(KeyEvent.VK_DOWN);
   r1.keyRelease(KeyEvent.VK_DOWN);
   r1.keyPress(KeyEvent.VK_ENTER);
   r1.keyRelease(KeyEvent.VK_ENTER);
}

@When("The user select oneway trip")
public void the_user_select_oneway_trip() {
	 Homepage homepage2 = new Homepage();
  Select dropdown = new Select(homepage2.getDropdown());
  dropdown.selectByVisibleText("One Way");
}

@When("The user select date from Web calendar {string}")
public void the_user_select_date_from_Web_calendar(String string) {
	 Homepage homepage3 = new Homepage();
	 homepage3.getDesc_date().click();
     homepage3.getDate().click();
}

@When("The user clicks submit button")
public void the_user_clicks_submit_button() {
	 Homepage homepage4 = new Homepage();
	 homepage4.getSumbit().click();
}

@Then("The user should be in search results page")
public void the_user_should_be_in_search_results_page() {
	
	Homepage homepage5 = new Homepage();
   Assert.assertEquals("Book A Flight", homepage5.getSreachresult().getText());
}
}
