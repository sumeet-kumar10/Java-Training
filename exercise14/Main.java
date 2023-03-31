package exercise14;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Student student = new Student();
		Result result = new Result();
		
		System.out.println("Student name: "+student.name);
		System.out.println("Student roll No.: "+student.rollNo);
		System.out.println("Enter the marks of three subjects: ");
		result.subject1 = input.nextInt();
		result.subject2 = input.nextInt();
		result.subject3 = input.nextInt();
		
		System.out.println("Total Marks obtained is: "+result.totalMark(result.subject1,result.subject2,result.subject3));
	}
}
