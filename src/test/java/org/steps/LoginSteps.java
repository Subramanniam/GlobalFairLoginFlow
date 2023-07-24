package org.steps;

import java.util.List;

import org.libglobal.BaseClass;
import org.pages.HomePage;
import org.pages.LoginPage;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {
	@Given("User is on Global Fair Home Page")
	public void userIsOnGlobalFairHomePage() {
	}

	@When("User click on navigation menu and click on Login Button")
	public void userClickOnNavigationMenuAndClickOnLoginButton() {
		HomePage homePage = new HomePage();
		elementClick(homePage.getBtnNavigationMenu());
		elementClick(homePage.getBtnLogin());
	}

	@When("User enters {string} and click on sign in Button")
	public void userEntersAndClickOnSignInButton(String emailId) {
		LoginPage loginPage = new LoginPage();
		elementClick(loginPage.getTxtEmailId());
		elementSendKeys(loginPage.getTxtEmailId(), emailId);
		elementClick(loginPage.getBtnSignIn());
	}

	@When("User enters {string} and verify Button")
	public void userEntersAndVerifyButton(String otpValue) {
		LoginPage loginPage = new LoginPage();
		List<MobileElement> otp = loginPage.getOtpValue();
		for (int i = 0; i < otp.size(); i++) {
			otp.get(i).click();
			elementSendKeys(otp.get(i), String.valueOf(otpValue.charAt(i)));
		}
		
	}
	@Then("login should be success")
	public void loginShouldBeSuccess() {
		System.out.println("Signed in Successfully");
	   
	}
}
