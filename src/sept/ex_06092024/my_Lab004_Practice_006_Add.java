package sept.ex_06092024;

import java.util.Scanner;

public class my_Lab004_Practice_006_Add {
    public static void main(String[] args){
        int a, b, c, d;
        //get the values for a b and c from users
        System.out.println("Please enter the value for a :");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        System.out.println("Please enter the value for b :");
        b= s.nextInt();

        System.out.println("Please enter the value for c :");
        c=s.nextInt();

        d=a+b+c;
        System.out.println("The sum of a,b, and c is : "+d);
    }
}
