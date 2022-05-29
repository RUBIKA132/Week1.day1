package week4.Day5;

public class ConstructorOverloading {
	int empId;
	String empName;
	String empAddress;

	  ConstructorOverloading() {
		System.out.println("default constructor");
	}
	
	  ConstructorOverloading(int id,String name,String address)  {
		empId=id;
		empName=name;
		empAddress=address;
		
	  }
	  
	  ConstructorOverloading(int id,String name) {
		  empId=id;
		  empName=name;
		  
	  }
	 
	  
	  public static void main(String[] args) {
		  int a=10;
		  ConstructorOverloading emp2=new ConstructorOverloading(10111,"Rubika");
		  System.out.println(emp2.empId);
		  System.out.println(emp2.empName);
		
	}
	  
		  
	  
	  
		
		
	

	

	}


