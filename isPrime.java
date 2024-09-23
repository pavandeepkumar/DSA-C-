import java.util.Scanner;

/**
 * isPrime
 */
public class isPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = sc.nextInt();
        int high = sc.nextInt();
        // int count = 0;
        // if (prime == 1) {
        // System.out.println("Not prime");
        // return;
        // }
        // // System.out.println("Math.sqrt(prime)" + Integer.parseInt(null));
        // for (int i = 2; i <= Math.abs(Math.sqrt(prime)); i++) {
        // System.out.println("loop run " + i);
        // if (prime % i == 0) {
        // count++;
        // break;
        // }
        // }
        // System.out.println("Count: " + count);
        // if (count == 0) {
        // System.out.println("prime");
        // } else {
        // System.out.println("Not prime");
        // }
        for (int n = low; n <= high; n++) {
            // System.out.println("Run " + n );
            int count = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(n);
            }
        }
    }
}