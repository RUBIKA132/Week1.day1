package week1.day2;

public class EmployeeDetails {
	public void printEmployeeName(String empName,int empId)  {
			System.out.println(empName);
			System.out.println(empId);
		}
		
  
   public void EmployeeAddress(String empAddress) {
	   System.out.println(empAddress);
   }
   public void EmployeeSalary(double empSalary)  {
	   System.out.println(empSalary);
   }
   public void EmployeeMobileNumber(long mob) {
	   System.out.println(mob);
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails employee=new EmployeeDetails();
	
		employee.printEmployeeName("Rubika", 0);
		employee.EmployeeAddress("Namakkal");
		employee.EmployeeSalary(3456.67);
		employee.EmployeeMobileNumber(4543345533345L);
		
		
	}

		
	


	
	


	
		
	}


	
		
	


	
	








