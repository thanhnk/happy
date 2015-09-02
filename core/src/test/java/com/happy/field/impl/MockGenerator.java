package com.happy.field.impl;

import java.util.Random;
import java.util.logging.Logger;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.happy.field.NumberGenerator;
import com.happy.qualifier.Loggable;
import com.happy.qualifier.ThirteenDigits;

@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator {
	@Inject
	private Logger logger;

	@Override
	@Loggable
	public String generateNumber() {
		String mock = "MOCK-" + Math.abs(new Random().nextInt());
		logger.info("Generated Mock : " + mock);
		return mock;
	}
}
