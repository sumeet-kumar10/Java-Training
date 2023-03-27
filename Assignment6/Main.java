package train;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		Scanner scan = new Scanner(System.in);
		int holiday = 0;
		int count = 0;

		// allow to take user input
		System.out.println("Enter the speed(km/hr): ");
		int speed = scan.nextInt();
		System.out.println("Enter the distance(km): ");
		int distance = scan.nextInt();

		Truck truck = new Truck(0, 0);
		Destination destination = new Destination(0, 0, 0, 0);

		// setting the truck speed and distance
		truck.setSpeed(speed);
		truck.setDistance(distance);

		// calculated the time taken
		int timeTaken = truck.getDistance() / truck.getSpeed();

		// to get the day and hour left
		int day = 0;
		int hourLeft = 0;
		int quotient = timeTaken / 8;
		day += quotient;

		int remainder = timeTaken % 8;
		hourLeft += remainder;

		// setting up the destination
		destination.setDay(day);
		destination.setHour(hourLeft);

		// printing the local date
		System.out.println("Starting date: " + date);

		// checking the conditions for holiday
		while (count <= destination.getDay()) {
			if ((date.getMonthValue() == 1 && date.getDayOfMonth() == 26) || (date.getDayOfWeek() == DayOfWeek.SUNDAY)
					|| (date.getDayOfWeek().getValue() == 6 && date.getDayOfMonth() > 8 && date.getDayOfMonth() < 15)
					|| (date.getMonthValue() == 8 && date.getDayOfMonth() == 15)) {
				holiday++;

			}
			date = date.plusDays(1);
			count++;
		}

		System.out.print("Days taken from today: " + (destination.getDay() + holiday) + " ");
		System.out.println("and Hours taken is: " + destination.getHour());

	}

}

class Truck {
	int speed;
	int distance;

	Truck(int t, int d) {
		this.speed = t;
		this.distance = d;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int time) {
		this.speed = time;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

}

class Destination {
	int hour;
	int day;

	public Destination(int second, int minute, int hour, int date) {
		this.hour = hour;
		this.day = date;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

}