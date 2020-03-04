package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.util.BasePage;

public class ShippingPage extends BasePage{
	
public void proceedToCheckoutFromShipping() throws Exception {
	//Wait
	click(chkboxTermsAndCond);
	click(btnProceedToCheckout);
}
By chkboxTermsAndCond=By.id("cgv");
By btnProceedToCheckout = By.cssSelector("button[name='processCarrier']");

}
