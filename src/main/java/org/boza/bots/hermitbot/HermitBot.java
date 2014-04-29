package org.boza.bots.hermitbot;

import org.boza.bots.hermitbot.elements.CircularList;
import org.boza.bots.hermitbot.screens.CharacterScreen;
import org.boza.bots.hermitbot.screens.InGameScreen;
import org.boza.bots.hermitbot.screens.LoadingScreen;
import org.boza.bots.hermitbot.screens.Screen;

/**
 * Hello world!
 * 
 */
public class HermitBot {
	CircularList<Screen> screens;

	public HermitBot() {
		screens = new CircularList<Screen>();
	}

	public void setup() {
		screens.add(new CharacterScreen());
		screens.add(new InGameScreen());
		screens.add(new LoadingScreen());
	}

	public void locateItself() {
		boolean found = false;
		do {
			Screen screen = screens.next();
			found = screen.isDisplayed();
		} while (!found);
	}
}
