package org.example;

import java.util.LinkedList;

public class CalculatorLv2Sub {

    private final LinkedList<Double> results = new LinkedList<>();

    public double calculate(int num1, int num2, char operations) {
        double result = 0;

        switch (operations) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈에서 분모에 0은 입력할 수 없습니다.");
                } else {
                    result = (double) num1 / num2;
                }
                break;
            default:
                System.out.println("적용할 수 없는 연산 기호입니다.");
                break;
        }

        results.add(result);
        return result;
    }

    public LinkedList<Double> getResults() {
        return new LinkedList<>(results);
    }

    public void setResults(LinkedList<Double> newResults) {
        results.clear();
        results.addAll(newResults);
    }

    public void removeResults() {
        if (!results.isEmpty()) {
            results.removeFirst();
        }
    }
}
