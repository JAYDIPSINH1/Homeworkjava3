import java.util.Scanner;

public class String {

    // input 123----->3

    public static void main(String[] args) {

        int n,count=0;      // n= 123 (3 digit)
        System.out.println("Enter any number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        while (n>0)     // 123>0
        {
            n=n/10;    //123/10
            count++;

        }
        System.out.println("No. of digits 0");
    }
}
