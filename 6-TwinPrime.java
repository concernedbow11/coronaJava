public class Main {
    static boolean isPrime(int num){
       boolean flag = false;
         for(int i = 2; i <= num/2; ++i)
         {
             // condition for nonprime number
             if(num % i == 0)
             {
                 flag = true;
                 break;
             }
         }
 
       if (!flag)
             return true;
       else
             return false;
    }
    public static void main(String args[]){
       int j;
       for(int i=3;i<100;i+=2){
          j=i+2;
          if(isPrime(i))
             if(isPrime(j)){
                System.out.println("("+i+","+j+")");
             }
       }
 
    }
 }