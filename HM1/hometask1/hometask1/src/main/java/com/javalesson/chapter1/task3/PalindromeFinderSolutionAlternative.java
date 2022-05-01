package com.javalesson.chapter1.task3;

import java.util.Scanner;

public class PalindromeFinderSolutionAlternative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//       Объявляем переменную типа boolean которая будет указывать нужно ли продолжать выполнение цикла
//       Например для тех случаев когда был сделан ввод не пятизначного числа.
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("Please enter a 5 digits palindrome number");
            int originalInt = scanner.nextInt();
//            Конвертируем число в строку.
            String convertedInput = String.valueOf(originalInt);
//            Проверяем длинну строки
            if (convertedInput.length() != 5) {
                System.out.println("Error: input number is not 5 digits long");
            } else {
                continueLoop = false;
                int reversedInt = 0;
                int tmp = originalInt;
                while (tmp > 0) {
//            Делим оригинальное значение на 10 и остаток от деления сохраняем в переменную rest.
                    int rest = tmp % 10;
//            Домножаем  reversedInt полученый в предыдущей итерации на 10 и добавояем остаток
//            от деления полученый в текущем круге.
                    reversedInt = reversedInt * 10 + rest;
//            Делим tmp на 10 для того чтобы перейти на следущую итерацию избавившись от младшего разряда.
                    tmp = tmp / 10;
                }
//            Сравниваем оригинальное число с результатом.
                if (originalInt == reversedInt) {
                    System.out.println(originalInt + " is palindrome");
                } else {
                    System.out.println(originalInt + " is not palindrome");
                }
            }
        }
    }
}
