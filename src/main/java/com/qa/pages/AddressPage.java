package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.util.BasePage;

public class AddressPage extends BasePage {
	public void proceedToCheckout() throws Exception {
		click(btnContinueChkOut);
	}

	By btnContinueChkOut=By.cssSelector("button[name='processAddress']");
}
