package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static Properties p;
	public static WebDriver dr;
	public static ChromeOptions opt1;
	public static EdgeOptions opt2;
	public static WebDriverWait wait;

	@BeforeClass
	public void loadConfig() throws IOException {
		try {
			p = new Properties();
			FileInputStream fs = new FileInputStream(new File("C:\\Users\\Virendra\\eclipse-workspace\\Online_Order\\config\\config.properties"));
			p.load(fs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void launchApp() throws Throwable {
		String browserName = p.getProperty("browser");

		if (browserName.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			opt1 = new ChromeOptions();
			opt1.addArguments("--disable-infobars");
			opt1.addArguments("incognito");
			opt1.setAcceptInsecureCerts(true);
			dr = new ChromeDriver(opt1);
			Reporter.log("Browser Opened");

		} else if (browserName.contains("Edge")) {
			WebDriverManager.edgedriver().setup();
			opt2 = new EdgeOptions();
			opt2.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			dr = new EdgeDriver(opt2);
		} else if (browserName.contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			dr = new FirefoxDriver();
		}

		dr.get(p.getProperty("app_url"));
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Reporter.log("URL Entered");

	}
}
