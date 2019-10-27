package com.retro.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.retro.game.ColourShooter;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = ColourShooter.WIDTH;
		config.height = ColourShooter.HEIGHT;
		config.title = ColourShooter.TITILE;
		new LwjglApplication(new ColourShooter(), config);
	}
}
