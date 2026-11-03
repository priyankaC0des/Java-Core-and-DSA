//Count the same number of digits in a number --------

import java.util.Scanner;
public class Count_Nums{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long num = sc.nextLong(); //log to handle big numbers---
        System.out.println("Enter the digit to count : ");
        int digit = sc.nextInt();   
        int count = 0;
        while(num>0){
            long rem = num%10;
            if(rem==digit){
                count++;
            }
            num/=10;
        }
        System.out.println("Count of "+digit+" is : "+count);

    }
}