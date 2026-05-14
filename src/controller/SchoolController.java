package controller;
import model.Student;
import model.Teacher;
import repository.StudentRepo;
import repository.TeacherRepo;
public class SchoolController {
	private StudentRepo studentRepo = new StudentRepo();	
	private TeacherRepo teacherRepo = new TeacherRepo();
	
	public String addStudent(int id, String name, int marks)
	{
		if(name ==null) return "Name can't be Null";
		if(marks<0&&marks>100) return "Marks should be 0 to 100 Only";
		
		Student student = new Student(id, name, marks);
		boolean result =studentRepo.add(student); 
		return result ? "Sucessfully added the Student : "+name :
			"Student with the ID : "+id +" already present";
		
	}
	
	public String addTeacher(int id, String name, String subject)
	{
		if(name==null) return "Name can't be Null";
		if(subject==null) return "Subject can't be Null";
		
		Teacher teacher = new Teacher(id, name, subject);
		
		boolean result=teacherRepo.add(teacher);
		
		return result ? "Sucessfully added the Teacher : "+name :
			"Teacher with the ID : "+id +" already present";
	}
	
	public Student findStudentById(int id)
	{
		 return studentRepo.findById(id);
	}
	
	public Teacher findTeacherById(int id)
	{
		return teacherRepo.findById(id);
	}
	
	public Student[] getAllStudents()
	{
		return studentRepo.getAll();
	}
	
	public Teacher[] getAllTeachers()
	{
		return teacherRepo.getAll();
	}
	
	public String deleteStudent(int id)
	{
		boolean result=studentRepo.delete(id);
		return result?"Student "+id +" is Sucessfully Deleted" :"Student with the ID : "+id +" not present";
	}
	
	public String deleteTeacher(int id)
	{
		boolean result=teacherRepo.delete(id);
		return result?"Teacher "+id +" is Sucessfully Deleted" :"Teacher with the ID : "+id +" not present";
		
	}
	
	public String getCount()
	{
		return "Student Count : "+ studentRepo.getCount()+", Teacher Count : "+teacherRepo.getCount();
	}

}


