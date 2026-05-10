import java.util.Scanner;
public class PizzaWahala {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int people = input.nextInt();
        input.nextLine();

        System.out.print("Enter pizza type: ");
        String pizzaType = input.nextLine();

        int slicesPerBox = 0;
        int pricePerBox = 0;

        if (pizzaType.equalsIgnoreCase("Sapa Size")) {
            slicesPerBox = 4;
            pricePerBox = 2000;
        } else if (pizzaType.equalsIgnoreCase("Small Money")) {
            slicesPerBox = 6;
            pricePerBox = 2400;
        } else if (pizzaType.equalsIgnoreCase("Big Boys")) {
            slicesPerBox = 8;
            pricePerBox = 3000;
        } else if (pizzaType.equalsIgnoreCase("Odogwu")) {
            slicesPerBox = 12;
            pricePerBox = 4200;
        } else {
            System.out.println("Invalid pizza type");
            return;
        }

        int boxes = (int) Math.ceil((double) people / slicesPerBox);
        int totalSlices = boxes * slicesPerBox;
        int leftover = totalSlices - people;
        int totalPrice = boxes * pricePerBox;

        System.out.println("Boxes needed: " + boxes);
        System.out.println("Leftover slices: " + leftover);
        System.out.println("Total price: " + totalPrice);
    }
