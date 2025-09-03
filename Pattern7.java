public class Pattern7 {
    public static void main(String[] args) {
         int n = 5;
        for(int i= 0; i < n; i++){
            for(int j = 0; j < 5 - i - 1; j++){
                System.out.println(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.println("*");
            }
            for(int j = 0; j < 5 - i - 1; j++){
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}