package homework;

public class HW3 {

    static String Task = ("\nTask #");
    static  int number = 2;


    public static void Task(){
        System.out.println( Task + (number ++));

    }

    public static void Task(String text, int num) {
        System.out.println(text + num);
        num++;
    }



    public static final String LINE_BEGIN = "\n|";

    public static void main(String [] args ) {

        int Task = 2;

        System.out.println("\n ****************** Task № " + Task + " ******************* \n");
         byte a = 34;
         byte b = 50;

//         3
        Task();
        System.out.println("\n ****************** Task № " + ++Task + " ******************* \n");
        short s = 30000;
        short t = -30000;
        int delta = s - t;

        System.out.println(delta);

        System.out.println("\n ****************** Task № " + ++Task + " ******************* \n");

        int i = 10;
        i = Integer.MIN_VALUE;


        String line = "__________________________________________\n";
        String startLine = "\t|\t";
        String endLine = "_________________________________________\n";


        System.out.println(
                line
                + startLine + " int min "
                + startLine + Integer.MIN_VALUE + "\n"
                + line
                + startLine + " int max "
                + startLine + Integer.MIN_VALUE + "\n"
                + endLine
        );

        System.out.println("\n ****************** Task № " + ++Task + " ******************* \n");

        long phoneNumber = 996705810101L;

        System.out.println(phoneNumber);

        System.out.println("\n ****************** Task № " + ++Task + " ******************* \n");

        float f = 100.101101F;
        double d = 100.101101;

        String line1 = "________________________________________ \n";
        String vline = "|\t";
        String tab = "\t";
        String endline1 = "________________________________________ \n";

        System.out.println(
                line1
                + vline + "float f = 100.101101"
                + vline + f
                + vline + tab + "\n"
                + line1
                + vline + "double d = 100.101101"
                + vline + d
                + vline + tab + "\n" + endline1

        );

        System.out.println("\n ****************** Task № " + ++Task + " ******************* \n");

        System.out.println( " a) ");

        double dd = 10.09999 + 20.099999;

        System.out.println(dd);

        System.out.println( " b) ");

        float ff = 10.09999F + 20.099999F;

        System.out.println(ff);


        System.out.println("\n ****************** Task № " + ++Task + " ******************* \n");

        ff = 10F / 3F;
        dd = 10.0 / 3;

        System.out.println(ff);
        System.out.println(dd);

        System.out.println("\n ****************** Task № " + ++Task + " ******************* \n");

        float floatSum = f + ff;
        float floatSub = f - ff;
        float floatProduct = f * ff;
        float floatQuotient = f / ff;
        float floatRemainder = f % ff;

        System.out.println(floatSum + ","
                        + floatSub + "," + floatProduct + ","
                        + floatQuotient + ","
                        + floatRemainder + "."
                );

        System.out.println("\n ****************** Task № " + ++Task + " ******************* \n");


        double doubleSum = d + dd;
        double doubleSub = d - dd;
        double doubleProduct = d * dd;
        double doubleQuotient = d / dd;
        double doubleRemainder = d % dd;

        System.out.println(doubleSum + ","
                         + doubleSub + ","
                         + doubleProduct + ","
                         + doubleQuotient + ","
                         + doubleRemainder + "."
        );


        System.out.println("\n ****************** Task № " + ++Task + " ******************* \n");


        String lineH = "_________________________ \n";
        String lineHS = "________________________";
        String LINE_BEGIN = " f= ";
        String LineV1 = "|";

//        String LineEnd = "________________________";

        System.out.println(lineH + LINE_BEGIN + f + "\n" + LineV1 + lineHS);









    }

}
