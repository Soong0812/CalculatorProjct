package org.example;

import java.util.ArrayList;

public class CalculatorLv2Sub {

    private final ArrayList<Double> results = new ArrayList<>();

    public double calculate(double num1, double num2, char operations) {
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
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("적용할 수 없는 연산 기호입니다.");
                break;
        }

        results.add(result);
        return result;
    }

    public ArrayList<Double> getResults() {
        return new ArrayList<>(results);
    }

    public void setResults(ArrayList<Double> newResults) {
        results.clear();
        results.addAll(newResults);
    }

    public void removeResults() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
}
