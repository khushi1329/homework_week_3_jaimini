package homework_week_3;
import java.util.Scanner;

public class Programme_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = in.nextLine();

        Scanner rn = new Scanner(System.in);
        System.out.println("Enter your Roll No :");
        int rollNo = rn.nextInt();
        System.out.println("Enter Maths marks :");
        int maths = rn.nextInt();
        System.out.println("Enter Science marks :");
        int science = rn.nextInt();
        System.out.println("Enter English marks :");
        int eng = rn.nextInt();
        MarkSheet(name, rollNo, maths, science, eng);
        in.close();
        rn.close();
    }
    public static void MarkSheet(String name, int rollNo, int maths, int science, int eng) {
        String result;
        int t = maths + science + eng;
        double p = t / 300.0 * 100.0;
        String g = "";
        if (p >= 80) {
            g = "A+";
        } else if (p >= 60) {
            g = "A";
        } else if (p >= 50) {
            g = "B";
        } else if (p >= 35) {
            g = "C";
        } else {
            g = "E";
        }
        if (p >= 35 && maths >= 35 && science >= 35 && eng >= 35) {
            result = "Pass";
        } else
            result = "Fail";

        System.out.println("Total Marks = " + t);
        System.out.println("Percentage = " + p);
        System.out.println("Grade = " + g);

        System.out.println(" ____________________________________ ");
        System.out.println("|                                     |");
        System.out.println("|          Mark Sheet                 |");
        System.out.println("|_____________________________________|");
        System.out.println("|     Name        : " + name + "      |");
        System.out.println("|    Roll No      : " + rollNo + "    |");
        System.out.println("|_____________________________________|");
        System.out.println("|  Subjects       :       Marks       |");
        System.out.println("|_____________________________________|");
        System.out.println("|   Maths         :   " + maths +    "|");
        System.out.println("|   Science       : " + science +    "|");
        System.out.println("|   English       :   " + eng + "     |");
        System.out.println("|_____________________________________|");
        System.out.println("|   Total         :    " + t + "      |");
        System.out.println("|_____________________________________|");
        System.out.println("|   Percentage    :    " + p + "      |");
        System.out.println("|   Result        :    " + result + " |");
        System.out.println("|   Grade         :    " + g + "      |");
        System.out.println("|_____________________________________|");


    }
}
