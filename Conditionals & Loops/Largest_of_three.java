//Largest or maximum value of number of three numbers ------

import java.util.Scanner;
public class Largest_of_three{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if(b>max){
            max = b;
        }if(c>max){
            max = c;
        }
        System.out.println("Largest number is: " + max);
        }
    }

    //inbuilt function to find largest number is Math.max(a, Math.max(b, c));
    /*
    import java.util.Scanner;
    public class Largest_of_three
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       int max = Math.max(c,Math.max(a,b));
        System.out.println("Largest number is: " + max);
     */

