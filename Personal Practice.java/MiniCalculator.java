import java.util.Scanner;
public class MiniCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Which operator would you like to use? (+, -, *, /): ");
        String operator = input.next();

        for (int index = 1; index <= 10; index++){
            System.out.print("Enter number 1: ");
            int firstNumber = input.nextInt();

            System.out.print("Enter number 2: ");
            int secondNumber = input.nextInt();

            int result = 0;

            if (operator.equals("+")) {
                result = firstNumber + secondNumber;
            } else if (operator.equals("-")) {
                result = firstNumber - secondNumber;
            } else if (operator.equals("*")) {
                result = firstNumber * secondNumber;
            } else if (operator.equals("/")) {
                result = firstNumber / secondNumber;
            }
            System.out.println("Result: " + firstNumber + " " + operator + " " + secondNumber + " = " + result + "\n");
        }

    }
}