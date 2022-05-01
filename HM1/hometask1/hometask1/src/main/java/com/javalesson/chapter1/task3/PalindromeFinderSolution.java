package com.javalesson.chapter1.task3;

import java.util.Scanner;

public class PalindromeFinderSolution {

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
//            Если длинна строки равна пяти, продолжается выполнение программы и выходим из цикла.
                continueLoop = false;
                String reversedString = "";
//            Проходим по нашей строке в обратном порядке используя метод .charAt(i) и получая доступ к последнему
//            символу, потом предпоследнему, и т.д.
                for (int i = convertedInput.length() - 1; i >= 0; i--) {
//                  Alternatively StringBuilder can be used here.
                    reversedString = reversedString + convertedInput.charAt(i);
                }
//            Превращаем строку обратно в чило типа Integer.
                int reversedInt = Integer.parseInt(reversedString);
//            Сравниваем оригинальное число с результатом.
                if(originalInt==reversedInt){
                    System.out.println(originalInt + " is palindrome");
                } else {
                    System.out.println(originalInt + " is not palindrome");
                }
            }
        }
    }
}
