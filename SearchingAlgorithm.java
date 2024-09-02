public class SearchingAlgorithm {
    public static void main(String[] args) {
        int[] i = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Revision.LinearSearch(i, 4);
        Revision.BinarySearch(i, 4);
    }
}

class Revision {
    public static void LinearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.print(i + 1);
                break;
            }
        }
    }

    public static void BinarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == value) {
                System.out.print(mid+1);
                break;
            }
            if (array[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
