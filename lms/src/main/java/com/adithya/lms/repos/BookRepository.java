package com.adithya.lms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adithya.lms.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	

}
