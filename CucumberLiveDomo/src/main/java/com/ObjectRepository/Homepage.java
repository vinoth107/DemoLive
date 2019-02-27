package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.StepDefination.Hook;

public class Homepage {

	public Homepage(){
		PageFactory.initElements(Hook.driver,this);
	}

	
@FindBy(xpath="//span[@class='airport-code d-block']")
private WebElement click_orgin;

@FindBy(xpath="//*[@id=\\\"search_input\\\"]")
private WebElement orgin;

@FindBy(xpath="//span[@class='airport-desc']")
private WebElement click_desc;

@FindBy(xpath="//*[@id=\\\"search_input\\\"]")
private WebElement desc;

@FindBy(xpath="span[@class='select-ui-icon icon-Dropdown-caret']")
private WebElement dropdown;

@FindBy(id="input_departureDate_1")
private WebElement desc_date;

@FindBy(xpath="//a[@class='dl-state-default']")
private WebElement date;

@FindBy(id="btn-book-submit")
private WebElement sumbit;

@FindBy(xpath="//*[@id=\\\"maincontent\\\"]/div[1]/div/h1")
private WebElement sreachresult;

public WebElement getClick_orgin() {
	return click_orgin;
}

public WebElement getOrgin() {
	return orgin;
}

public WebElement getClick_desc() {
	return click_desc;
}

public WebElement getDesc() {
	return desc;
}

public WebElement getDropdown() {
	return dropdown;
}

public WebElement getDesc_date() {
	return desc_date;
}

public WebElement getDate() {
	return date;
}

public WebElement getSumbit() {
	return sumbit;
}

public WebElement getSreachresult() {
	return sreachresult;
}

}	

