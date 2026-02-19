import java.util.*;
public class typecasting{
    public static void main(String[] args){
      char a='a';
      char b='b';
      System.out.print((int)b);
      System.out.print((int)a);
      System.out.println(b-a);
      int a=10;
      float b=20.30f;
      long c=2566;
      double d=30.67;
      double ans=a+b+c+d;
      System.out.println(ans);
      byte b=5;
      b=( byte )(b*2);
      System.out.print(b);

    }
}
