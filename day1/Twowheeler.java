package week1.day1;

public class Twowheeler {

	public Twowheeler() {
		// TODO Auto-generated constructor stub
	}
	
	int numberofwheels=2; 
	short numberofmirrors=2;
	long chassisnumber=344334;
	boolean ispuntured=false;
	String bikename="ROYALENFIELD" ;
	double runningkm=34563.3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twowheeler object=new Twowheeler();
		System.out.println(object.numberofwheels);
		System.out.println("numberofmirrors"+object.numberofmirrors);
		System.out.println(object.chassisnumber);
		System.out.println(object.ispuntured);
		System.out.println(object.bikename);
		System.out.println(object.runningkm);
		

	}

}
