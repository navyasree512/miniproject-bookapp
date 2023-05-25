package dao;
import java.util.Set;
import java.util.Map.Entry;

import model.Book;

public interface BookDao {
	int addBook(Book bk);
    Book updateBook(int bookno,Book bk);
    void deleteBook(int bookno);
    Book getBook(int bookno);
    Set<Entry<Integer,Book>> getAllBooks();
}

