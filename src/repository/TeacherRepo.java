package repository;
import model.Teacher;
public class TeacherRepo {
	private Teacher[] teachers=new Teacher[100];
	private int count=0;
	
	public boolean add(Teacher teacher) {
		if(count>=teachers.length)return false;
		
		for(int i=0;i<count;i++) {
			if(teachers[i].getId()==teacher.getId())return false;
		}
		teachers[count]=teacher;
		count++;
		return true;
	}
	public Teacher findById(int id) {
		for(int i=0;i<count;i++) {
			if(teachers[i].getId()==id) return teachers[i];
		}
		return null;
	}
	public Teacher[] getAll() {
		Teacher[] result = new Teacher[count];
		for(int i=0;i<count;i++) {
			result[i]=teachers[i];
		}
		return result;
	}
	public int getCount() {
		return count;
	}
	public boolean delete(int id) {
		for(int i=0;i<count;i++) {
			if(teachers[i].getId()==id)
			{
				for(int j=i;j<count-1;j++)
				{
				teachers[j]=teachers[j+1];
				}
			teachers[--count]=null;
			return true;
			}
		}
		return false;
	}
}
