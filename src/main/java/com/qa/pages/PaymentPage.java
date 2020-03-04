package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.util.BasePage;

public class PaymentPage extends BasePage{
	public void selectPaymentAndConfirmOrder() throws Exception {
		click(btnBankWire);
		click(btnConfirmOrder);
	}
	public boolean verifyOrderConfirmMsg() throws Exception {
		waitForElement(txtOrderConfirmMesg,10);
		String text=getText(txtOrderConfirmMesg);
		System.out.println("Confirmation text"+text);
		if(getText(txtOrderConfirmMesg).equalsIgnoreCase(orderConfirmMesg)) {
			return true;
		}
		else return false;
		
	}
	By btnBankWire=By.cssSelector(".bankwire");
	By btnConfirmOrder=By.xpath("//*[@id='cart_navigation']/button");
	By txtOrderConfirmMesg=By.className("page-heading");
	String orderConfirmMesg="Order confirmation";
	
}
