import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean ceaserCipherRunning = true;
        EncryptMe encrypt = new EncryptMe();

        while (ceaserCipherRunning) {
            System.out.println("Welcome to Ceaser Cipher program would you like to encrypt, decrypt or exit ?");

            String choice = myScanner.nextLine();
            if (choice.equalsIgnoreCase("encrypt")) {

                System.out.println("Enter the text to encrypt: ");
                String text = myScanner.nextLine();
                System.out.println("Enter shift key");
                int shiftKey = myScanner.nextInt();
                String cipherText = (encrypt.encodeMethod(text, shiftKey));

                System.out.println("Here is your encrypted story:");
                System.out.println(cipherText);
                System.out.println("-------------------------------");

            } else if (choice.equalsIgnoreCase("decrypt")) {
                System.out.println("Enter the text to decrypt");
                String encryptedText = myScanner.nextLine();
                System.out.println("Enter shift key");
                int shiftKey = myScanner.nextInt();
                DecryptMe decrypt = new DecryptMe();
                String decryptedText = decrypt.decodeMethod(encryptedText, shiftKey);
                System.out.println("Below is your deciphered text");
                System.out.println(decryptedText);
                System.out.println("---------------------------------");


            } else if (choice.equalsIgnoreCase("exit")) {
                ceaserCipherRunning = false;

            } else {
                System.out.println("Invalid choice, please choose encrypt or decrypt");
            }
        }
    }


}