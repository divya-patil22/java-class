public  class UniqueArray{
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4, 5, 5, 6};
        int freq = 0;
        for (int i = 0; i < arr.length; i++) {
            freq = 0;
           for (int j= 0; j < arr.length; j++) {
               if(arr[i] == arr[j]){
                freq++;
               } 
               
           }
           System.out.println("Frequency of "+ arr[i] + " is "+ freq);
           
         
        }
        
           
    }
}
