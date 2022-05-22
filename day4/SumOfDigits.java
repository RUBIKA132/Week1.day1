package week1.day4;

public class SumOfDigits {

	public SumOfDigits() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 123;
		int sum = 0;
		while(a>0)  {
	    int rem = a%10;
	    sum = sum +rem;
	    a=a/10;
		}
        System.out.println(sum);
	}

}
