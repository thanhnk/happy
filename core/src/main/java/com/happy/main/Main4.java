package com.happy.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.happy.model.Book;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creates an instance of book
		Book book = new Book("H2G2", "The Hitchhiker's Guide to the Galaxy", 12.5F, "1-84023-742-2", 354, false);
		// Obtains an entity manager and a transaction
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chapter04PU");
		EntityManager em = emf.createEntityManager();
		// Persists the book to the database
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(book);
		tx.commit();
		// Closes the entity manager and the factory
		em.close();
		emf.close();
	}

}
