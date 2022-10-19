import java.util.Scanner;

public class Febonacci {

    public static void main(String[] args) {

        int term,a=0,b=1,c;    //0 1 1 2 3 5 8.....(last two number add)
        System.out.println("Enter term");
        Scanner s=new Scanner(System.in);
        term=s.nextInt();

        for (int i=1;i<=term;i++)
        {
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}
