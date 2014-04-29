package org.boza.bots.hermitbot.screens;

import org.boza.bots.hermitbot.resources.DiabloResources;

public class LoadingScreen extends AbstractScreen implements Screen {

	public void executeAction() {
		driver.click(DiabloResources.LOADING_SCREEN);
	}

	public boolean isDisplayed() {
		return driver.isElementPresent(DiabloResources.LOADING_SCREEN) != null;
	}

}
