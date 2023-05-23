package homework_week_3;
import java.util.Scanner;

/* Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
              any other alphabet should be invalid entry.*/

public class Programme_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet between A to F : ");
        String city = sc.next();
        cityName(city);
        sc.close();
    }
    /**
     * This method is used to find city name as per alphabet between A to F
     * This is static method
     * @param cityname
     */
    public static void cityName(String cityname) {
        switch (cityname) {
            case "A":
                System.out.println("city A from is Ahmedabad");
                break;
            case "B":
                System.out.println("city B from is Berlin");
                break;
            case "C":
                System.out.println("city C from is Canada");
                break;
            case "D":
                System.out.println("city D from is Derby");
                break;
            case "E":
                System.out.println("city E from is Epsom");
                break;
            case "F":
                System.out.println("city F from is Frankurt");
                break;
            default:
                System.out.println("Invalid Alphabet please enter between A to F ");
        }
    }
}
