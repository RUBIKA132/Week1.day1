package org.student;

import org.Department.Department;

public class Student extends Department {
	public void studentName( ) {
		System.out.println("Rubi");
	}
	
	public void studentDept( ) {
		System.out.println("Agri");
	}

	public void studentId() {
		System.out.println("18AG024");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student();
		obj.CollegeName();
		obj.CollegeCode();
		obj.CollegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}

}
