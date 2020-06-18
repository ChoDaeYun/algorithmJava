package org.algorithm;

import java.util.Scanner;

public class BackJoon14681 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if(number1>0 && number2 > 0){
            System.out.println("1");
        }else if(number1>0 && number2 < 0){
            System.out.println("4");
        }else if(number1<0 && number2 > 0){
            System.out.println("2");
        }else{
            System.out.println("3");
        }

    }
}
