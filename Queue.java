import java.util.Scanner;

public class CaesarCipher {

    public static String encrypt(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char charAt = text.charAt(i);

            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    encryptedText.append((char) ('A' + (charAt - 'A' + key) % 26));
                } else {
                    encryptedText.append((char) ('a' + (charAt - 'a' + key) % 26));
                }
            } else {
                encryptedText.append(charAt);
            }
        }
        return encryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Cleartext: ");
        String text = scanner.nextLine();
        System.out.print("Enter a value for k: ");
        int key = scanner.nextInt();
        String encryptedText = encrypt(text, key);
        System.out.println("Ciphertext: "+ encryptedText);
        
    }
}