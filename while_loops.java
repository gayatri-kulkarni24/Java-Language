import java.util.*;
public class loops{
    public static void main(String args[]){

        //example 1
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter how many numbers to be input:");
          int nums = sc.nextInt();
          int sumEven =0;
          int sumOdd =0;
          while(nums>0){
              int currNum =sc.nextInt();
              if(currNum%2==0){
                  sumEven=sumEven+currNum;
              }
              else{
                  sumOdd=sumOdd+currNum;
              }
              nums--;
          }
          System.out.println("sum of even number: " +sumEven);
          System.out.println("sum of odd number: " +sumOdd);


        //example 2
            int n=sc.nextInt();
            int i=1;
            int sum=0;
            while(i<=n){
              sum+=i;
              i++;
            }
            System.out.println("sum is " +sum);

    //example 3
          //reverse of a number
            int n=234567;
            while(n>0){
                int lastDigit =n%10;
                System.out.print(lastDigit);
                n=n/10;
            }
            System.out.println();


             //reverse the given number
               int n=10899;
               int rev=0;
               while(n>0){
                  int lastDigit =n%10;
                  rev=(rev*10) + lastDigit;
                  n=n/10;
               }
               System.out.print(rev);   
                      
        
    }
}
