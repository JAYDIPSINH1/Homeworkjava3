import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        int n,s=0,c,r;
        System.out.println("enter any number");
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();   // n=121
        c=n;          //c=121
        while (n>0)           // 121>0
        {
            r=n%10;        //   121/10 remindir 1
            s=(s*10)+r;
            n=n/10;
        }
         if (c==s) {
             System.out.println("palindrome number");
         }
       else
           System.out.println("not palindrome number");

         }

    }

