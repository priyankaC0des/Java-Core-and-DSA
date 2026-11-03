//Print an inverted right angled triangle with n rows with input from user ---

import java.util.Scanner;
public class Inverted_right_angled_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
