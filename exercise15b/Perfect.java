package exercise15b;

public class Perfect {
	static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num/2; i++){
            if (num % i == 0)
                sum = sum + i;
        }

        return sum == num;

    }
}
