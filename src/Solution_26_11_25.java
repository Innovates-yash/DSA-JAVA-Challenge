// check if a number is divisible by 5

import java.util.Scanner;

public class Solution_26_11_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int n = sc.nextInt();


        if( n % 5 == 0 ){
            System.out.println(n + " It is divisible by 5");
        }else{
            System.out.println(n + " It is not divisible by 5");
        }
    }
}