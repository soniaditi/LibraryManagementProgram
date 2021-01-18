package LibraryManagment;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Library implements Serializable {
	//main fucntion->5 different books obj and add it to the list
	//5 different students and add it to stud list
	//list of books, students, issue books
	//issue books function-> parameter -> stud id , book id
	//return book Function-> book id, stud id
	
	//private list<Book> collections;
	public static Book issuebook(int bookId, int rollNo) {
		
		//
		
		
		return null;
		
	}

	
	public static void main(String args[]) {
		
		//Book b = new Book();
		List<Book> booklist = new ArrayList<Book>();
		booklist.add(new Book(1,"Immortals of meluha","amish",200,3));
		booklist.add(new Book(2,"math book","rs aggrawal",200,5));
		booklist.add(new Book(4,"Alchemist","dan brown",200,3));
		booklist.add(new Book(3,"techmax","amish",200,20));
		booklist.add(new Book(5,"A brief history of time","Pr stephen hawkings",200,10));
		Collections.sort(booklist);
		
		Iterator<Book> i = booklist.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		List<Student> studentlist = new ArrayList<Student>();
		studentlist.add(new Student(5,"Aditi","comp",3));
		studentlist.add(new Student(4,"Riya","Electronics",5));
		studentlist.add(new Student(2,"Shreya","Mechanical",3));
		studentlist.add(new Student(3,"Sourabh","Mechanical",6));
		studentlist.add(new Student(1,"Mansoor","IT",1));
		Collections.sort(studentlist, (a,b)->a.getRollNo()>b.getRollNo()?1:-1);
		
		System.out.println();
		Iterator<Student> j = studentlist.iterator();
		while(j.hasNext()){
			System.out.println(j.next());
		}
		
		issuebook(1,4);
	}
}
