import java.util.Scanner;
public class switchCase{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any day of the week between(1-7): ");
        int day = obj.nextInt();

        switch(day){
            case 1: System.out.println("Monday");
            break;

            case 2: System.out.println("Tuesday");
            break;

            case 3: System.out.println("wednesday");
            break;

            case 4: System.out.println("Thursday");
            break;

            case 5: System.out.println("Friday");
            break;

            case 6: System.out.println("Saturday");
            break;

            case 7: System.out.println("Sunday");
            break;

            default : System.out.println("Invalid day!");
        }
    }

}