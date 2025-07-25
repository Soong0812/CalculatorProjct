package CalculatorPractice;

import java.util.ArrayList;
import java.util.List;

public class Calculator2Practice {

    private final List<Double> resultList = new ArrayList<>();

    public double calculate(int firstNumbers, int secondNumbers, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = firstNumbers + secondNumbers;
                break;
            case '-':
                result = firstNumbers - secondNumbers;
                break;
            case '*':
                result = firstNumbers * secondNumbers;
                break;
            case '/':
                if (secondNumbers == 0) {
                    throw new IllegalArgumentException("나눗셈 연산에서 분모(두번째 정수)가 0일 수 없습니다.");
                }
                result = (double) firstNumbers / secondNumbers;
                break;
            default:
                throw new IllegalArgumentException("사칙연산 기호는 +, -, *, / 중 하나여야 합니다.");
        }
        addResult(result);
        return result;
    }

    public List<Double> getResultList() {
        return resultList;
    }

    public void addResult(double result) {
        resultList.add(result);
    }

    public void removeResult() {
        resultList.remove(0);
    }
}
