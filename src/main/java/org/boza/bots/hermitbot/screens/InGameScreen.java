package org.boza.bots.hermitbot.screens;

import org.boza.bots.hermitbot.resources.DiabloResources;

public class InGameScreen extends AbstractScreen implements Screen {

	public void executeAction() {
		driver.click(DiabloResources.IN_GAME_SCREEN);
	}

	public boolean isDisplayed() {
		return driver.isElementPresent(DiabloResources.IN_GAME_SCREEN) != null;
	}

}
