package com.happy.main;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.happy.model.Book;
import com.happy.service.BookService;

public class Main {

	public static void main(String[] args) {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		BookService bookService = container.instance()
				.select(BookService.class).get();
		Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
		System.out.println(book);
		weld.shutdown();
	}

}
