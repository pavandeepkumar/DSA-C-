import java.lang.reflect.Array;

/**
 * HashMap
 */
public class HashMap {

    public static void main(String[] args) {
        int[] array = { 1, 3, 2, 5, 7, 9, 5 };
        ArrayMethod arr = new ArrayMethod();

        // int res = arr.MaxValueOfArray(array);
        // System.out.println("res=" + res);
        int minValue = arr.MinValueOfArray(array);
        System.out.println("minValue=" + minValue);
        int keyValue = arr.FindKeyValuePair(array, 5);
        System.out.println("keyValue=" + keyValue);
        int[] hashArray = arr.HashArrays(array, 4);
        System.out.println("hashArray=" + hashArray[2]);
    }
}

/**
 * InnerHashMap
 */
class ArrayMethod {
    public int MaxValueOfArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (count < array[i]) {
                count = array[i];
            }
        }
        return count;
    }

    public int MinValueOfArray(int[] array) {

        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;

    }

    public int[] SwapValueOfArray(int first, int second) {
        int temp = first;
        first = second;
        second = temp;
        int[] array = { first, second };
        return array;
    }

    public int FindKeyValuePair(int[] array, int num) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count++;
            }
        }
        return count;
    }

    public int[] HashArrays(int[] array, int num) {
        int[] hash = new int[13];
        for (int i = 0; i < array.length; i++) {
            hash[array[i]] += 1;
        }
        return hash;
    }

}