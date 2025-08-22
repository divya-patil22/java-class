import java.util.Scanner;

public class StringOccurence{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int[] count = new int[256]; // Increased array size to fix the error

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + " : " + count[i]);
            }
        }

        scanner.close();
    }
}
