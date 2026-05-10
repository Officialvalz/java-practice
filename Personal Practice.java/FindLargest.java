import java.util.Scanner;
public class FindLargest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	int num = 0;
        int max = num;
        int min = num;

        for (int index = 0; index <= num; index++){
            System.out.print("Enter number " + i + ": ");
            num = input.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("Largest number = " + max);
        System.out.println("Smallest number = " + min);
    }
}