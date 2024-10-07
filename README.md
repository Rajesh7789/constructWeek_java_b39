# Java Projects: Employee Details Management & Finding the Second Largest Number

## Introduction
This repository contains two basic Java projects:

1.Employee Details Management: A console-based application where users can input employee details such as name, ID, and monthly salary. The application calculates and displays the annual salary for each employee.
2.Finding the Second Largest Number: A program that allows users to input an array of integers, then finds and displays the second largest number from the array.

Both projects demonstrate core Java principles such as object-oriented programming, loops, arrays, and user input handling via the Scanner class.

## Project Type
Backend(console-based-application)

## Directory structure
java-projects/
├─ employee-details/
│  ├─ Employee.java  # Class that holds employee data and methods
│  ├─ Main.java      # Main program that takes input and displays employee details
├─ second-largest-number/
│  ├─ Main.java      # Program to find second largest number in an array

## Video Walkthrough of the Project
[click here for the video demo ] (https://youtu.be/QqnOVhVcho8)

## Features
### Employee Details Management Project
Input employee details (Name, ID, and Monthly Salary).
Calculate and display the annual salary of each employee.
Show a list of all employee details in a structured format.
### Finding the Second Largest Number Project
Input an array of integers from the user.
Efficiently find and display the second-largest number.
Handle edge cases, such as arrays with identical elements or too few unique numbers.

## Design Decisions or Assumptions
### Employee Details Management Project
Object-Oriented Approach: The Employee class is used to store employee data (name, ID, salary) and calculate the annual salary.
Annual Salary Calculation: It assumes a year has 12 months, and the annual salary is derived by multiplying the monthly salary by 12.
### Finding the Second Largest Number Project
Efficient Algorithm: The second largest number is determined in a single pass through the array using comparisons.
Edge Case Handling: If the array has fewer than two distinct numbers, the program alerts the user that no second largest number is available.

## Installation & Getting Started
### Prerequisites
You need to have the Java Development Kit (JDK) installed on your system. To check if Java is installed, use the following command:
java -version
### Step 1: Clone the repository
git clone [https://github.com/your-repo/java-projects.git](https://github.com/Rajesh7789/constructWeek_java_b39.git)
cd projects
### Step-2: For Employee Details Management Project
1- Navigate to the emolyee directory
2- Compile the program
3- Run the program
### Step 3: For Finding the Second Largest Number Project
1- Navigate to the secondLargestNumber directory
2- Compile the program
3- Run the program

## Usage
### Employee Details Management Project
Upon running the program, it will ask for the number of employees. For each employee, you will be prompted to enter the name, ID, and monthly salary. The program will then calculate and display the employee’s annual salary.

### Example Input
Enter the number of employees: 2
Enter details for Employee 1:
Name: Alice
ID: E001
Monthly Salary: 3000

Enter details for Employee 2:
Name: Bob
ID: E002
Monthly Salary: 4000

### Example Output
Employee Details:
Name: Alice, ID: E001, Monthly Salary: 3000, Annual Salary: 36000
Name: Bob, ID: E002, Monthly Salary: 4000, Annual Salary: 48000

### Finding the Second Largest Number Project
The program will ask you to input the size of the array and then enter each element. Once all elements are entered, it will display the second largest number.

### Example Input
Enter the size of the array: 5
Enter the elements of the array: 12 35 1 10 34 1

### Example Output
The second largest element is: 34

## Credentials
No authentication is required since both projects are simple console applications.

## APIs Used
No external APIs are used in these projects.

## API Endpoints
Not applicable for these projects, as they are console-based applications with no backend or web service functionality.

## Technology Stack
Java: The core programming language for both projects.
Scanner Class: Used to handle user input from the console.
Arrays: Employed in the Second Largest Number project to store and manipulate data.



