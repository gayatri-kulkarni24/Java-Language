import java.util.*;
public class javaBasics{
    public static void main(String[] args){
    int a=10;
    int b=20;
    int c=30;
    int d=40;


    //Logical AND (&&) Operator
   System.out.println(b>a && d>c);//true
   System.out.println(b<a && d<c);//false
   System.out.println(b>a && d<c);//false
   System.out.println(b<a && d>c);//false

    //Logical OR (||) Operator
    System.out.println(b>a || d>c);//true
    System.out.println(b<a || d<c);//false
    System.out.println(b>a || d<c);//true
    System.out.println(b<a || d>c);//true

    //Logical NOT Operator (!)
    System.out.println(!(a<b));//false
    }
}
