public class SearchingAlgorithm {
    public static void main(String[] args) {
        int[] arr = new int[1000]; // Create an array of size 1000

        // Fill the array with sequential numbers from 1 to 1000
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // The array 'arr' is now sorted and contains numbers from 1 to 1000
    int [] array={4,8,19,25,34,39,45,48,66,75,89,95};
        // Revision.LinearSearch(arr, 500);
        Revision.BinarySearch(array, 89);
    }
}

class Revision {
    public static void LinearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Run");
            if (arr[i] == value) {
                System.out.println(i + 1);
                break;
            }
        }
    }

    public static void BinarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
           
        while (low <= high) {
            System.out.println("Run");
            if (array[0] == value) {
                System.out.println(1);
                break;
            }
            if (array[1] == value) {
                System.out.println(2);
                break;
            }
            if (array[2] == value) {
                System.out.println(3);
                break;
            }
            int mid = low + (high - low) / 2;
            if (array[mid] == value) {
                System.out.println(mid + 1);
                break;
            }
            if (array[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }
}
