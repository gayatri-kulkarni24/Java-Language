import java.util.*;
public class javaBasics{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
    //if-else 
    int a=20;
    int b=50;
    if(a>b){
        System.out.println("largest is "+a);
    }else{
        System.out.println("largest is"+b);
    }
    System.out.println("Enter a input");
    int num=sc.nextInt();
    if(num%2==0){
        System.out.println("even");
    }else{
        System.out.println("odd");
    }
    }
}
