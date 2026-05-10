public class Bike{

    public static int calculateWage(int successfulDeliveries) {
        int AmountRate;
        if (successfulDeliveries < 50) {
            AmountRate = 160;
        } else if (successfulDeliveries < 60) {
            AmountRate = 200;
        } else if (successfulDeliveries < 70) {
            AmountRate = 250;
        } else {
            AmountRate = 500;
        }
        return (successfulDeliveries * AmountRate) + 5000;
    }
    public static void main(String[] args) {
        System.out.println(calculateWage(25));
        System.out.println(calculateWage(55));
        System.out.println(calculateWage(65));
        System.out.println(calculateWage(80));
    }
}
