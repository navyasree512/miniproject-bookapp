package ui;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import model.Book;
import service.BookService;
import service.BookServiceImpl;

public class Client {
	static BookService ser=new BookServiceImpl();
	public static void main(String[] args) {
		while(true) {
			System.out.println("Book management application");
			System.out.println("1.Add Book");
			System.out.println("2.update Book");
			System.out.println("3.Delte Book");
			System.out.println("4.get Book");
			System.out.println("5.getAll Books");
			Scanner sc=new Scanner(System.in);
            int option =sc.nextInt();
            switch(option) {
           
            case 1:
            	System.out.println("enter to add Book details");
            	System.out.println("enter Book ID");
            	int bookId=sc.nextInt();
            	System.out.println("enter Book Name");
            	String bookName=sc.next();
                System.out.println("enter Book Amount");
                int bookAmt=sc.nextInt();
                System.out.println("enter Book code");
                int bookCode=sc.nextInt();
                Book bk=new Book(bookId,bookName,bookAmt,bookCode);
				int bookno=ser.addBook((model.Book) bk);
                System.out.println("Book added successfully :"+bookno);
              break;
            case 2:
            	System.out.println("enter book number to update");
            	int bookno1=sc.nextInt();
            	System.out.println("enter book id");
            	int bid2=sc.nextInt();
            	System.out.println("enter book name");
            	String bname2=sc.next();
            	System.out.println("enter book amount");
                 int bamt2=sc.nextInt();
            	System.out.println("enter book code");
            	int bcode2=sc.nextInt();
            	Book bk1=new Book(bid2,bname2,bamt2,bcode2);
            	ser.updateBook(bookno1, bk1) ;
            	System.out.println("Book Updated succesfullu :"+bookno1);
            	break;
            case 3:
            	System.out.println("enter book number to delete");
            	int bkno2=sc.nextInt();
            	ser.deleteBook(bkno2);
            	System.out.println("Book deleted Succesfully");
            	break;
            case 4:
            	System.out.println("enter book number to get details");
            	int bkno3=sc.nextInt();
            	Book obj=ser.getBook(bkno3);
            	System.out.println(obj);
               break;
            case 5:
            	Set<Entry<Integer,Book>> result=ser.getAllBooks();
            	Iterator<Entry<Integer,Book>> itr=result.iterator();
            	while(itr.hasNext()) {
            		Entry<Integer,Book> finalresult=(Entry<Integer, Book>) itr.next();
            		System.out.println(finalresult.getKey()+" "+finalresult.getValue());
            	}
            	break;
            default:
            	System.out.println("wrong selection");
         	break;

            }
		}
	}
	
}
