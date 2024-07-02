package io.github.jamalam360.jamtastic;

import io.github.jamalam360.jamlib.JamLib;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Jamtastic {
	public static final String MOD_ID = "jamtastic";
	public static final String MOD_NAME = "Jamtastic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	public static void init() {
		JamLib.checkForJarRenaming(Jamtastic.class);
	}
}
