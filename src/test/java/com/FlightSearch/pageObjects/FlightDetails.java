package com.FlightSearch.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FlightDetails {
	
WebDriver ldriver;
	
	public FlightDetails(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	

	@FindBy(xpath="//body/div[@id='root']/div/main//div[1]/div[1]/div[1]/div")
	List<WebElement> tab_DepartingFlights;
	@FindBy(xpath="//body/div[@id='root']/div/main//div[2]/div[1]/div[1]/div")
	List<WebElement> tab_ReturnFlights;
	

	public int getllDepartFlights() {
	    return	tab_DepartingFlights.size();
	}
	
	public int getllReturnFlights() {
	    return	tab_ReturnFlights.size();
	}

}
