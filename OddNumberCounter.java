public class OddNumberCounter {
    public static void main(String[] args) {

        int count = 0;

        for(int i = 0; i<=50; i++){

            if(i % 2 != 0){
                
                count++;
            } 
        }
        System.out.println("Count of odd numbers between 1 to 50 is: "+count);
    }
    
}
