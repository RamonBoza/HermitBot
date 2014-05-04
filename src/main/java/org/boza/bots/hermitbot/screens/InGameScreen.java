package org.boza.bots.hermitbot.screens;

import org.boza.bots.hermitbot.resources.DiabloResources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InGameScreen extends AbstractScreen implements Screen {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(InGameScreen.class);

	public void executeAction() {
		LOGGER.debug("Executing the action");
		goToStash();
		goToPortal();
		searchForQuest();
	}

	private void searchForQuest() {
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_ONE);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_TWO);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_THREE);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_FOUR);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_FIVE);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_SIX);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_SEVEN);
	}

	private void goToGround(final String resource) {
		driver.click(resource);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			LOGGER.error("Problem when going to stash", e);
		}
	}

	private void goToStash() {
		driver.click(DiabloResources.IN_GAME_SCREEN_CLOSE_STASH);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			LOGGER.error("Problem when going to stash", e);
		}
	}

	private void goToPortal() {
		driver.click(DiabloResources.IN_GAME_SCREEN_PORTAL);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			LOGGER.error("Problem when going to portal", e);
		}
	}

	public boolean isDisplayed() {
		LOGGER.debug("Am I being displayed?");
		boolean isDisplayed = driver
				.isElementPresent(DiabloResources.IN_GAME_SCREEN);
		LOGGER.debug("is being displayed " + isDisplayed);
		return isDisplayed;
	}

}
