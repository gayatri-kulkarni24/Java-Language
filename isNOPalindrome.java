import java.util.*;
public class functions{
    public static boolean isNOPalindrome(int palindrome){
        int num=palindrome;
        int reverse=0;
        while(num!=0){
            int rem=num%10;
             reverse=reverse*10+rem;
            num=num/10;
        }
        if(palindrome==reverse){
            return true;
        }
        return false;
     }
  public static void main(String args[]){
      Scanner sc =new Scanner(System.in);
      System.out.print(isNOPalindrome(1299));
}
}
