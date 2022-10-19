import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        int n,sum=0;
        System.out.println("Enter number of Term");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        for (int i=1;i<=n;i++)
        {
           sum=sum+i;

        }
        System.out.println("ADDITION"+sum);

    }
}
