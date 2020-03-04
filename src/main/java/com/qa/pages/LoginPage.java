package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.util.BasePage;

public class LoginPage extends BasePage{
	public void login(String user,String password) throws Exception {
		//waitForElement(txtEmailId);
		type(txtEmailId,user);
		type(txtPwd,password);
		click(btnLogin);
	}
	By txtEmailId=By.id("email");
	By txtPwd =By.id("passwd");
	By btnLogin=By.id("SubmitLogin");
}
