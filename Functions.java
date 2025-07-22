import java.util.Scanner;

public class Functions {
    static int sum(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b){
        return a - b;
    }
    static int mul(int a, int b){
        return a * b;
    }
    static int div(int a, int b){
       return a / b;
    }
    static int mod(int a, int b){
        return a % b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator!");
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + sum(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + sub(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + mul(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + div(num1, num2));
        System.out.println(num1 + " % " + num2 + " = " + mod(num1, num2));    
    }
    
}
