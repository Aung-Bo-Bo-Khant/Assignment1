package demo;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        int sem1 = 6000;
        double percent = 0.02;
        double tuitionfee = 0;
        double inper = 0;
        int i = 1;

        tuitionfee = sem1 * 2;

        while (i <= 5) {
            System.out.println("Tuition fee for " + i + " years: " + tuitionfee + " $ ");
            inper = tuitionfee * percent;
            tuitionfee = tuitionfee + inper;
            i++;
        }
    }
}
