import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter message: ");
        String message = input.nextLine();

        System.out.print("Enter shift value: ");
        int shift = input.nextInt();

        String encrypted = "";

        for (int i = 0; i < message.length(); i++) {

            char letter = message.charAt(i);

            if (letter >= 'A' && letter <= 'Z') {

                letter = (char)(letter + shift);

                if (letter > 'Z') {
                    letter = (char)(letter - 26);
                }
            }

            else if (letter >= 'a' && letter <= 'z') {

                letter = (char)(letter + shift);

                if (letter > 'z') {
                    letter = (char)(letter - 26);
                }
            }

            encrypted += letter;
        }

        System.out.println("Encrypted message: " + encrypted);
    }
}