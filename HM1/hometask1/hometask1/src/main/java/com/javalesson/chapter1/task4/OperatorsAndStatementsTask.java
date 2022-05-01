package com.javalesson.chapter1.task4;

/**
 * Данный класс предназначен для проверки знаний студентов по темам раздела
 * "Базовые конструкции языка Java" тренинга
 * "Java. От простого к сложному" на сайте Udemy.
 *
 * В теле класса приводятся методы которые должны быть заполнены студентами курса.
 * Задание считается выполненным если все тесты в классе <code>OperatorTest</code>
 * выполнены успешно и при этом соблюдены все требования указанные в JavaDoc к методам.
 *
 * В случае возникновения трудностей, обратите внимание на тест метода с которым возникла проблема.
 * Возможно так будет проще понять в чем суть задания.
 *
 * Для проверки правильности выполнения задания просмотрите класс <code>OperatorsAndStatementsAnswers</code>
 *
 * Created by Aleksandr Vasko.
 */
public class OperatorsAndStatementsTask {
    private static int strange = 0;
    private static int normal = 0;

    public static void main(String[] args) {
        System.out.println("Running main");


        /**
         * Результирующий массив должен включать
         * 3 значения Strange
         * 3 значения Normal
         *
         * */
        String[] numberTypes = testStrangeNumbers();

        countNumTypes(numberTypes);

    }

    /**
     * Для начала выполнения задания раскомментируйте параметр метода checkStrangeness
     * Метод должен принимать 1 параметр типа int.
     *
     * Предположим есть некоторое значение num.
     * Имплементируйте такой метод checkStrangeness(int num){...} который будет проверять
     * переменную num на странность и вернет нам значение:
     * <p>
     * - Strange если num не четный
     * - Normal если num четный и находится в диапазоне от 2 до 5
     * - Strange если num четный и находится в диапазоне от 6 до 20
     * - Normal если num четный и больше 20
     * Во всех остальных случаях метод может вернуть значение Undefined.
     * <p>
     * Должно получиться не больше 2-х строк с условными операторами if / else-if
     * <p>
     * Наполните код предложенный ниже. Используйте код предложенный в других методах
     * для того чтобы проверить разные варианты параметра num.
     * Пример: 3 - Strange; 4 - Normal
     * <p>
     * Внимание!!! Настоятельно рекомендуется сохранять сигнатуру методов (особенно не приватных)
     * и возвращать значения Strange и Normal в том же регистре что и в примере. В противном случае
     * тесты не будут выполнены успешно.
     * <p>
     * Для проверки результатов выполните тесты в классе OperatorsTest нажав правой кнопкой мыши
     * и вызвав Run OperatorsTest.
     */
    static String checkStrangeness(int num) {
        return null;
    }


    /**
     * Нужно посчитать количество элементов типа Strange и типа Normal
     * В результате получится 3 - Strange и 3 - Normal.
     *
     * Для подсчета используйте цикл for граничное значение можно установить в качестве константы, например
     * i=0; i<6; i++ (предполагается что на данном этапе массивы еще не рассматривались в курсе),
     * или можно использовать статическую переменную массива .length
     *
     * Проверку типа значения Strange или Normal нужно выполнить с помощью оператора switch.
     * Результаты подсчета нужно сохранить в переменные <code> private static int strange</code> и
     * <code>private static int normal</code> использовав при этом оператор инкрементирования.
     *
     * Вспомните какая разница между префиксным и постфиксным операторами инкрементирования?
     *
     * После того как задание выполнено успешно с помощью цикла for, попробуйте добиться
     * того же результата с помощью циклов while и do - while.
     * */
    private static void countNumTypes(String[] types) {

    }


    private static String[] testStrangeNumbers() {
        /**
         * Передайте 3 значения которое в соответствии с заданием дадут результат
         * Strange и 3 значения которое дадут результат Normal.
         * Пример: 3 - Strange
         * Удалите знаки комментариев и передайте integer значение.
         * */
        String[] numberTypes = new String[6];
        numberTypes[0] = checkStrangeness(3);
        numberTypes[1] = checkStrangeness(3);
        numberTypes[2] = checkStrangeness(3);
        numberTypes[3] = checkStrangeness(3);
        numberTypes[4] = checkStrangeness(3);
        numberTypes[5] = checkStrangeness(3);

        return numberTypes;
    }



    static int getStrange() {
        return strange;
    }

    static int getNormal() {
        return normal;
    }
}

