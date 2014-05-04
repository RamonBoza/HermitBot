package org.boza.bots.hermitbot;

import org.boza.bots.hermitbot.elements.CircularList;
import org.boza.bots.hermitbot.screens.CharacterScreen;
import org.boza.bots.hermitbot.screens.InGameScreen;
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

	public void defaultSetup() {
		screens.add(new CharacterScreen());
		// screens.add(new LoadingScreen());
		screens.add(new InGameScreen());
	}

	public void addScreen(final Screen screen) {
		screens.add(screen);
	}

	public void locateItself() {
		boolean found = false;
		do {
			Screen screen = screens.next();
			found = screen.isDisplayed();
		} while (!found);
	}

	public void runBot() {
		while (true) {
			Screen screen = screens.get();
			screen.executeAction();
			screens.next();
		}
	}
}
