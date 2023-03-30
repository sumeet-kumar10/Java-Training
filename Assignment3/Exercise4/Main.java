package Exercise4;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();

		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();

		try {
			while (true) {
				System.out.printf("%02d : %02d : %02d ", hour, minute, second);
				System.out.println();
				
				second++;

				if (second == 60) {
					minute += 1;
					second = 0;
				}
				if (minute == 60) {
					hour += 1;
					minute = 0;
				}
				if (hour == 24) {
					hour = 0;
					minute = 0;
					second = 0;
				}

				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
