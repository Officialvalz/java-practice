import java.util.Scanner;
public class PrimeNumbers{
	public static void main(String...args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter A Number: ");
	int num = input.nextInt();

	
	if ((num % 1 == 0)  ||  (num % 2 == 0)){

	System.out.println(num + " Is A Prime Number");

}

	else{

		System.out.println(num + " Is Not A Prime Number");
}







}
}