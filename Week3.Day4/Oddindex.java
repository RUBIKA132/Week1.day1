package week3.Day4;

public class Oddindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String text = "welcome";
	    char[] str = text.toCharArray();
	    
	    for(int i = 0;i<str.length;i++) {
		       if (i %2!=0)  {
	    	        str[i]=Character.toUpperCase(str[i]);
	       }
	       System.out.println(str[i]);
	
			
			
		
	    }
	}

}
		
	
		
	


