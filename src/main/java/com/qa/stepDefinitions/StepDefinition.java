package com.qa.stepDefinitions;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.pages.*;
import com.qa.util.BasePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;


public class StepDefinition{
	HomePage hp= new HomePage();
	LoginPage lp=new LoginPage();
	AddressPage ap=new AddressPage();
	ShippingPage sp= new  ShippingPage();
	PaymentPage pp=new PaymentPage();
	Properties prop;
	BasePage bp=new BasePage();
	WebDriver driver;
	@Given("^User is on the home page$")
	public void launchURL(DataTable url){
		List<List<String>> urlValue =  url.raw();
		hp.openHomePage(urlValue.get(0).get(0));
	}
	
	@When("^User adds two products to cart$")
	public void addProductsToCart() throws Exception {
		System.out.println("Before adding products to cart");
		hp.AddProductsToCart();
		System.out.println("After adding products to cart");
	}
	@When("^User navigate to cart and proceed to checkout$")
	public void checkoutProductsFromCart() throws Exception {
		System.out.println("Before clicking cart");
		hp.goToCart();
		System.out.println("After clicking cart");
		hp.proceedToCheckout();
		System.out.println("After clicking checkout---cart");
	}
	@When("^user sign in using username and password$")
	public void signIn(DataTable signin) throws Exception {
		List<List<String>> signInDetails =  signin.raw();
		System.out.println("Before login");
		lp.login(signInDetails.get(0).get(0),signInDetails.get(0).get(1));
		System.out.println("After login");
	
		}
	@When("^User proceed address information$")
	public void proceedFromAddressPage() throws Exception {
		ap.proceedToCheckout();
		System.out.println("After login and checkout");
	}
	@When("^user provides shipping details$")
	public void provideShippingInfo() throws Exception {
		sp.proceedToCheckoutFromShipping();
		System.out.println("After shipping and checkout");
	}
	@When("^user places order$")
	public void providePaymentInfo() throws Exception {
		pp.selectPaymentAndConfirmOrder();
		System.out.println("After confirm order");
	}
	@Then("^check order places successfully$")
	public void verifyOrderPlacedSuccessfully() throws Exception {
		Assert.assertTrue(pp.verifyOrderConfirmMsg());
	}
}
