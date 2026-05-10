import java.util.Scanner;
public class CheckForLargest{
	public static void main(String...args){

	Scanner input = new Scanner(System.in);

	for (int count = 1; count <= 5; count++){
	System.out.print("Enter Number 1: ");
	int num1 = input.nextInt();

	System.out.print("Enter Number 2: ");
	int num2 = input.nextInt();


	if(num1 == num2){
	System.out.println("Both numbers are equal");
	}

	else if (num1 > num2){
	System.out.println("firstNumber is greater than the secondNumber");
	}

	else{
	System.out.println("secondNumber is greater than firstNumber");
	}


}







}	
}