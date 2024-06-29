import java.util.Scanner;  // Import the Scanner class for taking user input

public class StudentGradeCalculator {  // Define the main class
    
    public static void main(String[] args) {  // Main method
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for input

        // Input: Take marks obtained in each subject
        System.out.print("Enter the number of subjects: ");  // Prompt user for number of subjects
        int numSubjects = scanner.nextInt();  // Read the number of subjects
        
        int[] marks = new int[numSubjects];  // Initialize an array to store marks for each subject
        for (int i = 0; i < numSubjects; i++) {  // Loop through each subject
            System.out.print("Enter marks for subject " + (i + 1) + ": ");  // Prompt user for marks of subject
            marks[i] = scanner.nextInt();  // Read and store the marks in the array
        }

        // Calculate Total Marks
        int totalMarks = 0;  // Initialize totalMarks to 0
        for (int mark : marks) {  // Loop through each mark in the array
            totalMarks += mark;  // Add each mark to totalMarks
        }

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numSubjects;  // Calculate average by dividing totalMarks by number of subjects

        // Grade Calculation
        char grade;  // Variable to store the grade
        if (averagePercentage >= 90) {  // Check if average percentage is 90 or above
            grade = 'A';  // Assign grade A
        } else if (averagePercentage >= 80) {  // Check if average percentage is 80 or above
            grade = 'B';  // Assign grade B
        } else if (averagePercentage >= 70) {  // Check if average percentage is 70 or above
            grade = 'C';  // Assign grade C
        } else if (averagePercentage >= 60) {  // Check if average percentage is 60 or above
            grade = 'D';  // Assign grade D
        } else {  // If average percentage is below 60
            grade = 'F';  // Assign grade F
        }

        // Display Results
        System.out.println("Total Marks: " + totalMarks);  // Print total marks
        System.out.println("Average Percentage: " + averagePercentage + "%");  // Print average percentage
        System.out.println("Grade: " + grade);  // Print grade

        scanner.close();  // Close the scanner object to free resources
    }
}
