package com.motherhood.pageobjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import com.motherhood.utilities.constants;
import com.motherhood.utilities.genericmethod;

public class findadoctor 
{
	
	public void login(WebDriver driver,genericmethod genericmethods) throws InterruptedException
	{
	    genericmethods.linkclick(driver,constants.location);
		genericmethods.actionmethod(driver, constants.location);
		genericmethods.linkclick(driver,constants.bangalore);
		genericmethods.actionmethodbanloc(driver, constants.bangalore);
		genericmethods.linkclick(driver,constants.banashankari);
		genericmethods.actionmethodbanash(driver, constants.banashankari);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(4000);
		genericmethods.clickOnButton(driver, constants.selectspeciality);
		genericmethods.selectdropdown(driver, constants.selectspeciality);
		genericmethods.clickOnButton(driver, constants.doctorname);
		genericmethods.sendkeys(driver, constants.doctorname);
		genericmethods.clickOnButton(driver, constants.veiwprofile);
		genericmethods.getexperiencemethod(driver,constants.getexperience);
		genericmethods.getunitmethod(driver,constants.getunit);
		genericmethods.getunitmethod(driver,constants.getworkhour);
		
	}
}

