import java.util.Scanner;

public class GCD {
    
    // Recursive function to find GCD
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("GCD is: " + gcd(num1, num2));
    }
}

