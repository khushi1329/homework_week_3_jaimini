package homework_week_3;
import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class Programme_17 {

        public static void main(String[] args) {
            arrayToStringArray();
        }
        public static void arrayToStringArray() {

            int[] my_arr = {3, 0, 6, 8, 4, 2, 5, 1, 6};
            String[] my_str = {"e", "b", "t", "k", "i", "m", "a", "m", "s"};

            System.out.println("Original numeric array : " + Arrays.toString(my_arr));
            Arrays.sort(my_arr);
            System.out.println("Sorted numeric array : " + Arrays.toString(my_arr));
            System.out.println("Original string array : " + Arrays.toString(my_str));
            Arrays.sort(my_str);
            System.out.println("Sorted string array : " + Arrays.toString(my_str));
        }
}


