public class nn {

    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i<=n; i++ ) f = f*i;{
        
        }
        return f;
       
    }
   

   public static void main (String[]args){
    int num = 5;
    int result = factorial(num);
    System.out.println("factorial of " + num + " is " + result);
   }
}
