import java.util.*;
public class functions{
      public static int factorial(int n){
          int f=1;
          for(int i=1;i<=n;i++){
              f=f*i;
          }
          return f;
      }
      public static int binCoeff(int n,int r){
          int fact_n=factorial(n);
          int fact_r=factorial(r);
          int fact_nmr=factorial(n-r);
          int binCoef=fact_n/(fact_r*fact_nmr);
          return binCoef;
      }
      public static float avgThreeNo(int a,int b,int c){
              int sum=a+b+c;
              return sum/3;
      }
       public static boolean isEven(int num){
          if(num%2==0){
              return true;
          }
          return false;
       }
      public static void useOfMathClassMethods(){
              System.out.println(Math.min(90,56));
              System.out.println(Math.max(90,56));
              System.out.println(Math.sqrt(64));
              System.out.println(Math.pow(3,2));
              //  System.out.println(Math.avg(56,89,78));
              System.out.println(Math.random());
              System.out.println(Math.floor(78.67));
              System.out.println(Math.abs(-78.7));
        }
         public static void sumOfInt(int num){
            int sum=0;
            while(num!=0){
                int rem=num%10;
                sum=sum+rem;
                num=num/10;
            }
            System.out.println("sum of nums in integer=" +sum);
         }
        public static void main(String args[]){
            Scanner sc =new Scanner(System.in);
            System.out.println(factorial(10));
            System.out.println(binCoeff(5,2));
            System.out.print(avgThreeNo(67,78,89));
            System.out.println(isEven(59));
            useOfMathClassMethods();
            sumOfInt(456);
        }
}
