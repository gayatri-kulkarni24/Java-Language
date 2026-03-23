import java.util.*;
public class functions{
  public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
public static void main(String args[]){
    primeInRange(50);
}
}
