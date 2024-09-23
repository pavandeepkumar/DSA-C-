/**
 * ReverseStrng
 */
public class ReverseStrng {

    public static void main(String[] args) {
        int num = 112234563;
        
        while (num > 0) {
          int dig=num%10;
          num /= 10;
          System.out.println(dig);  //
        }
    }
}