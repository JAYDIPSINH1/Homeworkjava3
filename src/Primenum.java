import java.util.Scanner;       //scanner class package

public class Primenum {

    public static void main(String[] args) {

        int n,count=0;   //n=input any value and check prime or not
        System.out.println("Enter any number");
        Scanner s=new Scanner(System.in);  // Runtime input any value using scanner class
        n=s.nextInt();

        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                count++;    //counter variable
            }
        }
            if (count==2)

                System.out.println("prime number");   //Divisible by zero or own number
            else
                System.out.println("Not prime number");
    }
}
