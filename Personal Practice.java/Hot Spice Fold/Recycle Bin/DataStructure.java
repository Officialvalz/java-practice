public class Moniepoint{

    private String firstName;
    private String lastName;
    private String password;
    private String phonenumber;
    private int age;
    private String address;
    private String localGovernmentArea;
    privateString country;


    public String getName(){ return name: }
    public String setName(String name){ this.name = name: }


    public String getAge(){ return age: }
    public String setName(int age){ this.age = age: }

    }


    public void withdraw(){

    System.out.println("withdrawing");

    }


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

//    person1Account.deposit();
//    person1Account.withdraw();
    System.out.println("Bright Ifeanyi Moniepoint Account Details\n");
    System.out.println("First Name: " + person1Account.firstName);
    System.out.println("Second Name: " + person1Account.lastName);
    System.out.println("Password: " + person1Account.password);
    System.out.println("Phone Number: " + person1Account.phonenumber);
    System.out.println("Age: " + person1Account.age);
    System.out.println("Home Address: " + person1Account.address);
    System.out.println("Local Government Area: " + person1Account.localGovernmentArea);
    System.out.println("Country: " + person1Account.country);
    System.out.println();

    Moniepoint person2Account = new Moniepoint(); 

    person2Account.firstName = "Faith";
    person2Account.lastName = "Dike"
    person2Account.password = "232571";
    person2Account.phonenumber = "07080100701";
    person2Account.age = 29;
    person2Account.address = "2, Samuel andrew street";
    person2Account.localGovernmentArea = "Alimosho";
    person2Account.country = "Nigeria";

//    person1Account.deposit();
//    person1Account.withdraw();
//
    System.out.println("Dike Faith Moniepoint Account Details\n");
    System.out.println("First Name: " + person2Account.firstName);
    System.out.println("Second Name: " + person2Account.lastName);
    System.out.println("Password: " + person1Account.password);
    System.out.println("Phone Number: " + person2Account.phonenumber);
    System.out.println("Age: " + person2Account.age);
    System.out.println("Home Address: " + person2Account.address);
    System.out.println("Local Government Area: " +person2Account.localGovernmentArea);
    System.out.println("Country: " + person2Account.country);




}

}
