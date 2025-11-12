import java.util.Scanner;

public class Day1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println(number+ " It is a Even value");
        } else {
            System.out.println(number+ " It is a Odd value");
        }
    }
}
