package org.boza.bots.hermitbot.screens;

import org.boza.bots.hermitbot.resources.DiabloResources;

public class CharacterScreen extends AbstractScreen implements Screen {

	public void executeAction() {
		driver.click(DiabloResources.CHARACTER_SCREEN);
	}

	public boolean isDisplayed() {
		return driver.isElementPresent(DiabloResources.CHARACTER_SCREEN) != null;
	}

}
