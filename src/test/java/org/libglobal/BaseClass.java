package org.libglobal;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class BaseClass {
	public static AppiumDriver<MobileElement> driver;

	public void launchApp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "narzo 50i");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("appPackage", "com.myglobalfair.buyerapp");
		capabilities.setCapability("appActivity", "com.myglobalfair.buyerapp.MainActivity");
		URL service = new URL("http://localhost:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(service, capabilities);
	}

	public void implicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public void elementSendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void elementClick(WebElement element) {
		element.click();
	}


	public void quitApp() {
		driver.quit();
	}

}
