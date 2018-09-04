package niel905g;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a message to be encrypted: ");
            String besked = scanner.nextLine();

            String code = AESencrypt.encrypt(besked);
            System.out.println(code);

            String decoded = AESencrypt.decrypt(code);
            System.out.println(decoded);

        } catch (java.lang.Exception ex) {
            System.out.println(ex.toString());
        }
    }
}