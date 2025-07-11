package org.example;

import java.util.Scanner;

public class CalculatorLv2 {

    public static void main(String[] args) {
        CalculatorLv2Sub cal = new CalculatorLv2Sub();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("계산기를 시작합니다.");

            System.out.println("첫번째 수를 입력하세요 : ");
            int num1 = scanner.nextInt();

            System.out.println("사칙연산 기호를 입력하세요 : ");
            char operations = scanner.next().charAt(0);

            System.out.println("두번째 수를 입력하세요 : ");
            int num2 = scanner.nextInt();

            double result = cal.calculate(num1, num2, operations);

            System.out.println("결과 저장 내용 : " + cal.getResults());

            System.out.println("저장된 결과를 삭제하시겠습니까? (Y/N)");
            String del = scanner.next();
            if (del.equals("Y")) {
                cal.removeResults();
                System.out.println("삭제 완료");
            }

            System.out.println("계속 계산하시겠습니까? exit를 입력하시면 종료됩니다.");
            if (scanner.next().equals("exit")) {
                break;
            }
        }
    }
}
