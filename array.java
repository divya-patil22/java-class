import java.util.Scanner;

public class array {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter length of an array: ");
    int n = sc.nextInt();

    System.out.println("Enter element of an array: ");
    int arr[] = new int[n];

    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Element of of an array are: ");
    for(int i = 0; i < n; i++){
        System.out.print(arr[i]+ " ");
    }
    
} 

}
