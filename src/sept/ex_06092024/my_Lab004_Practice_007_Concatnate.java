package sept.ex_06092024;

import java.util.Scanner;

public class my_Lab004_Practice_007_Concatnate {

    public static void main(String[] agrs){
        String str1;
        String str2;
        String str3;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value for str1:");
        str1= s.nextLine();

        System.out.println("Enter the value for str2:");
        str2= s.nextLine();


        System.out.println("The concanated value is " + str1+str2);



    }
}
