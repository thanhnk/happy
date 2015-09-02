package com.happy.service;

import static org.junit.Assert.assertTrue;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;

import com.happy.model.Book;

public class BookServiceIT {
	@Test
	public void shouldCheckNumberIsMOCK() {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		BookService bookService = container.instance()
				.select(BookService.class).get();
		Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
		assertTrue(book.getNumber().startsWith("MOCK"));
		weld.shutdown();
	}
}
