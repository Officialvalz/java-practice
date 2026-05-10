public class Details{

public static void main(String [] args){

    Moniepoint person1Account = new Moniepoint(); 

    person1Account.firstName = "Bright";
    person1Account.lastName = "Ifeanyi";
    person1Account.password = "234571";
    person1Account.phonenumber = "08081654214";
    person1Account.age = 25;
    person1Account.address = "2, Micheal andrew street";
    person1Account.localGovernmentArea = "Alimosho";
    person1Account.country = "Nigeria";

    person1Account.deposit();
    person1Account.withdraw();

    System.out.println(person1Account.firstName);
    System.out.println(person1Account.lastName);
    System.out.println(person1Account.password);
    System.out.println(person1Account.phonenumber);
    System.out.println(person1Account.age);
    System.out.println(person1Account.address);
    System.out.println(person1Account.localGovernmentArea);
    System.out.println(person1Account.country);
}
}
