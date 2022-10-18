package homework;

public class HW6 {

    static String task = "\nTask # ";

    static int exerciseNumber = 1;

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ANSI_RED = "\u001B[31m";


    //Вспомогательные методы для печати отчета тестирования
//    public static void printExerciseNumber() {
//        System.out.print("Exercise #" + exerciseNumber++);
//    }
    public static void printTask() {
        System.out.println(task + (exerciseNumber ++));
    }


    public static void printTaskNumber1() {
//        1.Распечатать последовательность чисел от 0 до 9 включительно.
        for(int i = 0; i <= 9; i++) {
            System.out.println(i);
        }
    }



    public static void main(String [] args) {

//        for(;;) {
//        code
//    }


        printTask();
        printTaskNumber1();


        printTask();
//        2.Распечатать последовательность чисел от 10 исключительно до 0 включительно.
        for(int i = 9; i >= 0; i--) {
            System.out.print(i + " ");
        }


        printTask();
//        3.Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
        for (int i = 50; i <= 55; i += 2) {
            System.out.println(i);
        }

        printTask();
//        4.Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
        for(int i = 326; i >= 301; i -= 1) {
            if((i % 7) == 0) {
                System.out.println(i);
            }
        }


        int beginning = 327 - 1;
        int end = 300 + 1;
        int start = beginning - beginning % 7; // 326 - 326 % 7
        System.out.println(326 % 7);

        for(int i = start; i>= end; i-=7) {
            System.out.println(i);
        }


        printTask();
//        5.Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
        double e = 0;
        for(double i = 12; i <= 13; i += 0.1) {
            e = Math.round (i * 100) /100.00;
            System.out.println(i);
        }

        printTask();
//        6.Распечатать последовательность четных чисел от 215 до 237 включительно
        for(int i = 215; i <= 237; i++) {
            System.out.print(i + " ");
        }

        printTask();
//        7.Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
        for(int i = 8; i <= 13; i++) {
            if ((i % 7) == 0) {
                System.out.println(i);
            }
        }


        printTask();
//        8.Распечатать последовательность которая начинается с минимального
//        значения типа данных short и заканчивается максимальным значением
//        short. Числа в последовательности должны быть кратны 15001.
        for (int i = -32768; i <= 32767; i++) {
            if(i % 15001 == 0) {
                System.out.println(i);
            }
        }



        printTask();
//        9.Распечатать последовательность чисел в промежутке от -10 до 34 включительно
//        Числа, кратные 11, должны быть распечатаны синим цветом.
//        Числа, кратные 12, должны быть распечатаны красным цветом.
//        А ноль необходимо распечатать словом ZERO.
//        for(int i = -10; i <= 34; i++) {
//
//
//            if (i % 11 == 0 && i !=0) {
//                System.out.println("\u001B[34m" + i + "\u001B[0m"); {
//                } else  (i % 12 == 0 && i !=0) {
//                    System.out.println("\u001B[31m" + i + "\u001B[0m"); {
//
//                    } else if (i == 0); {
//                        System.out.println("ZERO");
//                    }
//
//                }
//                System.out.println(i);
//
//            }
//        }


        printTask();
//        10.Написать метод, который принимает на вход параметры start,  end, step,
//        и печатает последовательность десятичных  чисел, начиная с числа
//        start, с шагом step. Точка выхода из цикла - число end.




        printTask();
//        11.Написать метод, который принимает на вход параметры n и m типа char,
//        и выводит на печать последовательность букв английского алфавита в
//        промежутке между значениями n и m включительно.

//        char/Character
        char n ='a';
        char m = 'z';
        System.out.println((int)n);

        for (char i = n; i <= m; i++ ) {
            System.out.println(i);
        }


//        Part №2
        printTask();
//        12.Написать метод, который принимает параметр  и печатает
//        последовательность четных чисел от нуля. Длина последовательности = l.
        for(int i = 0; i <= 122; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

//        13.Напишите метод, который принимает целое число n, и выводит все
//        степени числа 2 от 1 до n включительно

    }
}


