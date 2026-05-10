public class CommisionEmployee extends object [
//public class MyFirstJavaOopFromDietel{
//
//PRIVATE PROPERTIES WITH FINAL
private final String firstName;
private final String lastName;
private final String socailSecurityNumber;
private final double grossSales;
private final double commisionRate;


//CONSTRUCTOR WITH FIVE ARGUMENT 
public CommisionEmployee(String firstName, String lastName, String socailSecurityNumber, double grossSales, double commisionRate){

    if(grossSales < 0.0) {
        throw new IllegalArgumentException("Gross sales must be >= 0.0");
    }
    if(commisionRate <= 0.0 || commisionRate >= 1.0) {
        throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
    }

    this.firstName = firstName;
    this.lastName = lastName;
    this.socailSecurityNumber = socailSecurityNumber;
    this.grossSales = grossSales;
    this.commisionRate = commisionRate;
}

//Create  Get allproperties seperate methods
public String getFirstName() {return firstName;}

public String getLastName() {return lastName;}

public string getSocailSecurityNumber() {return socailSecurityNumber;}

//set grossSales amount
public void setGrossSales(double grossSales) {

    if(grossSales < 0.0) {
        throw new IllegalArgumentException("Gross sales must be >= 0.0");
    }
    this.grossSales = grossSales;
}
 
public double getGrossSales() {return grossSales;}

//set commision rate
public void setCommisionRate(double commisionRate){

    if(commisionRate <= 0.0 || commisionRate >= 1.0){
        throw new IllegalArgumentException("Commsion rate must be > 0.0 and < 1.0");
}

    this.commisionRate = commisionRate;

}
//return commisionRate
public double setCommisionRate () {return commisionRate;}

//calculate earnings
public double earnings(){return commisionRate * grossSales;}


//return string represntation of CommisionEmployee object
//override indicates this method overrides a superclass method
@Override
public String toString() {

    return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
        "commision employee", firstName, lastName,)
        "social security number", socialSecurityNumber,
        "gross sales", grossSales,
        "commision rate", commisionRate);




}
}


