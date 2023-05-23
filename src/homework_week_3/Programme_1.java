package homework_week_3;

//Write a java program that tells us that Input number is odd or even?

import java.util.Scanner;

public class Programme_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = sc.nextInt();

        String result = (number % 2 == 0)? "even" : "odd";
        System.out.println(number + " is " + result);

        Scanner close;
    }
}
