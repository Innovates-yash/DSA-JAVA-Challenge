// Take a number and print whether its positive , negative or zero

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");

        int number = sc.nextInt();
        if(number > 0 ){
            System.out.println(number +" It is a positive number" );
        } else if (number < 0) {
            System.out.println(number + " It is a negative number");
        } else{
            System.out.println(number + " It is a Zero value");
        }
    }
}