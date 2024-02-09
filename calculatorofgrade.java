import java.util.Scanner;

public class CalculatorOfGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained in each subject
        System.out.println("Enter marks obtained in each subject:");

        // Assuming there are Five subjects for demonstration purposes
        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();

        System.out.print("Subject 4: ");
        int subject4 = scanner.nextInt();
      
        System.out.print("Subject 5: ");
        int subject5 = scanner.nextInt();

        // Calculate Total Marks
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / 5; // Assuming there are Five subjects

        // Grade Calculation
        char grade = calculateGrade(averagePercentage);

        // Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Grade Calculation Method
    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
