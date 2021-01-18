package LibraryManagment;

public class Book implements Comparable<Book> {
	private int  id;
	private String name;
	private String author;
	private int  price;
	private int  noOfCopies;
	
	public Book(int id, String name, String author, int price, int noOfCopies) {
		super();
		this.id=id;
		this.name= name;
		this.author=author;
		this.price=price;
		this.noOfCopies=noOfCopies;
		
	}
	
	public Book() {
		
	}
	public void setId(int id) {
		this.id= id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAuthor(String author) {
		this.author= author;
	}
	public String getAuthor()
	{
		return author;
	}
	
	public void setPrice(int  price) {
		this.price= price;
	}
	public int getPrice()
	{
		return price;
	}
	
	public void setNoOfCopies(int  noOfCopies) {
		this.noOfCopies =noOfCopies;
		
	}
	public int getNoOfCopies()
	{
		return noOfCopies;
	}
	
	@Override 
	public String toString() {
		return "Book: [id= " + getId() + ", name= " + getName() + ", author= " + getAuthor() + ", price= " + getPrice() + ", noOfCopies=" +getNoOfCopies()+"]";
		
		
	}
	
	@Override
	public int compareTo(Book b) {
		
		return id>b.id?1:-1;
	}
	
	
}	
 class magazine extends Book{
	 

	private int noOfAllowedIssueDays;
	private int year;
	private String genre; 
	
	
}
 class Journals extends Book{
	
	 private int volume;
	
}

 class Newspaper extends Book{
	 
	
	 private int bill;
	
}

 class RefrenceBooks extends Book{
	
	

	int noOfAllowedIssueDays;
	int referenceId;
	int edition;
	String isbn;
	String fieldOfStudy;
	
	
}

//toString in class: issuebooks, library and books: done
//exception handling and return type in overriding
//read about super 
//study about: collection- 2 topics, & numbers and strings

	
	
	

