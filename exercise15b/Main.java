package exercise15b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num, len;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		len = order (num);
		
	    if (Armstrong.armstrong (num, len))
	        System.out.println(num + " is armstrong");
	    else {
	        System.out.println(num + " is not armstrong");}


	    if (Perfect.isPerfect(num))
            System.out.println (num + " is a perfect number");
        else
            System.out.println (num + " is not a perfect number");
	    
	    
	    if (Palindrome.isPalindrome(num))
            System.out.println (num + " is a palindrome number");
	    else
	    	System.out.println(num + " is not a palindrome number");
      
    }
	
	static int order (int x)
	  {
	    int len = 0;
	    while (x != 0 )
	      {
		len++;
		x = x / 10;
	      }
	    return len;
	  }

}