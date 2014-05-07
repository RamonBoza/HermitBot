package org.boza.bots.hermitbot.screens;

import org.boza.bots.hermitbot.resources.DiabloResources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CharacterScreen extends AbstractScreen implements Screen {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(CharacterScreen.class);

	public void executeAction() {
		LOGGER.debug("Executing the action");
		driver.click(DiabloResources.CHARACTER_SCREEN);
		try {
			Thread.sleep(17000);
		} catch (InterruptedException e) {
			LOGGER.error("Found a problem when sleeping", e);
		}
	}

	public boolean isDisplayed() {
		LOGGER.debug("Am I being displayed?");
		boolean isDisplayed = driver
				.isElementPresent(DiabloResources.CHARACTER_SCREEN);
		LOGGER.debug("is being displayed " + isDisplayed);
		return isDisplayed;
	}

}
