package homework_week_3;

//Write a Java program to calculate the average value of array elements.

public class Programme_19 {

    public static void main(String[] args) {

        arrayToStringArray();
    }
    public static void arrayToStringArray() {
        int[] numbers = new int[]{80, 30, 25, 15, -16, 50, -100};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];

        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
