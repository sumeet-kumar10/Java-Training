package stackOperation;

import java.util.Scanner;


public class FixedStack implements NewStack {
		public void push() {
			int[] arr = new int[5];
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter array elements(other than -ve):");
			for(int i=0; i<arr.length; i++) {
				arr[i] = input.nextInt();
			}
			pop(arr);
			
		}

		public void pop(int[] arr) {
			System.out.println("");
			for(int i=arr.length-1; i>=0; i--) {
				
				if(i == arr.length-1) {
					arr[i] = -1;	//-1 indicates element is deleted
				}
				System.out.println(arr[i]);
			}
		}

//		@Override
		public void pop() {}



}
