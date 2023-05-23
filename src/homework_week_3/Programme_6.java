package homework_week_3;

import java.util.Scanner;
//a java program to input any number and find out if it’s odd or even

public class Programme_6 {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =Sc.nextInt();

        if(number % 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");
        }
        Scanner close;
    }

