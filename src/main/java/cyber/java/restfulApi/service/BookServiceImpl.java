package cyber.java.restfulApi.service;

import java.awt.print.Book;
import java.util.List;

import cyber.java.restfulApi.repository.BookRepository;

public class BookServiceImpl implements BookService{
	private BookRepository repository;
	
	public BookServiceImpl(BookRepository repository) {
	
		this.repository = repository;
	}

	@Override
	public List<Book> findAll() {
		
		return repository.findAll();
	}

	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public void update(Book book, int id) {
		repository.update(book, id);
		
	}

	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return repository.add(book);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
