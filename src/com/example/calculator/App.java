package com.example.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner, Calculator는 한번만 있어도 되기 때문에  While문 밖에 존재
        Calculator calculator = new Calculator(); // calculate 메서드를 사용하기 위해 객체를 생성하고 계속 사용하기 때문에 while문 밖에 작성
        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.println("두 번째 숫자를 입력하세요: "); // 새로운 숫자를 매번 입력받기 위해 while문 안에 존재
            int num2 = scanner.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            String operator = scanner.next();

            int result = calculator.calculate(num1, num2, operator); // calculator.calculate()를 호출해 계산 결과를 반환받아 result에 저장
                                                                     // 매번 새로운 결과값을 받기 위해 while문 안에 존재

            System.out.println("입력한 숫자: " + num1 + ", " + num2); // 입력받은 num1, num2를 콘솔에 출력
            System.out.println("입력한 연산자: " + operator); // 입력받은 연산자를 콘솔에 출력
            System.out.println("결과 " + result); // 입력받은 num1, num2와 연산자의 결과를 출력
            System.out.println("첫 번째 결과를 삭제하시겠습니까? (yes 입력 시 삭제)"); // 연산이 끝난 후에 삭제 여부 확인
            String deleteInput = scanner.next();
            // 사용자가 입력한 값을 deleteInput 변수에 저장
            if (deleteInput.equals("yes")) {
                calculator.removeResult(); // yes 입력 시 calculator의 results에서 첫 번째(0) 데이터 삭제
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)"); // 다른 숫자로 더 계산할지 여부 확인
            String input = scanner.next(); // 사용자가 exit를 입력하면 scanner.next()가 읽고 input 변수에 exit 저장
            if (input.equals("exit")) { // exit 입력 시 종료
                break;
// ㅏㅏ
            }
        }
    }
}