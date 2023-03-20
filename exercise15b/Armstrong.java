package exercise15b;

public class Armstrong {
	static boolean armstrong (int num, int len)
	  {

	    int sum = 0, temp, digit;
	    temp = num;

	    while (temp != 0)
	      {

		digit = temp % 10;


		sum += (int)Math.pow(digit, len);
		temp /= 10;
	      };

	    return num == sum;
	
}
}
