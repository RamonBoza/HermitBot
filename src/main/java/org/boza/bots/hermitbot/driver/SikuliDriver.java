package org.boza.bots.hermitbot.driver;

import java.net.URL;

import org.sikuli.api.DefaultScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.Screen;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopMouse;
import org.sikuli.api.robot.desktop.DesktopScreen;

public class SikuliDriver {

	private static final String IMAGES = "/images/";
	private Screen screen;
	ScreenRegion region;
	Mouse mouse = new DesktopMouse();

	public SikuliDriver() {
		screen = new DesktopScreen(0);
		region = new DefaultScreenRegion(screen);
	}

	public ScreenRegion isElementPresent(String elementIdentification) {
		Target target = new ImageTarget(
				getURLFromElement(elementIdentification));
		ScreenRegion find = region.find(target);
		return find;
	}

	public void click(String elementIdentification) {
		Target target = new ImageTarget(
				getURLFromElement(elementIdentification));
		ScreenRegion find = region.find(target);
		mouse.click(find.getCenter());

	}

	private URL getURLFromElement(String elementIdentification) {
		return this.getClass().getClassLoader()
				.getResource(IMAGES + elementIdentification);
	}

}
