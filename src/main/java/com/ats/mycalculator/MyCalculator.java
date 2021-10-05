package com.ats.mycalculator;


import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {

        System.out.println("Was wollen sie machen +,-,*");

        Scanner sc = new Scanner(System.in);

        String eingabe = sc.nextLine();

        sc.close();

        MyCalculator calc = new MyCalculator();


        switch (eingabe){
            case "+": calc.add();break;
            case "-": calc.sub();break;
            case "*": calc.prod();break;
            default :
                System.out.println("Error Error");System.exit(0);
        }
        
    }

    private void prod(){

    }

    private void sub(){
      int i = 9999 - 1;
    }

    private void add(){

    }
}
