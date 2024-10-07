package projects;

import java.util.Scanner;

public class Employee {
	
	// Instance variables to store employee details
	String name;
	String id;
	int monthlySalary;
	

    // Constructor to initialize Employee object
	public Employee(String name, String id, int monthlySalary) {
		this.name = name;
		this.id = id;
		this.monthlySalary = monthlySalary;
	}
	
	

    // Method to display employee details
	public void displayDetails() {
		System.out.print(" Name: " + name+",");								// print employee name
		System.out.print(" Id: "+ id+",");									// print employee id
		System.out.print(" Monthly Salary: "+ monthlySalary+",");			// print monthly salary
		System.out.print(" Annual Salary: "+ calculateAnnualSalary());		// print annual salary
		System.out.println();			// blank line for better readability
	}
	
	

    // Method to calculate the employee's annual salary
	public int calculateAnnualSalary() {
		return monthlySalary * 12;
	}

	// main method, program exicution starts here
	public static void main(String[] args) {
		
		//scanner object to read user input
		Scanner sc = new Scanner(System.in);
		
		// promot user to enter the no of employee
		System.out.println("Enter the no. of employee:");
		int	empCount = sc.nextInt();			// Read the number of employees

		sc.nextLine();							// Consume the newline character
		
		// create an array to hold the employee objects
		Employee[] emp = new Employee[empCount];
		
		
		// loop to gather details of each employee
		for(int i=0; i<empCount; i++) {
			System.out.println("Enter the details of employee "+(i+1)+":");
			
			// promt and read users name
			System.out.println("Enter the name of the employee");
			String name = sc.nextLine();
			
			// prompt and read employee's id 
			System.out.println("Enter the id of the employee");
			String id = sc.nextLine();
			
			// Prompt and read monthly salary
			System.out.println("Enter the monthly salary of the employee");
			int monthlySalary = sc.nextInt();
			sc.nextLine();
			
			// create a new employee object and store it an array
			emp[i] = new Employee(name, id, monthlySalary);
		}
		
		// display details of all employee
		System.out.println("Employee all details:");
		for (Employee employee : emp) {
			employee.displayDetails(); 					// call methods to display all the details of the employee
		}
		
		
		// close the scanner
		sc.close();
	}

}
