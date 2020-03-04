package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
	public static WebDriver driver;
	public Properties prop;
	public  long PAGE_LOAD_TIMEOUT = 30;
	public  long IMPLICIT_WAIT = 10;
	
	public Properties initializeProps(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "//src//main//java//com"
					+ "//qa//config//config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public  void initialization(){
		initializeProps();
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//main//resources//chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		//driver.get(prop.getProperty("url"));
		
	}
	
	public List<WebElement> findElements(By byloc) throws Exception {
	
		return driver.findElements(byloc);
	}
	
	public WebElement findElement(By byloc) throws Exception {
		return driver.findElement(byloc);
	}

	public boolean isElementPresent(By byloc) {
		try {
			if (driver.findElement(byloc).isDisplayed()) return true;
			else return false;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean isElementPresent(By loc, int wait) {
		try {
			for (int i=0; i<wait; i++) {
				if (isElementPresent(loc)) return true;
				sleep(1);
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void waitForElement(By loc, int wait) throws Exception {
		if (!isElementPresent(loc, wait)) throw new NoSuchFieldException("Locator " + loc + " not found.");
	}
	public void type(By byloc, String text) throws Exception {
		driver.findElement(byloc).clear();
		driver.findElement(byloc).sendKeys(text);
	}
	
	public void type(By loc, String text, int wait) throws Exception {
		if (!isElementPresent(loc, wait)) throw new NoSuchFieldException("Locator " + loc + " not found.");
		type(loc, text);
	}
	public void moveToElement(By loc) {
		Actions act= new Actions(driver);
		try {
			act.moveToElement(findElement(loc)).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	public String getText(By byloc) throws Exception {
		 return driver.findElement(byloc).getText();
	}
	
	public void sleep(int sec) throws Exception {
		Thread.sleep(sec * 1000L);
	}
	
	public void click(By byloc) throws Exception {
		driver.findElement(byloc).click();
	}

	public void click(By loc, int wait) throws Exception {
		if (!isElementPresent(loc, wait)) throw new NoSuchFieldException("Locator " + loc + " not found.");
		click(loc);
	}
	
	public void open(String url) {
		driver.get(url);
	}
	public void close() {
		driver.quit();
	}
}
