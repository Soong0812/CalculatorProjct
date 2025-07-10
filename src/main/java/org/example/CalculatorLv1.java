package org.example;

import java.util.Scanner;

public class CalculatorLv1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("계산기를 시작합니다.");

            System.out.println("첫번째 수를 입력하세요 : ");
            int num1 = scanner.nextInt();

            System.out.println("사칙연산 기호를 입력하세요 : ");
            char operations = scanner.next().charAt(0);

            System.out.println("두번째 수를 입력하세요 : ");
            int num2 = scanner.nextInt();

            int result = 0;
            boolean valid = true;

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
                        valid = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("적용하지 않은 연산 기호입니다.");
                    valid = false;
                    break;
                }

        if (valid) {
            System.out.println("결과 : " + result);
            }

            System.out.println("더 계산하시겠습니까? 종료는 'exit' 를 입력해주세요.");
            String next = scanner.next();
            if (next.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
    scanner.close();
    }

}
