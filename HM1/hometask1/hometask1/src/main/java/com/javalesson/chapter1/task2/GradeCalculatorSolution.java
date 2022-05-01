package com.javalesson.chapter1.task2;

import java.util.Scanner;

public class GradeCalculatorSolution {

    public static void main(String[] args) {

//      Нам нужен класс Scanner для чтения ввода с консоли
        Scanner input = new Scanner(System.in);
//      Инициализируем переменные total и gradeCounter
        int total = 0;
        int gradeCounter = 0;

//      Просим пользователя ввести значения оценок с клавиатуры.
//      Продолжаем обрабатывать оценки до тех пор, пока не будет введено отрицательное значение.

        System.out.print("Enter grade or negative number to quit: ");
        int grade = input.nextInt();

        while (grade > 0) {
            total = total + grade; // добавляем последнее значение оценки к суме оценок
            gradeCounter++; // увеличиваем значение счетчика оценок на 1
            System.out.print("Enter grade or negative number to quit: ");
//      Читаем следующее значение оценки.
            grade = input.nextInt();
        }
//      Проверяем что пользователь ввел хотя бы одну оценку.
        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;
//          Выводим сумарное значение оценок и среднюю в классе.
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        } else
//          Выводим сообщение о том, что пользователь не ввел ни одной оценки.
            System.out.println("No grades were entered");
    }
}
