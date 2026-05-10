//Account class that contains a nmae, instance variable and the set and get method to get the value

//Class name, method name, varaible names are all called IDENTIFIER

//Instance variables are carried with it throughout its lifetime....thats why its varries, its always in use by different objects

//INSTANCE variables exist before a method is called on an object, while the method is excuting and after the method is done executing.

//Instance variables are declared inside a class declaration but outside the bodies of the class’s methods

//String variables can hold character string values such as "Jane Green". If there are many Account objects, each has its own name. Because name is an instance variable, it can be manipulated by each of the class’s methods

//Variables or methods declared with private are accessible only to methods of the class in which they’re declared. So, the variable name can be used only in each Account object’s methods
import java.util.Scanner;
public class Account{

    private String name;
    private int age;
    private String gender;

    public void setName(String name){this.name = name;}
    public void setAge(int age){if(age > 0){this.age = age;}}
    public void setGender(String gender){this.gender = gender;}

    public String getName(){return name;}
    public int getAge(){return age;}
    public String getGender(){return gender;}


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
