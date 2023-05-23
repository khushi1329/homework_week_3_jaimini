package homework_week_3;

  //Write a program that tells us input value is number or an alphabet or symbol.
public class Programme_12 {

      public static void main(String[] args) {
          char ch = 'k';

          if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
              System.out.println(ch + " is an alphabet.");
          else if (ch >= '0' && ch <='9') {
              System.out.println(ch + " is a digit.");
          } else
              System.out.println(ch + "is a symbol");
      }
}