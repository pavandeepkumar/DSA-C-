/**
 * ArrayQuestion
 */
public class ArrayQuestion {

    public static void swap(int a, int b) {
        System.out.println("before swap");
        System.out.print("A " + a);
        System.out.println(" B " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap");
        System.out.print("A " + a);
        System.out.print(" B " + b);
    }

    public static void swapWithoutVariable(int a, int b) {
        System.out.println("before swap");
        System.out.print("A " + a);
        System.out.println(" B " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap");
        System.out.print("A " + a);
        System.out.print(" B " + b);
    }

    // public static int[] reverseArray(int[] arr) {
    // int[] newArr = new int[arr.length];

    // int j = 0;

    // for (int i = arr.length - 1; i >= 0; i--) {

    // newArr[j++] = arr[i];
    // }

    // return newArr;
    // }
    public static void swapArrayValue(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void reverseArray(int[] arr, int i, int j) {
        while (i < j) {
            swapArrayValue(arr, i, j);
            i++;
            j--;
        }
    }

    public static int[] rotate(int[] arr, int num) {
        int n = arr.length;
        int[] ans = new int[n];
        int k = num % n;
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        return ans;

    }

    public static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n - k - 1);
        reverseArray(arr, n - k, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    public static void printLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        // swap(3, 4);
        int[] array = { 1, 2, 3, 4, 5 };
        printLoop(array);
        // reverseArray(array);
        rotateInPlace(array, 101);
        printLoop(array);
        // swapWithoutVariable(4, 6);
    }
}