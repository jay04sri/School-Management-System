package repository;
import model.Student;
public class StudentRepo {
	private Student[] students = new Student[100];
	private int count=0;
	
	public boolean add(Student student) {
		if(count>=students.length)return false;
		for(int i=0;i<count;i++) {
			if(students[i].getId()==student.getId())return false;
		}
		students[count]=student;
		count++;
		return true;
	}
	public Student findById(int id) {
		for(int i=0;i<count;i++) {
			if(students[i].getId()==id)return students[i];
		}
		return null;
	}
	public Student[] getAll() {
		Student[] result=new Student[count];
		for(int i=0;i<count;i++) {
			result[i]=students[i];
		}return result;
	}
	public int getCount() {
		return count;
	}
	public boolean delete(int id) {
		for(int i=0;i<count;i++)
		{
			if(students[i].getId()==id)
			{
				for(int j=i;j<count-1;j++)
				{
				students[j]=students[j+1];
				}
			students[--count]=null;
			return true;
			}
		}
		return false;
	}
	
}
