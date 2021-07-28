package cyber.java.restfulApi.repository;

import java.awt.print.Book;
import java.util.List;

public interface BookRepository  {

	List<Book> findAll();

	Book findById(int id);

	void update(Book book, int id);

	boolean add(Book book);

	void deleteById(int id);

}
