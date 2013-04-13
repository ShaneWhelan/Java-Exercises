public class Exercise10_09 {
  public static void main(String[] args) {
    Course course1 = new Course("Data Structures");
    Course course2 = new Course("Database Systems");

    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("Anne Kennedy");

    course2.addStudent("Peter Jones");
    course2.addStudent("Steve Smith");

    System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
    String[] students = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++){
      System.out.print(students[i] + ", ");
    }

    System.out.println();
    System.out.println("Number of students in course2: " + course2.getNumberOfStudents());

    course1.dropStudent("Brian Smith");
    System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
    students = course1.getStudents();
    
    for (int i = 0; i < course1.getNumberOfStudents(); i++){
      System.out.print(students[i] + ", ");
    }
  }
}

class Course{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(){
	}
	
	public Course(String courseName){
		this.setCourseName(courseName);
	}
	
	public void addStudent(String student){
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents(){
		return students;
	}
	
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	
	public void dropStudent(String student){
		int pos = 0;
		String[] temp = new String[students.length];
		for(int i = 0; i < students.length; i++){
			if(students[i] != student){
				temp[pos] = students[i];
				pos++;
			}
		}
		students = temp;
	}
	
	public void clear(){
		String[] temp = new String[100];
		students = temp;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}