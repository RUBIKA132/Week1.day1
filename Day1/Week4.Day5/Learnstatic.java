package week4.Day5;

public class Learnstatic {
	String empName;
	int empId;
	String empCompany;
	public void getEmployeeDetails(String name,int id , String company)  {
		empName=name;
		empId=id;
		empCompany=company;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learnstatic emp = new Learnstatic();
		emp.getEmployeeDetails("Rubika",2356,"TCS");
		
		Learnstatic emp2=new Learnstatic();
		emp2.getEmployeeDetails("Rubi",2356,"TestLeaf");
		
		Learnstatic emp3=new Learnstatic();
		emp3.getEmployeeDetails("Divya",2356,"TCS");
		
		
		System.out.println(emp.empName+" "+emp.empId+"  "+emp.empCompany);
		System.out.println(emp2.empName+" "+emp2.empId+"  "+emp2.empCompany);
		System.out.println(emp3.empName+" "+emp3.empId+"  "+emp3.empCompany);
		
		
		
		
		
				

	}

}
