package demo;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {

        double salary=0;
        double tPay=0;
        double dollar=0;


        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your Work Days:");
        int wDay= scan.nextInt();

        int s=1;
        int d=1;

        while(wDay>=s){
            salary= (int) Math.pow(2,(d-1));
            tPay+=salary;
            System.out.println("Salary for day "+ s + " = "+ salary/100+" $");
            d++;
            s++;
        }

        dollar=tPay/100;
        System.out.println("Total Pay : "+dollar+" $ ");
    }
}
