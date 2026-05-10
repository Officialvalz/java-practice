import java.util.Scanner;
public class LeapYear{
	public static void main(String...args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter A Year: ");
	int year = input.nextInt();

	
	if ((year % 400 == 0 ) || (year % 4 == 0  && year % 100 != 0)){
		System.out.println(year + " Is A Leap Year");

}

	else{
		System.out.println(year + " Is Not A Leap Year");



}

}
}