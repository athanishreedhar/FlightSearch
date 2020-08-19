package com.FlightSearch.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FlightSearch.testCases.BaseClass;

public class SearchFlightPage {

	WebDriver ldriver;
	
	public SearchFlightPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/section[@id='Home']/div/aside/nav/ul[1]/li[1]/a[1]")
	WebElement lnk_Flight;
	
	@FindBy(xpath="//input[@id='RoundTrip']")
	WebElement rad_Roundtrip;
	
	
	@FindBy(xpath="//input[@id='FromTag']")
	WebElement txt_FromCity;
	
	@FindBy(xpath="//input[@id='ToTag']")
	WebElement txt_ToCity;
	
	
	
	@FindBy(xpath="//input[@id='DepartDate']")
	WebElement txtTab_Departuredate;
	
	@FindBy(xpath="//input[@id='ReturnDate']")
	WebElement txtTab_Returndate;
	
	
	@FindBy(xpath="//input[@id='SearchBtn']")
	WebElement btn_SearchFlight;
	
	
	public void click_Flight() {
		lnk_Flight.click();
		
	}
	
	public void click_RoundTrip() {
		rad_Roundtrip.click();
		
	}
	public void enter_FromCityName(String FromCity) {
		txt_FromCity.sendKeys(FromCity);
	}
	
	public void enter_ToCityName(String ToCity) {
		txt_FromCity.sendKeys(ToCity);
	}
	
	
	public void enter_DepatureDate(String DepartureDate) {
		txtTab_Departuredate.sendKeys(DepartureDate);
	}
	
	public void enter_ReturnDate(String ReturnDate) {
		txtTab_Departuredate.sendKeys(ReturnDate);
	}
	
	public void click_SearchFlight() {
		btn_SearchFlight.click();
		
	}
	
	
}
