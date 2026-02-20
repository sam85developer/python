public class string {
    public static int largest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
           if(largest<numbers[i]){
            largest = numbers[i];

}
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {3,4,5,6};
        System.out.println("largest number" + largest(numbers));

    }
    
}
