package org.boza.bots.hermitbot.screens;

import org.boza.bots.hermitbot.resources.DiabloResources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InGameScreen extends AbstractScreen implements Screen {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(InGameScreen.class);

	public void executeAction() {
		LOGGER.debug("Executing the action");
		driver.click(DiabloResources.IN_GAME_SCREEN);
	}

	public boolean isDisplayed() {
		LOGGER.debug("Am I being displayed?");
		boolean isDisplayed = driver
				.isElementPresent(DiabloResources.IN_GAME_SCREEN);
		LOGGER.debug("is being displayed " + isDisplayed);
		return isDisplayed;
	}

}
