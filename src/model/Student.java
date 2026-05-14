package model;

public class Student extends Person{
	private int marks;
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public Student(int id,String name,int marks) {
		super(id,name);
		this.marks=marks;
	}
	
	
	public void display() {
		System.out.println("| ID:"+id+"NAME:"+name+"MARKS:"+marks);
		
	}
}
