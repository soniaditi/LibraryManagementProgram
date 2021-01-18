package LibraryManagment;


public class Student {
	private int  rollNo;
	private String name;
	private String  branch;
	private int  semester;
	
	
	public Student(int rollNo, String name, String branch, int semester) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.semester = semester;
	}
	public void setRollNo(int rollNo) {
		this.rollNo= rollNo;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	
	
	public void setName(String name) {
		this.name= name;
	}
	public String getName()
	{
		return name;
	}
	
	
	public void setBranch(String branch) {
		this.branch= branch;
	}
	public String getBranch()
	{
		return branch;
	}
	
	
	public void setSemester(int semester) {
		this.semester= semester;
	}
	public int getSemester()
	{
		return semester;
	}
	@Override 
	public String toString() {
		return "Student: [rollNo= " + getRollNo() + ", name= " + getName() + ", branch= " + getBranch() + ", semster= " + getSemester() +"]";
  
		
	}
	
}