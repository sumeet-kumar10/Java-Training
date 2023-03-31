package exercise15b;

public class Palindrome {
	 static boolean isPalindrome(int n) {
		  int temp = n;
		  int rem,reverse = 0;
		  while (temp != 0)
	       {
	     	rem = temp % 10;
	     	reverse = reverse * 10 + rem;
	     	temp /= 10;
	       };

	     return n == reverse;

	}
}
