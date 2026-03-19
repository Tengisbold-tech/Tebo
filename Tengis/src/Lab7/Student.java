package Lab7;

public class Student {
	private String name;
	private int age;
	private String studentId;
	
	public Student(String name, int age, String studentId) {  
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		}
		
		  public String getStudentId() {
		        return studentId;
		    }

		    public String getName() {
		        return name;
		    }
		    public String toString() {
		        return "ID: " + studentId + ", Ner: " + name + ", Nas: " + age;
		    }  
	}

	

	
