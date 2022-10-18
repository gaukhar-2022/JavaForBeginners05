package homework;

public class HW5 {

    static int tcNumber = 2;

//    static int partNumber = 2.1;

    //Вспомогательные методы для печати отчета тестирования
    public static void printTCNumber() {
        System.out.print("\nTC_" + tcNumber++  + "\t -- \t");
    }

//    public static void printAddTCNumber() {
//        System.out.println("\nTC_" + partNumber++ + "\t -- \t");
//    }

    public static void printTestResult(String value) {
        System.out.print(value);
        System.out.println();
    }



//    Part 1
//    1.Создать метод самостоятельно

    public static String verifyEquals(int expectedResults, double actualResult) {
        if (expectedResults == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public  static String verifyEquals(String expectedResult, String actualResult) {
        if(expectedResult.equals(actualResult)) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        if(expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }



    public static int returnAverageAge(int age1, int age2, int age3) {
        if (age1 >= 0 && age1 <= 150 && age2 >= 0 && age2 <= 150 && age3 >=0
                && age3 <= 150) {
            int averageAge = (age1 + age2 + age3) / 3;
        }
        int averageAge = (age1 + age2 + age3) / 3;

        return averageAge;
    }




    //    2.Написать метод, который принимает на вход число от 1 до 7 и возращает день недели.
    public static String returnDayOfWeek(int number) {
        if(number > 0 && number < 8) {
            if(number == 1) {

                return "Monday";
            }
            if(number == 2) {
                return "Tuesday";
            }
            if (number == 3) {
                return "Wednesday";
            }
            if (number == 4) {
                return "Thursday";
            }
            if (number == 5) {
                return "Friday";
            }
            if (number == 6) {
                return "Saturday";
            }
            if (number == 7) {
                return "Sunday";
            }
        }
        return "Error";

    }


//        4. Найти минимальное  значение, используя переменные (по одному методу на каждый вариант

        public static int findMin(int k, int l) {

            int min;

            if (k < l) {
                min = k;
            } else {
                min = l;
            }

            return min;

        }

        public static int findMin3(int k, int l, int m) {
            int min1;

            if (k < l) {
                min1 = k;
            } else {
                min1 = l;
            }

//            if (min1 < m) {
//                min1 = min1;
//            } else {
//                min1 = m;
//            }

            if (m < min1) {
                min1 = m;
            }

            return min1;

        }

        public static int findMin4 (int k, int l, int m, int n) {
            int min1;
            int min2;
            int min3;

            if (k < l) {
                min1 = k;
            } else {
                min1 = l;
            }


            if (m < n) {
                min2 = m;
            } else {
                min2 = n;
            }

            if (min1 < min2) {
                min3 = min1;
            } else {
                min3 = min2;
            }
            return min3;
        }






        public static void main(String [] args) {

//        TC_2
//          Написать метод, который принимает на вход число от 1 до 7 и
//          возвращает день недели. В случае невалидных значений метод возвращает “Error”.
//          Протестировать метод
          int number = 8;
          String expectedResultString = "Error";

          String actualResultString = returnDayOfWeek(number);

          verifyEquals(expectedResultString,actualResultString);

          printTCNumber();
          printTestResult(verifyEquals(expectedResultString,actualResultString));
          System.out.println(expectedResultString + "\t" + actualResultString);


//          TC_3
//          Написать алгоритм вычисления среднего возраста (int) в
//          семье из 3х человек.
//          Например,
//          int age1 = 20,
//          int age2 = 40,
//          int age3 = 60
//          Average = 40.
//          или

//          age1 = -5;
//          age2 = -30;
//          age3 = -3;
//          должно вернуть  Integer.MIN_VALUE;
//          Протестируйте алгоритм на позитивные и негативные сценарии.
          int age1= 20;
          int age2 = 40;
          int age3 = 60;
          int expectedResult1 = 40;

          int actualResult1 = returnAverageAge(age1, age2, age3);

          printTCNumber();
          printTestResult(verifyEquals(expectedResult1, actualResult1));

          System.out.println(expectedResult1 + "\t" + actualResult1);

//         TC_3.a
//
//          age1 = -5;
//          age2 = -30;
//          age3 = -3;
//          int expectedResult1a = Integer.MIN_VALUE;
//
//          int actualResult1a = returnAverageAge(age1, age2, age3);
//
//          printTCNumber();
//          printTestResult(verifyEquals(expectedResult1a, actualResult1a));
//
//          System.out.println(actualResult1a);



//          TC_4
//          Найти минимальное  значение, используя переменные (по одному методу на каждый вариант)
//          k и l
//          k, l, m
//          k, l, m, n
//          Написать тесты на каждый метод.
          int k = 10;
          int l = 7;
          expectedResult1 = 7;

          actualResult1 = findMin(k,l);

          verifyEquals(expectedResult1, actualResult1);


          printTCNumber();
          printTestResult(verifyEquals(expectedResult1,actualResult1));
          System.out.println(expectedResult1 + "\t" + actualResult1);

//          (b)
          int m = 3;
          expectedResult1 = 3;

          actualResult1 = findMin3(k, l, m);

          verifyEquals(expectedResult1, actualResult1);

//          printTCNumber(); // 4.b
          printTestResult(verifyEquals(expectedResult1, actualResult1));
          System.out.println(expectedResult1 + "\t" + actualResult1);


//          (c)
            int n = 1;
            expectedResult1 = 1;

            actualResult1 = findMin4(k, l, m, n);

            verifyEquals(expectedResult1, actualResult1);

//            printTCNumber(); 4.c
            printTestResult(verifyEquals(expectedResult1, actualResult1));
            System.out.println(expectedResult1 + "\t" + actualResult1);


//            TC_5
//            Написать алгоритм вычисления среднего значения из 5
//            показателей температуры тела кота. Метод принимает и
//            возвращает значения типа double.
//            Протестируйте метод на позитивные и негативные сценарии.


















    }
}

