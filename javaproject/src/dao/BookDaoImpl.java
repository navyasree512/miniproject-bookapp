package dao;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import model.Book;

public class BookDaoImpl implements BookDao {
	HashMap<Integer,Book> book=new HashMap<Integer,Book>();
	int bookno=0;
	@Override
	public int addBook(Book bk) {
		book.put(++bookno, bk);
		return bookno;
	}
	@Override
	public Book updateBook(int bookno, Book bk) {
		book.put(bookno, bk);		
		return book.get(bookno);
	}
	@Override
	public void deleteBook(int bookno) {
		book.remove(bookno);
	}
	@Override
	public Book getBook(int bookno) {
		return book.get(bookno);
	}
	@Override
	public Set<Entry<Integer, Book>> getAllBooks() {
		Set<Entry<Integer,Book>> result=book.entrySet();
		return result;
	}

}



