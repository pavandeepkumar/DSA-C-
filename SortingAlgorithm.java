public class SortingAlgorithm {
    public static void main(String[] args) {
        System.out.println("Sorting algorithm");
        int[] array = { 2, 4, 1, 4, 6 };
        System.out.println(array[0]);
        Sorting.SelectionSortingAlgorithm(array);
        System.out.println(array[0]);
    }
}

class Sorting {
    public static void SelectionSortingAlgorithm(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
