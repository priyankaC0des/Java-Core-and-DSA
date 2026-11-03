//Print a right angled triangle of * with n rows of input from user ---

import java.util.Scanner;
public class Right_angled_triangle{
    public static void main(String[] agrs){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}