import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        getIntegers(1);
        printArray(getIntegers(5));
//        sortIntegers(getIntegers(4));
    }

    public static int[] getIntegers (int arrayLength) {
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[arrayLength];
        System.out.println("Please insert " + arrayLength + " numbers:");
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = s.nextInt();
        }
        return numbers;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++ ) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}

