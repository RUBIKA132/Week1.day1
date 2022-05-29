package week4.Day1;

public class Bank extends Loan implements Cibil,PNB {

	public void cibilscore() {
		// TODO Auto-generated method stub
		System.out.println("2000");
		
	}

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("12000");
		
	}

	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("45000");
		
	}

	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("340-650");
		
	}

	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("350");
		
	}
	
	public static void main(String[] args) {
		//Bank extends of object
		Bank val1=new Bank();
		val1.SBILoan();
		val1.bankBalance();
		val1.maximumLoanAmount();
		
		//CIBIL Implement of Object
		Cibil val2=new Bank();
		val2.cibilscore();
		
		//PNB Implement of Object
		PNB val3=new Bank();
		val3.minimumBalance();
		val3.creditScore();
		val3.maximumLoanAmount();
		
	}

}
