package com.happy.validation.checker.impl;

import com.happy.qualifier.USA;
import com.happy.validation.checker.ZipCodeChecker;

@USA
public class USAZipCodeChecker implements ZipCodeChecker {

	@Override
	public boolean isZipCodeValid(String value) {
		// TODO
		return true;
	}

}
