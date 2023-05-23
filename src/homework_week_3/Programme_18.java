package homework_week_3;

//Write a Java program to sum values of an array.

public class Programme_18 {
    static int arr[] = {10,15,20,25,30};
    public static int sum() {
        int sum = 0;
        int i;

        for(i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }
    public static void main(String[] args) {
        System.out.println("sum of array is " + sum());
    }
}
