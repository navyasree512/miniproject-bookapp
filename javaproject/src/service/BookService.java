package service;
import java.util.Map.Entry;
import java.util.Set;

import model.Book;

public interface BookService {
	int addBook(Book bk);
	Book updateBook(int bookno,Book bk);
	void deleteBook(int bookno);
	Book getBook(int bookno);
	Set<Entry<Integer,Book>> getAllBooks();
	

}
