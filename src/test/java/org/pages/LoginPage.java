package org.pages;

import java.util.List;

import org.libglobal.BaseClass;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Login']//following-sibling::android.widget.EditText")
	private MobileElement txtEmailId;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Sign In']")
	private MobileElement btnSignIn;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc='OTP has been sent to test@gf.com']//following-sibling::android.widget.EditText")
	private List<MobileElement> otpValue;

	public MobileElement getTxtEmailId() {
		return txtEmailId;
	}

	public MobileElement getBtnSignIn() {
		return btnSignIn;
	}

	public List<MobileElement> getOtpValue() {
		return otpValue;
	}

	// @AndroidFindBy(xpath = "")
	// private MobileElement btnVerify;

}
