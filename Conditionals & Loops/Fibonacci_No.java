//Print the fibonaccii terms upto n numbers---

import java.util.Scanner;
public class Fibonacci_No {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int t1 = 0, t2 = 1;
        System.out.print("Fibonacci Series : ");
        for(int i =1; i<=n; i++){
            System.out.print(t1 + " ");
           int next = t1+t2;
           t1 = t2;
           t2=next; 
        }
    }
}
