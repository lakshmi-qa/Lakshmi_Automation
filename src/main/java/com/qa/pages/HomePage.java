package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.util.BasePage;

public class HomePage extends BasePage {
	
	/*public void openHomePage(String url){
		initialization();
		open(url);
	}
*/
	public void openHomePage(){
		initialization();
		open(prop.getProperty("url"));
	}
	public void AddProductsToCart() throws Exception {
		moveToElement(moveToItem1);
		click(btnAddToCartItem1);
		//waitForElement(btnContinueShopping,15);
		click(btnContinueShopping);
		//waitForElement(moveToItem2,15);
		moveToElement(moveToItem2);
		click(btnAddToCartItem2);
		//waitForElement(btnContinueShopping,15);
		click(btnContinueShopping);
	}
	 public void goToCart() throws Exception {
			moveToElement(hoverOnCartDropdown);
			//waitForElement(btnChkOut,15);
			click(btnChkOut);
			System.out.println("after btnchkout");
	 }
	 public void proceedToCheckout() throws Exception {
		 waitForElement(btnContinueToCheckout,25);
		 click(btnContinueToCheckout);
	 }
	
	By moveToItem1=By.xpath("//*[@id='homefeatured']/li[1]");
	By moveToItem2=By.xpath("//*[@id='homefeatured']/li[2]");
	By btnAddToCartItem1=By.xpath("//a[@data-id-product='1']");
	By btnAddToCartItem2=By.xpath("//a[@data-id-product='2']");
	By btnContinueShopping=By.cssSelector("span[title*='Continue shopping']");
	By hoverOnCartDropdown=By.xpath("//a[contains(@title,'View my shopping cart')]");
	By btnChkOut = By.xpath("//a[@id='button_order_cart']");
	By btnContinueToCheckout=By.cssSelector(".button.btn.btn-default.standard-checkout.button-medium");
	
}
