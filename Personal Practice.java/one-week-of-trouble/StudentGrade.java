import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student score: ");
        int score = input.nextInt();

        if (score >= 70 && score <= 100) {
            System.out.println("Grade: A");
        }

        else if (score >= 60 && score <= 69) {
            System.out.println("Grade: B");
        }

        else if (score >= 50 && score <= 59) {
            System.out.println("Grade: C");
        }

        else if (score >= 45 && score <= 49) {
            System.out.println("Grade: D");
        }

        else if (score >= 0 && score <= 44) {
            System.out.println("Grade: F");
        }

        else {
            System.out.println("Invalid score");
        }
    }
}