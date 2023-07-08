package week3.day1.assigment;

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println("ID number is " +id);
	}

	public void getStudentInfo(int id, String name)
	{
		System.out.println("ID number is " +id+ "  "+name);
	}
	
	public void getStudentInfo(String email, String phonenumber)
	{
		System.out.println("My Email is:");
		System.out.println("My phone number is:");
	}
	public static void main(String[] args) {
		
Students studobj=new Students();
studobj.getStudentInfo(12);
studobj.getStudentInfo(12,"Janani");
studobj.getStudentInfo("janu16@gmail.com", "9003227");

	}



}
