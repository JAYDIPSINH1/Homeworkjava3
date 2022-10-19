import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        int n,i,sum=0;
        System.out.println("Enter range");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        if (n%2==0)
        {
            for (i=0;i<=n;i++)
            {
              sum=sum+i;
            }
            System.out.println("sum of enven number"+sum);
        }
         else
        {
            for (i=1;i<=n;i++)
            {
                sum=sum+i;
            }
            System.out.println("sum of odd number"+sum);
        }
    }
}
