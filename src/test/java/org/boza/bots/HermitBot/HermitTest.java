package org.boza.bots.HermitBot;

import org.boza.bots.hermitbot.HermitBot;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Integration test for Hermit bot
 */
public class HermitTest {

	private final static Logger LOGGER = LoggerFactory
			.getLogger(HermitTest.class);

	private HermitBot hermit;

	@Before
	public void before() throws InterruptedException {
		LOGGER.debug("Initializing bot");
		hermit = new HermitBot();
		hermit.defaultSetup();
		Thread.sleep(10000); // sleep a bit
	}

	@Test
	public void runBotTest() throws Exception {
		LOGGER.debug("run bot!");
		hermit.locateItself();
		hermit.runBot();
	}
}
