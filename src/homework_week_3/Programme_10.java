package homework_week_3;
import java.util.Scanner;

  /*   java program to input any two number and ask user to enter their symbol (+, -,
          /, *) find addition, Subtraction, multiplication and division according to their symbol
          (using if else)*/

public class Programme_10 {

      public static void main(String[] args) {
          Scanner in = new Scanner(System.in);

          int a = in.nextInt();
          int b = in.nextInt();
          int sum, sub, multi, div;

          sum = a + b;
          sub = a - b;
          multi = a * b;
          div = a / b;

          System.out.println("SUM " + a + " + " + b + " = " + sum);
          System.out.println("subtraction " + a + " - " + b + " = " + sub);
          System.out.println("multiplication " + a + " * " + b + " = " + multi);
          System.out.println("division " + a + " / " + b + " = " + div);

          Scanner close;
      }
}
