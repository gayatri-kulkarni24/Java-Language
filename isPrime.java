import java.util.*;
public class functions{
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        if(isPrime(11)==true){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }

    }
}
