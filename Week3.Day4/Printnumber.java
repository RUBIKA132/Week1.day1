package week3.Day4;

public class Printnumber {

	public Printnumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Amazon has more than 17,865 employees in chennai";
		String replaceAll = name.replaceAll("\\D","");
		System.out.println(replaceAll);
		
		
		String name1 = "testleaf";
		String replaceAll1=name1.replaceAll("[aeiou]", "");
		System.out.println(replaceAll1);
		
		String word = "I like chicken briyani";
		
		
		System.out.println(word.length());
		
		
		
		

	}

}
