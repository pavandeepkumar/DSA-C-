public class CountDigits {
    public static void main(String[] args) {
        int count = 34567;
        int countDigits = 0;
        while (count != 0) {
            count = count / 10;
            countDigits++;
        }

        System.out.println("countDigits"+countDigits);
    }
}
