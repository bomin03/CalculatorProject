package com.example.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.println("사칙연산 기호를 입력하세요: ");
        String operator = scanner.next();

        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    result = num1 / num2;
                }
                break;
        }
        System.out.println("입력한 숫자: " + num1 + ", " + num2);
        System.out.println("입력한 연산자: " + operator);
        System.out.println("결과 " + result);

    }
}