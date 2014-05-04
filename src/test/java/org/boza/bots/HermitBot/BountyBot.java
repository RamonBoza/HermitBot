package org.boza.bots.HermitBot;

import org.boza.bots.hermitbot.HermitBot;
import org.boza.bots.hermitbot.screens.BountyWaitScreen;
import org.boza.bots.hermitbot.screens.CharacterScreen;
import org.boza.bots.hermitbot.screens.LoadingScreen;
import org.junit.Before;
import org.junit.Test;

public class BountyBot {

	private HermitBot bot;

	@Before
	public void before() {
		bot = new HermitBot();
		bot.addScreen(new CharacterScreen());
		bot.addScreen(new LoadingScreen());
		bot.addScreen(new BountyWaitScreen());
	}

	@Test
	public void bountyBotTest() throws Exception {
		bot.locateItself();
		bot.runBot();
	}

}
