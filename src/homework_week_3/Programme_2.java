package homework_week_3;
import java.util.Scanner;

  //  a java program to input any year like (ex.2007) and find out if it is leap year o rnot.

public class Programme_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");

        int year =sc.nextInt();
        boolean a = (year % 4)==0;
        boolean b = (year % 100)!= 0;
        boolean c =((year % 100 == 0) && (year % 400 == 0));

        if(a && (b || c)){
            System.out.println(year +" is a leap year");
            }
        else
           {
               System.out.println(year +" is not a leap year");
        }
        Scanner close;
    }
}