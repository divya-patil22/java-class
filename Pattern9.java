public class Pattern9 {
   void pattern1(int n){
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
    void pattern2(int n){
        for(int i= n; i >= 0; i--){
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
    public static void main(String[] args) {
        int n= 5;
        Pattern9 pt = new Pattern9();
       pt. pattern1(n);
       pt.pattern2(n);
    
  }
}
