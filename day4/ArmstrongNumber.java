package week1.day4;

public class ArmstrongNumber {

	public ArmstrongNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 371;
		int b = a;
		int sum = 0;
		while(a>0)  {
			int rem=a%10;
			sum = sum+(rem*rem*rem);
			a=a/10;
	}
    if(b==sum)   {
    	System.out.println("armstrong number");
    	
    }
    else  {
    	System.out.println("not an armstrong number");
    }
	}

}
