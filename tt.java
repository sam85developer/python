public class tt{
    public static int getlargest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<number.length; i++){
            if(largest<number[i]){
                largest= number[i];
            }
        }
        return largest;
    }
   public static void main(String[] args) {
       int number [] = { 4,5,6,7};
      System.out.println(" In this array largest value is " + getlargest(number));
   }
    }
    
    
