import java.util.Scanner;

public class Fact {

    public static void main(String[] args) {

        int n,fact=1;        // input 5------->120 (5*4*3*2*1)
        System.out.println("Enter any number");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial "+ fact);
    }
}
