package service;
import java.util.Map.Entry;
import java.util.Set;

import dao.BookDao;
import dao.BookDaoImpl;
import model.Book;

public class BookServiceImpl implements BookService{
    BookDao dao=new BookDaoImpl();
	
	public int addBook(Book bk) {
		return dao.addBook(bk);
	}

	public Book updateBook(int bookno, Book bk) {
		
		return dao.updateBook(bookno, bk);
	}

	public void deleteBook(int bookno) {
        dao.deleteBook(bookno);		
	}

	public Book getBook(int bookno) {
		return dao.getBook(bookno);
	}
    public Set<Entry<Integer, Book>> getAllBooks() {
		return dao.getAllBooks();
	}
	
}
