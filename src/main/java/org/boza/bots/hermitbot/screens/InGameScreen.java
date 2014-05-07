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
		if (searchForQuest()) {
			returnQuest();
		}
		leaveGame();
	}

	private void leaveGame() {

	}

	private void returnQuest() {
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_ELEVEN);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_TEN);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_NINE);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_EIGHT);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_SEVEN);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_SIX);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_FIVE);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_FOUR);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_THREE);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_TWO);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_ONE);
	}

	private boolean searchForQuest() {
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_ONE);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_TWO);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_THREE);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_FOUR);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_FIVE);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_SIX);
		// searchCorpse();
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_SEVEN);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_EIGHT);
		// searchCorpse();
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_NINE);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_TEN);
		goToGround(DiabloResources.IN_GAME_SCREEN_GROUND_ELEVEN);
		boolean elementPresent = driver
				.isElementPresent(DiabloResources.IN_GAME_SCREEN_HERMIT_QUEST);
		goToGround(DiabloResources.IN_GAME_SCREEN_HERMIT_QUEST);
		return elementPresent;
	}

	private void searchCorpse() {
		goToGround(DiabloResources.IN_GAME_SCREEN_CORPSE_1);
		goToGround(DiabloResources.IN_GAME_SCREEN_CORPSE_2);
		goToGround(DiabloResources.IN_GAME_SCREEN_CORPSE_3);
		goToGround(DiabloResources.IN_GAME_SCREEN_CORPSE_4);
		goToGround(DiabloResources.IN_GAME_SCREEN_CORPSE_5);
		goToGround(DiabloResources.IN_GAME_SCREEN_CORPSE_6);
		goToGround(DiabloResources.IN_GAME_SCREEN_CORPSE_7);
	}

	private void goToGround(final String resource) {
		try {
			driver.click(resource);
		} catch (NullPointerException e) {

		}
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
