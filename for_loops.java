import java.util.*;
public class loops{
    public static void main(String args[]){
      //example 1
          Scanner sc =new Scanner(System.in);
         System.out.println("Enter how many numbers to be input for factoorial:");
         int num = sc.nextInt();
         int fact =1;
         for(int i=1;i<=num;i++){
            fact=fact*i;   
         }
          System.out.println("factorial of number: " +fact);

         //example 2
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
          
            System.out.println(n + "*" + i + "=" + (n*i));
        }

   //example 3
          for(int line=1;line<=4;line++){
            System.out.println("****");
          }

         //example 4
            //check no is prime or not
           Scanner sc =new Scanner(System.in);
           int n= sc.nextInt();
             if(n==2){
                System.out.println("your given number is prime");
             }
             else{
                boolean isPrime= true;
                for(int i=2;i<=n-1;i++){
                    if(n%i==0){
                        isPrime =false;
                    }
                }
              if(isPrime==true){
                  System.out.println("your given number is prime");
              }
              else{
                   System.out.println("your given number NOT  prime");
              }
    //  }  

    }
}
