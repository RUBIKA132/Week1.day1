package week4.Day5;

public class Employee {

		int empId;
		String empName;
		String empAddress;
		Employee() {
			System.out.println("default Constructor");
			
		}
		Employee(int empId,String empName,String empAddress)  {
			this.empId=empId;
			this.empName=empName;
			this.empAddress=empAddress;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee(10111,"Rubi","Chennai");
		
		System.out.println(emp.empId);
		System.out.println(emp.empName);
		System.out.println(emp.empAddress);
		

	}

}
