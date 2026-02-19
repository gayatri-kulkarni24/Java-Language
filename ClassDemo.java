import java.util.*;
public class ClassDemo{
    class Circle{
       int radius=2;
        String color;
        void accept(){
            System.out.print("Enter radius=");
            int r=sc.nextInt();
        }
    }
    public static void main(String[] args){
      Circle c=new Circle();
      c.accept();
    }
}
