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

    public static int majorityElement(int[] nums) {
        int[] myArray = new int[100];
        // Arrays.fill(myArray, 0);

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            myArray[nums[i]]++;
            System.out.println("myArray" + nums[i]);
        }

        System.out.println("myarray" + myArray);
        int maxCount = 0;
        int majorityElement = -1;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > maxCount) {
                maxCount = myArray[i];
                majorityElement = i; // Store the element (index) with the highest count
            }
        }
        // System.out.println("max" + max);
        printLoop(myArray);

        return majorityElement;

        // System.out.println("Myarray: " + myArray);

    }

    public static void sortArrayZerosOne(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        System.out.println("Array " + count);
        for (int i = 0; i < array.length; i++) {
            if (i < count) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        printLoop(array);
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
        int[] array = { 0, 1, 1, 0, 0, 1 };
        // printLoop(array);
        // // reverseArray(array);
        // rotateInPlace(array, 101);
        // printLoop(array);
        // swapWithoutVariable(4, 6);

        // int result = majorityElement(array);
        // System.out.println("result: " + result);

        sortArrayZerosOne(array);
    }
}