package com.happy.field.impl;

import java.util.Random;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.happy.field.NumberGenerator;
import com.happy.qualifier.Loggable;
import com.happy.qualifier.ThirteenDigits;

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {
	@Inject
	private Logger logger;

	@Override
	@Loggable
	public String generateNumber() {
		String isbn = "13-84356-" + Math.abs(new Random().nextInt());
		logger.info("Generated ISBN : " + isbn);
		return isbn;
	}
}
