import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ArrayMethod
 */
public class ArrayMethod {

    public static int countNumber(int[] arr, int target) {
        int countNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                countNumber++;
            }
        }
        return countNumber;
    }

    public static int findLastIndex(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
            }
        }
        return index;
    }

    public static int findMaxValue(int[] arr, int target) {
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                maxValue++;
            }
        }
        return maxValue;
    }

    public static boolean isSorted(int[] arr) {
        boolean result = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int[] samllestAndLargest(int[] arr) {
        Arrays.sort(arr);
        return new int[] { arr[0], arr[arr.length - 1] };
    }

    public static int KthLargestElement(int[] arr, int k) {
        Set<Integer> arraySet = new HashSet<>();
        for (int num : arr) {
            arraySet.add(num);
        }

        // Convert the set back to a sorted list
        List<Integer> sortedList = new ArrayList<>(arraySet);
        Collections.sort(sortedList);

        // Return the kth largest element
        return sortedList.get(sortedList.size() - k);
    }

    public static int sumPair(int[] array, int target) {

        int pair = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] + array[j] == target) {
                    pair++;
                }
            }
        }
        return pair;
    }

    public static int Unique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i] = -1;
                    array[j] = -1;
                }
            }

        }
        int ans = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                ans = array[i];
            }
        }

        return ans;
    }

    public static int firstRepeat(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("array " + array[i]);
                    System.out.println("I"+i);
                    System.out.println("j"+j);
                    return array[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6,4 };

        int count = countNumber(array, 5);
        System.out.println("Count " + count);

        int lastIndex = findLastIndex(array, 5);
        System.out.println("Last Index " + lastIndex);

        int max = findMaxValue(array, 5);
        System.out.println("Max Value " + max);

        boolean sorted = isSorted(array);
        System.out.println("Sorted Value " + sorted);

        System.out.println("ArrayMethod " + array[0]);

        int[] maxMinElement = samllestAndLargest(array);
        System.out.println(" Min Element " + maxMinElement[0]);
        System.out.println(" Max Element " + maxMinElement[1]);

        int largestElement = KthLargestElement(array, 3);

        System.out.println("Second Largest Element " + largestElement);

        int sum = sumPair(array, 8);
        System.out.println("The total pair of elements " + sum);
        int[] newArray = { 1, 2, 3, 1, 2, 3, 4 };
        // int findUnique = Unique(newArray);

        // System.out.println("findUnique: " + findUnique);

        int firstRepeatNumber = firstRepeat(newArray);
        System.out.println("firstRepeatNumber: " + firstRepeatNumber);
    }
}