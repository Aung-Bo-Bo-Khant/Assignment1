package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] names=new String[5];

        System.out.println("Enter 5 names: ");

        int i=0;
        while(i< names.length){
            names[i]=s.nextLine();
            i++;
        }

        String temp="";

        int a=0;
        while(a < names.length){
            int j=1;
            while(j< names.length){
                if(names[j-1].compareTo(names[j])>0){
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
                j++;
            }
            a++;
        }
        System.out.println(Arrays.toString(names));
    }

}
