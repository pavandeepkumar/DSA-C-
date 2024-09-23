import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        System.out.println("Array");
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        // Add 23 to the array
        arr = ArrayMethod.addElementInArray(arr, 45);
        arr = ArrayMethod.addElementInArray(arr, 56);
        arr = ArrayMethod.deleteArrayElementAtIndex(2, arr);

        // Print the new array
        System.out.println("\nArray with 23 added:\n" + Arrays.toString(arr));
    }
}

class ArrayMethod {
    public static int[] addElementInArray(int[] array, int num) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = num;

        return newArray;
    }

    public static int[] deleteArrayElementAtIndex(int position, int[] array) {
        // Check if position is valid
        int[] newArray = new int[array.length - 1];

        if (position < 0 || position > array.length-1) {
            new Error("Invalid");
        }

        for (int i = 0; i < position - 1; i++) {
            newArray[i] = array[i];
        }

        for (int i = position - 1; i < array.length-1; i++) {
            newArray[i] = array[i+1];
        }

        return newArray;
    }

}
