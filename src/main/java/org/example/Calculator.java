package org.example;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("계산기를 시작합니다.");

        System.out.println("첫번째 수를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.println("사칙연산 기호를 입력하세요 : ");
        char operations = scanner.next().charAt(0);

        System.out.println("두번째 수를 입력하세요 : ");
        int num2 = scanner.nextInt();

    }

}
