import java.util.Scanner;

public class Sum1 {

    public static void main(String[] args) {

        int n,r,sum=0;
        System.out.println("Enter any number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        while (n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("sum of digits" +sum);
    }
}
