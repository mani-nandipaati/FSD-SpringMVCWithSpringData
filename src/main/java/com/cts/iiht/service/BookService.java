package com.cts.iiht.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.iiht.dao.BookRepository;
import com.cts.iiht.model.Book;

@Service
@Transactional
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	public void addBook(Book book ) {
		bookRepository.save(book);
	}
	
	public void deleteBook(long id) {
		bookRepository.deleteById(id);
	}

	public Book searchBook(long id) {
		Optional<Book> optBook = bookRepository.findById(id);
		if(optBook.isPresent()) {
			return optBook.get();
		}
		else {
			return null;
		}
	}

	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
}
