package homework;

import java.sql.SQLOutput;

public class HW4 {


    public static void printNumber() {
        String Line = " *** ";
        String Task = " Task # ";
        int num = 2;

        System.out.println(Line + Task + (num++) + Line + "\n");
    }

    public static void printNumber2(String text, int num, String text2) {
        System.out.println(text + (num++) + text2);

    }



    public static void main(String [] args) {

        printNumber();

        printNumber2("*** Task # ",3, " ***\n");


//        1)

        int a = 2;
        int b = 2;
        int c = 7;
        int d = 7;

        System.out.println((a == b) && (c == d));

//        2)

        int x = 15;
        int y = 3;

        System.out.println(!(x < y));

//        3)

        String pineTree = "Сосна";
        String oak = "Дуб";
        String cherry = "Вишня";
        String maple = "Клен";

        System.out.println((pineTree ==  oak) || (cherry == maple));

//        4)
        System.out.println(!(pineTree == oak));

//        5)

        int e = 15;
        int f = 3;
        int g = 10;
        int h = 20;

        System.out.println(!((e < 3)) && (g > h));
        System.out.println(!((15 < 3)) && (10 > 20));

//        6)
//        System.out.println(("Глаза даны, чтобы видеть") && ("Под третьим этажом находится второй этаж"));

//        7)

        int z = 6;
        int k = 2;
        int l = 3;
        int m = 7;
        int n = 5;
        int o = 20;

        System.out.println((z / k == l) || (m * n == o));



        printNumber2("*** Task # ",4, " ***\n");
//        a) Света младше Андрея и Наташи

//        int ageS;
//        int ageA;
//        int ageN;
//
//        (ageS < ageA) && (ageS < ageN)

        int v = 13;
        int s = 27;

        System.out.println((v < s) || (v <= s));

//        b) На полке стоят учебники, а на столе лежат справочники.

        String shelves = "books";
        String tables = "notes";

        System.out.println((shelves == "books") && (tables == "notes"));


//        в) БОльшая часть детей — девочки. Остальные - мальчики.

        int onePartGirls = 60;
        int anotherPartBoys = 40;

        System.out.println((onePartGirls > anotherPartBoys) || (!(onePartGirls == anotherPartBoys)));



        printNumber2("*** Task # ",5, " ***\n");

//        5 Задание!!!
//        “Водительские права можно получить, только когда исполнится 16 лет.”

        int ageDriverLicense = 16;

        System.out.println((" Водительские права можно получить, только когда исполнится " +
                + ageDriverLicense + " лет. "));


        printNumber2("*** Task # ",6, " ***\n");

//        Задание 6!!!
//        Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно

//        String namePetia = " не едет в астобусе ";
//        String namePetia1 = " читает или не смотрит ";


        printNumber2("*** Task # ",7, " ***\n");

        String you = " это хорошо ";

        printNumber2("*** Task # ",8, " ***\n");

//        (1) Если x больше 10, то вывести на печать “x больше 10”

        x = 10;

        if (x > 10) {
            System.out.println(" x больше 10 ");
        }

//        (2) Если x меньше нуля, то вывести на печать “x - отрицательное число”

        if (x < 0) {
            System.out.println(" x - отрицательное число ");
        }

//        (3)
//        Если x = 5, то вывести на печать “Разность x и 5 равна 0”

        if (x == 5) {
            System.out.println(" Разность x и 5 равна 0");
        }


        if (x > 10) {
            System.out.println( " x больше 10 ");
        } else if (x < 0) {
            System.out.println(" x - отрицательное число");
        } else if(x == 5) {
            System.out.println(" Разность x и 5 равна 0");
        } else {
            System.out.println("Число x меньше 11, больше или равно 0, но не равно 5 ");
        }


        printNumber2("*** Task # ",9, " ***\n");

        int ab = 9;

        if (ab % 2 == 0) {
            System.out.println(ab * 2);
        } else {
            System.out.println(ab * ab);
        }


        printNumber2("*** Task # ",10, " ***\n");

//        (a) Голосовать можно с 18 лет

        int ageOfPerson = 22;
        System.out.println("Ваш возраст " + ageOfPerson);
        int ageVote = 18;

        if (ageOfPerson > ageVote) {
            System.out.println("Вам можно голосовать");
        }

//        (b) Машину можно водить с 16 лет

        int ageOfDriver = 16;

        if (ageOfPerson > ageOfDriver) {
            System.out.println("Вам можно водить машину");
        }

//        (c) В школу можно идти с 5 лет

        int ageOfChildren = 5;

        if (ageOfPerson >= ageOfChildren) {
            System.out.println("Вам можно ходить в школу");
        }


        printNumber2("*** Task # ",11, " ***\n");


        int grade = 5;


        if (grade == 5) {
            System.out.println("Вам можно выдать похвальную грамоту и перевести в следующий класс");
        } else if (grade == 4) {
            System.out.println("Вам можно перейти в следующий класс");
        } else if (grade == 3) {
            System.out.println("Вам нужно дать задание на лето и перевести в следующий класс");
        } else if (grade == 2) {
            System.out.println("Нужно вызвать родителей и оставить в текущем классе на второй год");
        }


//        Part 2
        printNumber2("*** Task # ",12, " ***\n");




    }
}
