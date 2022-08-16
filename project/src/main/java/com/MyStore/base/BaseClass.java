package com.MyStore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;

import com.MyStore.actiondriver.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	
	@BeforeTest
	public void loadConfig() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\configuration\\Config.properties");
			prop.load(ip);
			//System.out.println("driver: " + driver);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

	public static void   launchApp  () {
		
		WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		if (browserName.contains("Chrome")) {
			driver=new ChromeDriver();
		} else if (browserName.contains("FireFox")) {
			driver=new FirefoxDriver();
		}else if (browserName.contains("Edge")) {
			driver=new EdgeDriver();
			}
		driver.manage().window().maximize();
		Action.implicitWait(driver, 10);
		Action.pageLoadTimeOut(driver, 30);
		driver.get(prop.getProperty("url"));
		
		
	
	
	
	
	
	
	
	
	
	}
	






























}
















