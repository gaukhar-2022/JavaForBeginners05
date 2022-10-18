package lessons;


public class Lesson2 {

    public static void main(String [] args) {
        String line = "_______________________________________";
        String task = "Задание № ";
        int count = 1;


//        System.out.println(line);
//        System.out.println( task + count);
//        /* создать переменную типа int...
//
//         */
//        int a = 1;
//        System.out.println(a);


//        System.out.println(line);
//        System.out.println( task + (++ count));
//        /* создать переменную типа int...

//         */

//        System.out.println(line);
//        System.out.println( task + (++ count));
//        /* создать переменную типа int...
//
//         */



        System.out.println(line);
//        System.out.println( task + count++);
//        /* создать переменную типа int...
//
//         */
//        int a = 1;
//        System.out.println(a);

        int a = +5;
        int b = -5;// b = -5

        int temB = b;
        int c = 5;

        System.out.println(a + b);

        System.out.println(line);

        int sumAB = a + b;
        System.out.println(sumAB);

        System.out.println(line);

        String s = "+ 5 - это пять";

        System.out.println(a);
        System.out.println(b);
        System.out.println(s);

        System.out.println(line);

        int sumBC = b +c;
        System.out.println(sumBC);

        int subAB = a - b;
        int subBA = b - a;

        int task3Solution = sumBC + subAB;
        int task4Solution = sumBC + subBA;

        System.out.println(line);

        System.out.println("task3Solution = " + task3Solution);
        System.out.println("task4Solution = " + task4Solution);

        int multiAB = a * b;
        int divAB = a / b;

        System.out.println(line);

        System.out.println("multiAB = " + multiAB);
        System.out.println("divAB  = " + divAB);

        System.out.println(line);

        int remAB = a % b;

        System.out.println(remAB);

        System.out.println(line);

        System.out.println(25 / 5);
        System.out.println(25 % 5);

        System.out.println(11 / 5);
        System.out.println(11 % 5);

        System.out.println(100 / 99);
        System.out.println(100 % 99);

        System.out.println(4 / 2);
        System.out.println(5 / 2);

        System.out.println(4 % 2);
        System.out.println(5 % 2);

        System.out.println(49764792 % 7);
        System.out.println(49764791 % 7);

        System.out.println(line);

//        b = -5
//        c = 5
        System.out.println(b++); //-4
        System.out.println("**********************");
        System.out.println(b);


        System.out.println(c++);

        System.out.println(line);

        System.out.println(++b); //-4, -3, -5
        System.out.println(++c); //7, 6, 5

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(temB);// camelCase
        System.out.println(b);

        //        b + 1     равно    1 + b
//        b++       не равно  ++b
        //b = 5

        //b++ = сначала распечатается 5, а потом прибавится единица (5 + 1), и b станет равно 6
        //++b =  сразу прибавится единица и распечатается 6

        System.out.println(line);
        System.out.println(line);
        int x = 5;
        int y = 5;

        System.out.println(x++);
//        System.out.println(++y);

        System.out.println(x);
        System.out.println(y);


        System.out.println(task + count);

        int boxOfCandies = 4;
        int weighForOneBoxOfCandies = 9;
        int boxOfCookies = 3;
        int weihgtForOneBoxOfCookies = 8;

        int weightForAllBoxes;

        weightForAllBoxes = (boxOfCandies * weighForOneBoxOfCandies) + (boxOfCookies * weihgtForOneBoxOfCookies);

        System.out.println(weightForAllBoxes +" всего килограммов конфет и печений привезли в детский сад");





    }


}
