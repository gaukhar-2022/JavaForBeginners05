package homework;

public class HW2 {

    public static void main(String [] args) {

        System.out.println("**************Exercise 3***************");
        int number = 3;


        System.out.println("**************Exercise 4***************");
        int x = 13;
        int y = 20;
        int z = 45;

        System.out.println("_____________________________________");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println("_____________________________________");


        System.out.println(x + "\t" + y +"\t" + z);
        System.out.println("_____________________________________");

        System.out.println("int x = 13 \n" +
                "int y = 20" + "\t" + "\n" +
                "int z = 45");
        System.out.println("_____________________________________");


        System.out.println("**************Exercise 5***************");
        System.out.println("13," + "20," + "45");
        System.out.println("_____________________________________");

        System.out.println("**************Exercise 6***************");

        int sumXY = x + y;
//        System.out.println(sumXY);
        System.out.println("Sum of x and y = " +sumXY);

        System.out.println("_____________________________________");


        int multiplicationXZ = x * z;
//        System.out.println(multiplicationXZ);
        System.out.println("Multiplication of x and z = " + multiplicationXZ);

        System.out.println("_____________________________________");

        int subYZ = y - z;
        System.out.println(subYZ);
        System.out.println("Subtraction of y and z = " + subYZ);



        System.out.println("**************Exercise 7***************");
        int apple = 40;
        int student = 6;
        int divisionAppleStudent = apple / student;
        int divisionAppleStudent1 = apple % student;

        System.out.println("Если " + apple + " яблок поделить на \n" +
                +  student + " учеников, то каждый ученик получит " +
                " по "  + divisionAppleStudent + " яблок,и "  + divisionAppleStudent1  +  " яблок "  +
                " останется учителю. ");


        System.out.println("**************Exercise 8***************");
        int apple1 = 100;
        int student1 = 21;
        int divisionAppleStudent2 = apple1 / student1;
        int divisionAppleStudent3 = apple1 % student1;


        System.out.println("Если " + apple1 + " яблок поделить на \n" +
                + student1 + " ученика, то каждый ученик получит " +
                " по " + divisionAppleStudent2 + " яблока, и " + divisionAppleStudent3 +
                " яблок останется учителю. ");


        System.out.println(" \n **************Exercise 9*************** \n ");
        int lemon = 6;
        int apples = 24 + lemon;
        int pears = apples - 12;
        int totalFruits = apples + lemon + pears;

        System.out.println(" Всего фруктов = " + totalFruits + " килограммов ");

        System.out.println(" \n **************Exercise 10*************** \n ");


        int legsAching = 8;
        int legsThrobbing = 5;
        int legsLimping = 7;
        int legsHurting = 2;

        int legsHealthy = 40 - (legsAching + legsThrobbing + legsLimping + legsHurting);

        System.out.println("У сороконожки заболели ножки:\n " +
                legsAching + " ноют " + legsThrobbing + " гудят,\n " +
                legsLimping + " хромают, " + legsHurting + " болят\n" +
                " Помоги сороконожке \n " +
                "Посчитать здоровые ножки. \n " +
                "Ответ: = " + legsHealthy);


//        Part 2

        System.out.println("**************Exercise 11***************");

        int a = 35;
        int b = 7;
        int c = 8;
        int d = 48;
        int e = 54;
        int f = 6;

        System.out.println( a + " больше, чем " + b +  " в " + (a / b) + " раз ");
        System.out.println( c + " меньше, чем " + d + " в " + (d / c) + " раз,");
        System.out.println( e + " больше, чем " + f + " на " + (e - f) + ".");


        System.out.println(" \n **************Exercise 12*************** \n ");

        System.out.println(" a) " + (48 % 8));
        System.out.println(" b) " + (48 % 2) + "," + (8 % 2));
        System.out.println(" c) " + (47 % 2) + "," + (49 % 2));
        System.out.println(" d) " + (47 % 7) + "," + (49 % 7));

        System.out.println(" \n **************Exercise 13*************** \n");
        int k = 5;
        int l = 10;
        int m = 15;

        int oldK = k;

        String line = " \t ___________________________________________________________________________________ \n";
        String vLine = "\t|\t";
        String endLine = "\t|";
        String tab = "\t";


        System.out.println(
                line
                + vLine + tab
                + vLine + " +10"
                + vLine + " -5"
                + vLine +  "*100"
                + vLine + "/2"
                + vLine + "%2"
                + vLine + "^2"
                + vLine + "++"
                + vLine + "--"
                + endLine

        );
        System.out.print(
                line
                + vLine + "k = 5"
                + vLine + (k +10) + tab
                + vLine + (k - 5)
                + vLine + (k * 100) + tab
                + vLine + (k / 2)
                + vLine + (k % 2)
                + vLine + (k * k++)
                + vLine + (k--)
                + vLine + (k)

        );

        k = oldK--;

        System.out.println(vLine + oldK + endLine);

        k = l;

        System.out.print(
                       line
                       + vLine + "l = 10"
                       + vLine + (k + 10)
                       + vLine + (k - 5)
                       + vLine + (k * 100)
                       + vLine + (k / 2 )
                       + vLine + (k % 2)
                       + vLine + (k * k++)
                       + vLine + (k--)
        );


        System.out.println(" \n **************Exercise 15*************** \n");

        int ac = 5;
        int fs = 15;
        int ty = 69;
        int x_15 = 5 * 69 / 15;

        System.out.println(" В мастерской за " + ac + " дней сшили " + fs + " костюмов, \n " +
                "поровну за каждый день. За сколько дней при той же ежедневной средней выроботке " +
                " сошьют " + ty + " костюмов? Ответ: за " + x_15 + " дня. ");


//        Part 3

        System.out.println(" \n **************Exercise 16*************** \n");

//        int a;
//        int b;
//        int c;












    }
}
