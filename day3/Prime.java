package week1.day3;

public class Prime {

	public Prime() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =13;
		int count=0;
		for(int i=1;i<=input;i++) {
			if(input%i==0) {
				count++;
			}
			
			
		}
		if(count==2) {
			System.out.println(" prime number");
		}else {
			System.out.println("Not a prime number");
		}
	}

}
