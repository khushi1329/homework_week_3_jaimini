package homework_week_3;
import java.util.Scanner;

/*    Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
          any other alphabet should be invalid entry.*/

public class Programme_8 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any alphabet between A to F : ");
            String alphabet = sc.nextLine();
            alphabetAf(alphabet);
            sc.close();
      }
      public static void alphabetAf(String alphabet) {
            String names[] = {"Ahmedabad", "Berlin", "Canada", "Derby", "Epsom", "Frankfurt"};
            if (alphabet.equalsIgnoreCase("A")) {
                  System.out.println("city : " + names[0]);
            } else if (alphabet.equalsIgnoreCase("B")) {
                  System.out.println("city : " + names[1]);
            } else if (alphabet.equalsIgnoreCase("C")) {
                  System.out.println("city : " + names[2]);
            } else if (alphabet.equalsIgnoreCase("D")) {
                  System.out.println("city : " + names[3]);
            } else if (alphabet.equalsIgnoreCase("E")) {
                  System.out.println("city : " + names[4]);
            } else if (alphabet.equalsIgnoreCase("F")) {
                  System.out.println("city : " + names[5]);
            } else {
                  System.out.println("Invalid Alphabet please enter between A to F");
            }
      }
}
