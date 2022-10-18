package lessons;

public class Lesson4 {

    public static void main(String[] args) {
//        Андрей страше Светы и Наташа старше Светы

//        int ageA;
//        int ageN;
//        int ageS;

//        (ageA > ageS) && (ageN > ageS);

        int a = 25;
        int b = 7;

        System.out.println(5 > 7);
        System.out.println((a >= b) || (a < b));

        System.out.println(a != b);
        System.out.println(!(a == b));

//        if - then
//        if () {
//
//        }
//        если a равно b, то сложить  a и b

        if (a == b) {
            System.out.println(a + b);
        }



//        if-else
//        if () {
//
//        } else  {
//
//        }
//        если a равно b, то сложить  a и b, а иначе вычесть из a значение b

        if (a == b) {
            System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }



//        if- if else - else
//        if () {
//
//        } else if () {
//
//        } else {
//
//        }

//        если a равно b, то сложить  a и b, если же  a > b, то присвоить значение a значение b
//        а иначе вычесть из a значение b
        if (a == b) {
            System.out.println(a + b);
        }   else if (a > b) {
            a=b;
            System.out.println(a);

        } else {
            System.out.println( a - b);

        }

//        Если a > b или b < c, то присвоить a значение 7, и сложить b и с
//        иначе присвоить a значение 10
//        int a1 = 0;
//        int b1 = 7;
//        int c1 = 25;
//
//        if ((a1 > b1) || (b1 < c1)) {
//            a1 = 7;
//            int sum = b1 + c1;
//            System.out.println(" a = " + a1);
//            System.out.println("sum = " + sum);
//        } else {
//            a = 10;
//            System.out.println("a = " + a1);
//        }

//        !!! Первый тест!!!

//        Проверьте число n.
//        Если число n нечетное и кратно трем, то присвойте n значение 0.
//        Если число n нечетное и не ркатно трем, то присвойте n значение
//        10.
//        Если число n четное, и 100 делится на число n без остатка, то
//        присвойте n значение 100

//        Напишите тест, который проверит работу вашего кода и выведет
//        на печать результат проверки.
//        Тестовые данные 21, 43, 20

        int n = 20;

        if ((n % 2 != 0) && (n % 3 ==0)) {
            n = 0;
        } else if ((n % 2 != 0) && (n % 3 !=0)) {
            n = 10;
        } else if ((n % 2 ==0) && (100 % n == 0)) {
            n = 100;
        }

//        Test
        int expectedResult = 100;
        int actualResult = n;

        if (actualResult == expectedResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        Integer x = 12;
        Integer y = 20;

        System.out.println(x.equals(y));

        System.out.println(!(x.equals(y)));

        String hi1 = "Hi";
        String hi2 = "Hi";
        System.out.println(hi1.equals(hi2));

















    }


}
