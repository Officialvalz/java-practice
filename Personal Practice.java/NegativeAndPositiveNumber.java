import java.util.Scanner;
public class NegativeAndPositiveNumber{
	public static void main(String...args){

Scanner input = new Scanner(System.in);

System.out.print("Enter A Number: ");
int numb = input.nextInt();

if (numb < 0){
System.out.println(numb + " Is a Negative Number");
}

else if (numb > 0){
System.out.println(numb + " Is a Positive Number");
}

else{
System.out.println("number is zero");
}

}




}