package week4.day3;

public class Students {

	public void getStudentInfo(int Id)    {
		System.out.println("Student id:"+Id);
	}
	
	public void getStudentInfo(int Id,String Name)   {
		System.out.println(Id+Name);
	}

	public void getStudentInfo(String email,long phonenumber)  {
		System.out.println(email+phonenumber);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students std = new Students();
		std.getStudentInfo(14);
		std.getStudentInfo(14,"Np");
		std.getStudentInfo("np43", 345678909);
		

	}

}
