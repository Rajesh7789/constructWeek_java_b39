package projects;

import java.util.Scanner;

public class Finding_2nd_largest_number {

	public static void main(String[] args) {
		
		// Creating a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);
		
		// prompt the user to enter the size of the array.
		System.out.println("Enter the size of the array");
		int size = sc.nextInt(); //user input for the array size
		
		// Create an array with the size given by the user
		int[] numberList =  new int[size]; 
		//prompt the user to enter the elements of the array
		System.out.println("Enter the elements of the array");

		
		for(int i=0; i<size; i++) {
			numberList[i] =sc.nextInt();  		// user input for each element of the array
		}
		
		// initialize the largest and second largest numbers
		int max = Integer.MIN_VALUE;			// start with the smallest possible Integer
		int secondMax = Integer.MIN_VALUE;		// start with the smallest possible integer
		
		
		// loop through the array to find the second largest integer 
		for(int i = 0; i<size; i++) {
			if(max<numberList[i]) {				// if the max is smaller than current number
				secondMax = max;				// change the value of second largest to largest
				max = numberList[i];			// change the value of largest element to the current element.
				
			// if the second largest number is smaller than the current number and the current number is not equal to max	
			} else if (secondMax < numberList[i] && numberList[i] != max) {
				secondMax = numberList[i];		// change the value of second largest number to current number 
			}
			
		}
		
//		Arrays.sort(numberList);
		
		
		if(secondMax == Integer.MIN_VALUE) {
			// if the second largest number is still integet.min value then no second largest number is present
			System.out.println("There is no second largest value present in it");
		}else {
			// print the second largest number
			System.out.println("The second largest no is: " + secondMax);
		}
		
		
		sc.close();				// closing the scanner to prevent any sort of data leakage.
	}

}
