package demo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        int Range1=9;
        int Range2=19;
        int Range3=49;
        int Range4=99;
        int Range5=100;

        Double Discount1=0.0;
        Double Discount2=0.2;
        Double Discount3=0.3;
        Double Discount4=0.4;
        Double Discount5=0.5;

        int item=0;
        double discount=0;
        int price=99;
        double amount=0;

        System.out.println("The price of each item: 99$");

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of items : ");
        item = scan.nextInt();

        if(item<=Range1){
            System.out.println("Your Discount : 0%");
            amount=item*price;
        } else if(item<=Range2){
            System.out.println("Your Discount : 20% ");
            amount=item*price;
            discount=amount*Discount2;
            amount=amount-discount;
        } else if (item<=Range3) {
            System.out.println("Your Discount : 30% ");
            amount=item*price;
            discount=amount*Discount3;
            amount=amount-discount;
        } else if (item<=Range4) {
            System.out.println("Your Discount : 40%");
            amount=item*price;
            discount=amount*Discount4;
            amount=amount-discount;
        }
        else{
            System.out.println("Your Discount : 50% ");
            amount=item*price;
            discount=amount*Discount5;
            amount=amount-discount;
        }
        System.out.println(" Total Amount : "+ amount + " $ ");
    }
}
