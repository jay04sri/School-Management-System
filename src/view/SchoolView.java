package view;

import java.util.Scanner;

import controller.SchoolController;
import model.Student;
import model.Teacher;
import repository.StudentRepo;

public class SchoolView {
	
	private static SchoolController schoolController= new SchoolController();
	
	public static void printMenu()
	{
		System.out.println("-----------------School Management System-----------------");
		System.out.println("| 1. Add Student  ");
		System.out.println("| 2. Add Teacher  ");
		System.out.println("| 3. Find Student By ID  ");
		System.out.println("| 4. Find Teacher By ID  ");
		System.out.println("| 5. Delete Student By ID  ");
		System.out.println("| 6. Delete Teacher By ID  ");
		System.out.println("| 7. Get All  ");
		System.out.println("| 8. Get Count  ");
		System.out.println("| 9. Exit  ");
		System.out.println("----------------- Enter Your Choice -----------------");
	}
	
	public static void menu()
	{
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag)
		{
			printMenu();
			
			int choice =sc.nextInt();
			
			switch(choice)
			{
				case 1: {
					    System.out.println("Enter id");
					    int id = sc.nextInt();
					    System.out.println("Enter name");
					    String name = sc.next();
					    System.out.println("Enter Marks");
					    int marks=sc.nextInt();
					    
					    System.out.println( schoolController.addStudent(id, name, marks));
					    
				}
				break;
				case 2:{
				    System.out.println(" Enter id");
				    int id = sc.nextInt();
				    System.out.println("Enter name");
				    String name = sc.next();
				    System.out.println("Enter subject");
				    String subject=sc.next();
				    
				    System.out.println( schoolController.addTeacher(id, name,subject));
				    
			        }
				break;
				case 3:{
					System.out.println(" Enter id");
				    int id = sc.nextInt();
				    Student student=schoolController.findStudentById(id);
				    if(student!=null)
				    	student.display();
				    else
				    System.out.println("Student Not Found ");
				}
				break;
				case 4:{
					System.out.println(" Enter id");
				    int id = sc.nextInt();
				    Teacher teacher=schoolController.findTeacherById(id);
				    if(teacher!=null)
				    	teacher.display();
				    else
				    System.out.println("Teacher Not Found ");
				}
				break;
				case 5:{
					System.out.println(" Enter id");
				    int id = sc.nextInt();
				    System.out.println( schoolController.deleteStudent(id));
			      }
				break;
				case 6:{
					System.out.println(" Enter id");
				    int id = sc.nextInt();
				    System.out.println( schoolController.deleteTeacher(id));
			      }
				break;
				case 7:{
					System.out.println("*********************************************************");
					for(Student student: schoolController.getAllStudents()) student.display();
					for(Teacher teacher: schoolController.getAllTeachers()) teacher.display();
					System.out.println("*********************************************************");
				}
				break;
				case 8:
				{
					System.out.println(schoolController.getCount());
				}
				break;
				case 9: flag=false;
				break;
				default : System.out.println("Enter the Valid Choice from the Menu...!");
				
			}
			
		}
	}

}
