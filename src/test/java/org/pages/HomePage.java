package org.pages;

import org.libglobal.BaseClass;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Home']//preceding-sibling::android.widget.Button")
	private MobileElement btnNavigationMenu;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Login']")
	private MobileElement btnLogin;

	public MobileElement getBtnNavigationMenu() {
		return btnNavigationMenu;
	}

	public MobileElement getBtnLogin() {
		return btnLogin;
	}
}
