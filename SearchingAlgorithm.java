public class SearchingAlgorithm {
    public static void main(String[] args) {
        int[] i = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Revision.LinearSearch(i, 5);
        Revision.BinarySearch(i, 5);
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
