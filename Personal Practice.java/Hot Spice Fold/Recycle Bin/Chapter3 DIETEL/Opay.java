import jav.util.SCanner;
public class Opay extends Account{
public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    Account myAccount = new Account();

    System.out.println("Enter your name");
    String theName = input.nextLine();
    myAccount.setName(theName);
    System.out.println();
    
    System.out.println("Name in the object myAccount is " + myAccount.getName());

}



}


