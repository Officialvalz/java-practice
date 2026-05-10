import java.util.Scanner;
public class NegativeAndPositiveNumber{
	public static void main(String...args){

Scanner input = new Scanner(System.in);

System.out.print("Enter A Number From 0 to 100");
int numb = input.nextInt();

if (numb < 0){
System.out.println("Number is Negative");
}

else if (numb >0){
System.out.println("Number Is Positive");
}

else{
System.out.println("number is zero");
}

}




}