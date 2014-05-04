package org.boza.bots.hermitbot.screens;

import org.boza.bots.hermitbot.resources.DiabloResources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoadingScreen extends AbstractScreen implements Screen {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(LoadingScreen.class);

	public void executeAction() {
		LOGGER.debug("Executing the action");
		driver.click(DiabloResources.LOADING_SCREEN);
	}

	public boolean isDisplayed() {
		LOGGER.debug("Am I being displayed?");
		boolean isDisplayed = driver
				.isElementPresent(DiabloResources.LOADING_SCREEN);
		LOGGER.debug("is being displayed " + isDisplayed);
		return isDisplayed;
	}

}
