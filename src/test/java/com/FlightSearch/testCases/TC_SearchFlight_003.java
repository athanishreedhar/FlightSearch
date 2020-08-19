package com.FlightSearch.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.FlightSearch.pageObjects.FlightDetails;
import com.FlightSearch.pageObjects.SearchFlightPage;

public class TC_SearchFlight_003 extends BaseClass
{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		int DapartFlightcounter=0;
		int ReturnFlightcounter=0;
		SearchFlightPage SearchFlight = new SearchFlightPage(driver);
		FlightDetails flights = new FlightDetails(driver);
		SearchFlight.click_Flight();
		SearchFlight.click_RoundTrip();
		SearchFlight.enter_FromCityName("");
		SearchFlight.enter_ToCityName("");
		SearchFlight.enter_DepatureDate("");
		SearchFlight.enter_ReturnDate("");
		SearchFlight.click_SearchFlight();
		
		int departFlightsCount = flights.getllDepartFlights();
		int returnFlightsCount = flights.getllReturnFlights();
		
		for(int i =0;i<=departFlightsCount;i++) {
			int flightfare = Integer.parseInt(driver.findElement(By.xpath("//body/div[@id='root']/div/main//div[1]/div[1]/div[1]/div["+i+"]/div[1]/div[2]/div[3]")).getText());
			if (flightfare <= 5000) {
				DapartFlightcounter++;
			}
		}
		
		System.out.println("The Number of Departing flights fare which is less than RS 5000 is"+DapartFlightcounter);
		
		
		for(int i =0;i<=returnFlightsCount;i++) {
			int flightfare = Integer.parseInt(driver.findElement(By.xpath("//body/div[@id='root']/div/main//div[2]/div[1]/div[1]/div["+i+"]/div[1]/div[2]/div[3]")).getText());
			if (flightfare <= 5000) {
				ReturnFlightcounter++;
			}
		}
		
		System.out.println("The Number of Returning flights fare which is less than RS 5000 is"+ReturnFlightcounter);
		
	}
}
