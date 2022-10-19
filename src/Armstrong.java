import java.util.Scanner;

public class Armstrong {

    // input number 153 ------> (1*1*1 + 5*5*5 + 3*3*3) =153  Armstrong

    public static void main(String[] args) {

        int n, rem, arm = 0, c;
        System.out.println("Enter any number");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        c = n;            // c Temporary variable
        while (n > 0) {         //153>0
            rem = n % 10;                      //153%10
            arm = (rem * rem * rem) + arm;
            n = n / 10;
        }
        if (c == arm)
            System.out.println("Armstrong number");

        else {
            System.out.println("Not Armstrong number");
        }
    }
}
