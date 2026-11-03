//Check the case of a given alphabet whther it is uppercase orlowercase---

import java.util.Scanner;
public class Case_check {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch = sc.next().trim().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }else if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Not an alphabet");
        }
    }
}
