import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number Pattern :- ");
        int num = scanner.nextInt();
        SquarePatternClass pattern = new SquarePatternClass();

        pattern.SquarePattern(num);
        pattern.RightAnglePattern(num);
        pattern.RightAnglePatternWithNumber(num);
        pattern.RightAnglePatternWithSameNumber(num);
        pattern.ReverseRightAnglePattern(num);
        pattern.ReverseRightAnglePatternWithIncrementNumber(num);
        pattern.Pyrimid(num);
        pattern.ReversePyrimid(num);
        pattern.LeftTriangle(num);
        pattern.BinaryTriangle(num);
        SquarePatternClass.NumberTriangle(num);
        SquarePatternClass.NumberTriangle(num);

    }
}

/**
 * InnerPattern
 */

 

class SquarePatternClass {

    public void SquarePattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void RightAnglePattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void RightAnglePatternWithNumber(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void RightAnglePatternWithSameNumber(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void ReverseRightAnglePattern(int num) {
        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void ReverseRightAnglePatternWithIncrementNumber(int num) {
        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print((i + 1) - j);
            }
            System.out.println();
        }
    }

    public void Pyrimid(int num) {
        for (int i = 0; i < num; i++) {
            // space

            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void ReversePyrimid(int num) {
        for (int i = num; i > 0; i--) {
            // space

            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void LeftTriangle(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int start = i;
            if (i > n) {
                start = 2 * n - i;
            }
            for (int j = 1; j <= start; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void BinaryTriangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                int binary = 1;
                if ((i + j) % 2 == 0) {

                    System.out.print(binary);
                } else {
                    binary = 0;
                    System.out.print(binary);
                }
            }
            System.out.println();
        }
    }

    public static void NumberTriangle(int num) {
        int space=2*(num-1);
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            for (int j = 1 ; j <=space ; j++) {

                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {

                System.out.print(j);
            }

            System.out.println();
            space-=2;
        }
    }
}
