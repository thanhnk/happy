package com.happy.field.impl;

import java.util.Random;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.happy.field.NumberGenerator;
import com.happy.qualifier.EightDigits;
import com.happy.qualifier.Loggable;

@EightDigits
public class IssnGenerator implements NumberGenerator {
	@Inject
	private Logger logger;

	@Override
	@Loggable
	public String generateNumber() {
		String issn = "8-" + Math.abs(new Random().nextInt());
		logger.info("Generated ISBN : " + issn);
		return issn;
	}
}
