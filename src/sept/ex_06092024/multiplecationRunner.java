package sept.ex_06092024;

import java.util.Scanner;

public class multiplecationRunner {
    public static void main(String[] args){
        my_Lab004_Practice_008_Table m = new my_Lab004_Practice_008_Table();
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter the number you want table");
        int table= s.nextInt();
        System.out.println("Please enter the number from where you want to generate the table");
        int from = s.nextInt();
        System.out.println("Please enter the number till you want the table");
        int to = s.nextInt();
        m.multiplecationTablePrint(table,from,to);
    }
}
