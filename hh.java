public class hh{
    public static void  bubbl(int arr[] ){
  for(int turn = 0; turn <arr.length -1; turn ++){
    for (int j = 0; j<=arr.length-2-turn; j++){
        if(arr[j]>arr[j+1]){
  //swap
  int temp = arr[j];
  arr[j] = arr[j+1];
  arr[j+1] = temp;
        }
    }
  }
  }
  public static void selection(int arr[]){
    for(int i = 0; i<arr.length-1;i++){
        int minpos = i;
        for(int j = i+1;j<arr.length;j++){
            if(arr[minpos] >arr[j]){
                minpos = j;
            }
        }
        int temp = arr[minpos];
        arr[minpos] = arr[i];
        arr[i] = temp;
    }
  }
   public static void printarray(int arr[]){
    for(int i = 0; i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
    public static void main(String[] args) {
        int [] arr = {3,6,2,1,8,7,4,5,3,1};
        bubbl(arr);
        printarray(arr);                                                               
        }
    
        }
   