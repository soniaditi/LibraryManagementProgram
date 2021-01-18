package LibraryManagment;

import java.util.Date;

public class IssueBooks {
	//issue book details
	
	private int id;  //primary key
	private String dateOfIssue;
	private String dateOfReturn;
	private int fine;
	private Book book ;
	private Student student ;
	
	
	//toString, getter setter of student and book
	
	public void setId(int id) {
		this.id= id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue= dateOfIssue;
	}
	public String getDateOfIssue()
	{
		return dateOfIssue;
	}
	public void setDateOfReturn(String dateOfReturn) {
		this.dateOfReturn= dateOfReturn;
	}
	public String getDateOfReturn()
	{
		return dateOfReturn;
	}
	
	public void setFine(int fine) {
		this.fine= fine;
	}
	public int getFine()
	{
		return fine;
	}
	
	
	@Override 
	public String toString() {
		return "IssueBook: [id= " + getId() + ", dateOfIssue= " + getDateOfIssue() + ", dateOfReturn= " + getDateOfReturn() + "fine="+ getFine() +"]";
	}
	IssueBooks() {
			
		}
}

//dateOfisssue datatype: done
