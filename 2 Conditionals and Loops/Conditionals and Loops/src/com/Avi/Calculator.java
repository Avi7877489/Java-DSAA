package com.Avi;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int ans = 0;
//
//        while (true) {
//
//            System.out.println("Enter the operator: ");
//
//            char op = in.next().trim().charAt(0);
//
//            if ((op == '+') || (op == '-') || (op == '*') || (op == '/') || (op =='%')) {
//                System.out.println("Enter two number: ");
//                int num1 = in.nextInt();
//                int num2 = in.nextInt();
//                System.out.println();
//
//                if (op == '+') {
//                    ans = num1 + num2 ;
//                }
//                if (op == '-') {
//                    ans = num1 - num2 ;
//                }
//                if (op == '*') {
//                    ans = num1 * num2 ;
//                }
//                if (op == '/') {
//                    if (num2 != 0) {
//                        ans = num1 / num2;
//                    }
//                }
//                if (op == '%') {
//                    ans = num1 % num2 ;
//                }
//
//            } else if (op == 'x' || op == 'X') {
//                break;
//            } else {
//                System.out.println("Invalid operation !!");
//            }
//            System.out.println(ans);
//
//        }
//

        int ans = 0;
        while (true) {
            System.out.println("Enter Operator: ");

            char op = in.next().trim().charAt(0);


            if ((op == '+') || (op == '-') || (op == '*') || (op == '/') || (op == '%')) {
                System.out.println("Enter two number: ");
                int a = in.nextInt();
                int b = in.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;

                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                }
                if (op == '%') {
                    ans = a % b;
                }
            }else if ((op == 'x') || (op == 'X')) {
                    break;

                } else {
                    System.out.println("Invlide Operater !");
                }

            System.out.println(ans);
        }


    }
}