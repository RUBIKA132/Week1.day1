package week4.day3;

import java.util.HashSet;

import java.util.Set;

public class UniqueCharacter {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="babub";
		char[]charArray=str.toCharArray();
		Set<Character>chr=new HashSet<Character>();
		chr.add('b');
		chr.add('a');
		chr.add('b');
		chr.add('u');
		chr.add('b');
		
		chr.remove('b');
		System.out.println(chr);
		
		

	}

}
