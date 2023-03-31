package exercise15a;

class Program15a {

public static boolean checkPrime(int num){
	    
	    if(num<2){
	        return false;
	    }
	    else{
	        for(int i=2;i<num/2;i++){
	            if(num%i==0){
	                return false;
	            }
	        }
	    }

	    return true;

	}
}
