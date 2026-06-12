package com.example.calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> results = new ArrayList<>(); // 연산 결과값을 제한없이 저장하기 위해 ArrayList 사용
    // 캡슐화를 위해 외부 접근이 불가하도록 private 추가
    public ArrayList<Integer>getResults() { // getter 메서드
        return results;
    }
    public void setResults(ArrayList<Integer>results) { // setter 메서드
        this.results = results; // 매개변수로 받은 결과 값을 필드 results에 저장 그리고 this가 가리키는 건 Calculator 클래스 자신
    }
    public void removeResult() { // 가장 먼저 저장된 결과를 삭제하는 메서드
        results.remove(0); // ArrayList의 0번째 데이터 삭제
    }
    public int calculate (int num1, int num2, String operator) {
        // num1, num2, operator를 매개변수로 받아 사칙연산을 수행하고 결과값을 반환하는 메서드
        int result = 0; // 결과값을 저장할 변수, switch문 실행 전 초기값을 0으로 지정
        switch (operator) { // operator의 값에 따라 결과값을 결정
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
                if (num2 == 0) { // 0으로 나눌 수 없음을 의미
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    result = num1 / num2; // num2가 0이 아닐 때 나눗셈 실행
                }
                break;
        } results.add(result); // 계산 결과를 ArrayList에 저장
        return result; // 연산한 결과값을 호출한 곳으로 돌려주는 역할
    }
} // switch문에서 계산 -> result에 저장 -> return으로 반환