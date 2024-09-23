import java.util.Scanner;

public class Fibbonacchi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number=scanner.nextInt();
        int a=0;
        int b=1;
        for (int i=0; i<number; i++) {
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
