package org.steps;

import java.net.MalformedURLException;

import org.libglobal.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void beforeScenario() throws MalformedURLException {
		launchApp();
		implicitWait(20);
	}

	@After
	public void afterScenario() {
		quitApp();
}

}
