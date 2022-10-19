import java.util.Scanner;

public class MultiplicationTable {

    // input number 6
    // 6*1 = 6
    //6*2 = 12

    public static void main(String[] args) {

        int num;
        System.out.println("Enter any number");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();

        for (int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);

    }
}
}