package training;

class Student {
	public int studentId ;
	public String studentName ;
	private int studentMarks ;
	private char studentGrade ;	
	
	public Student(int studentId, String studentName, int studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		calculateGrade(studentMarks);
	}

	private void calculateGrade(int studentMarks) {
		if(studentMarks >= 90) 
			studentGrade = 'A';
		else if(studentMarks < 90 || studentMarks >= 80 )
			studentGrade = 'B';
		else if(studentMarks < 80 || studentMarks >= 70 )
			studentGrade = 'C';
		else if(studentMarks < 70 || studentMarks >= 60 )
			studentGrade = 'D';
		else
		    studentGrade = 'E';
	}
	String displayDetails() {
		return "StudentId : "+studentId+" , StudentName : "+studentName+
				" , studentMarks : "+studentMarks+" , studentGrade : "+studentGrade;
		
	}
}

