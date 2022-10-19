import java.util.Scanner;

public class Sum2 {

    //  input number 126 ------> 1+2+6 =9

    public static void main(String[] args) {

        int n,r,sum=0;                 // n=126
        System.out.println("Enter any number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        while (n>0)          //   126>0
        {
            r=n%10;         //126%10
             sum=sum+r;
            n = n/10;
        }
         System.out.println("sum of digits"+sum);
    }
}
