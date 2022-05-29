package week3.Day2;

public class Array {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,5,4,7,2,3,6,99,6,7,1};
		for (int i = 0;i <=arr.length; i++) {
		for(int j = i+1;j <arr.length; j++) {
		     if(arr[i] == arr[j])  
		System.out.println(arr[i]);
		     }
		     
		}
	}
}


		
		

	


