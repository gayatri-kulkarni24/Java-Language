import java.util.*;
public class functions{
public static void binaryToDecimal(int binNum){
        int pow=0;
        int decimalNo=0;
        while(binNum>0){
            int lastDigit=binNum % 10;
            decimalNo=decimalNo + (lastDigit*(int) Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal no = " +decimalNo);
    }
public static void main(String args[]){
    binaryToDecimal(1010);
}
}
