package tests;

import org.testng.Assert;
import org.testng.annotations.*;

import com.qa.pages.AddressPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.PaymentPage;
import com.qa.pages.ShippingPage;

public class FunctionalTest {
	HomePage hp= new HomePage();
	LoginPage lp=new LoginPage();
	AddressPage ap=new AddressPage();
	ShippingPage sp= new  ShippingPage();
	PaymentPage pp=new PaymentPage();
	
	@Test
	public void verifyOrderPlacement() throws Exception {
		//Opens home page
		hp.openHomePage();
		//Adds two items to cart
		hp.AddProductsToCart();
		//Move to cart and proceed to checkout
		hp.goToCart();
		hp.proceedToCheckout();
		//Login to application
		lp.login(hp.prop.getProperty("username"),hp.prop.getProperty("password"));
		ap.proceedToCheckout();
		sp.proceedToCheckoutFromShipping();
		pp.selectPaymentAndConfirmOrder();
		Assert.assertTrue(pp.verifyOrderConfirmMsg());
		}
@AfterMethod
	public void tearDown() {
		pp.close();
	}

}
