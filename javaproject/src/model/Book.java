package model;
public class Book {
	private int bookid;
	private String bookname;
	private int bookamt;
	private int bookcode;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookamt() {
		return bookamt;
	}
	public void setBookamt(int bookamt) {
		this.bookamt = bookamt;
	}
	public int getBookcode() {
		return bookcode;
	}
	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}
	public Book() {
		
	}
	public Book(int bookid, String bookname, int bookamt, int bookcode) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookamt = bookamt;
		this.bookcode = bookcode;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookamt=" + bookamt + ", bookcode=" + bookcode
				+ ", getBookid()=" + getBookid() + ", getBookname()=" + getBookname() + ", getBookamt()=" + getBookamt()
				+ ", getBookcode()=" + getBookcode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}