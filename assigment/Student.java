package week3.day1.assigment;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student Name Janani");
	}
	public void studentDept()
	{
		System.out.println("BioTechnology");
	}
public void studentId()
{
	System.out.println("Student ID is 03");
}

public static void main(String[] args) {
	
	Student st = new Student();
	st.collegeName();
	st.collegeCode();
	st.collegeRank();
	st.deptName();
	st.studentName();
	st.studentDept();
	st.studentId();
	

}

}
