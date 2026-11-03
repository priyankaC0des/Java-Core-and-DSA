//Reverse the number num ------

import java.util.Scanner;
public class Reverse_Num{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
        int rem = num%10;
            rev = rev*10+rem;
            num/=10;
        }
        System.out.println("Reverse of the number is : "+rev);
    }
}