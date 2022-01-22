package week1.day1;

public class Student {
	String collegeName ="name" ;
	
	
	int rollNo = 1234;
	
	public int College()
	{
		int regNumber = 4321;
		return regNumber;
		
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		int result = obj.College();
		System.out.println(result);
		System.out.println(obj.collegeName);
		System.out.println(obj.rollNo);
		
		
		
	}

}
