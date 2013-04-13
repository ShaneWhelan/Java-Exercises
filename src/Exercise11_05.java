import java.util.ArrayList;
public class Exercise11_05 {
	public static void main(String[] args) {
		Courses course1 = new Courses("Data Structures");
		Courses course2 = new Courses("Database Systems");
	
		course1.addStudent("Peter Jones");
		course1.addStudent("Brian Smith");
		course1.addStudent("Anne Kennedy");
	
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
	
		System.out.println("Number of students in course1: "  + course1.getNumberOfStudents());
		System.out.println(course1.getStudents());
	
		System.out.println();
		System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
	}
}

class Courses{
	private String courseName;
	java.util.ArrayList<String> students = new java.util.ArrayList<String>();
	
	public Courses(){
	}
	
	public Courses(String courseName){
		this.setCourseName(courseName);
	}
	
	public void addStudent(String student){
		students.add(student);
	}
	
	public ArrayList<String> getStudents(){
		return students;
	}
	
	public int getNumberOfStudents(){
		return students.size();
	}
	
	public void dropStudent(String student){
		students.remove(student);
	}
	
	public void clear(){
		students.clear();
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}