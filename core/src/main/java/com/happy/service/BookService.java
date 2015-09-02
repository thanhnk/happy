package com.happy.service;

import javax.inject.Inject;

import com.happy.field.NumberGenerator;
import com.happy.model.Book;
import com.happy.qualifier.Loggable;
import com.happy.qualifier.ThirteenDigits;

@Loggable
public class BookService {
	@Inject
	@ThirteenDigits
	private NumberGenerator numberGenerator;

	public Book createBook(String title, Float price, String description) {
		Book book = new Book(title, price, description);
		book.setNumber(numberGenerator.generateNumber());
		return book;
	}
}
