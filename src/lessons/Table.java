package lessons;

public class Table {


//    public  static void methodName() {
//
//    }


    //    public  static void methodName(type argsName, type argsName) {
//
//    }

    static String line = " \t ___________________________________________________________________________________ \n";
    static String vLine = "\t|\t";
    static String endLine = "\t|";
    static String tab = "\t";


    public static void printLine() {
        System.out.println("\t ________________________________________________________________________\n");


    }

    public static void printNumber(int a) {
        System.out.println(a);
    }


    public static void print(String text) {
        System.out.println(text);

    }

    public static void printNumberAndTex(double number, String text){
        System.out.println(line);
        System.out.println(number);
        System.out.println("" + text);

    }

    public static void printAnything (Object obj){
        System.out.println(obj);
    }


    public static void printHeader() {
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
    }

    int k = 5;
    int l = 10;
    int m = 15;


    public  static void main(String [] args) {

//        13

        String hi = "Hello!";

        printNumberAndTex(25.5, " - цена килограмма яблок");

        printAnything("this is my object");

        printLine();

        print("3");
//        print(3); - так сделать не возможно, т.к метод (print) принимает агрументы
        printNumber(234);

        print(line);
        print(" \t ___________________________________________________________________________________ \n");

        print ("Task #");
        print (hi);

//        _________________________________________________________________________________

        int k = 5;
        int l = 10;
        int m = 15;

        printHeader();

        printHeader();
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
        int oldK = k;

        String line = " \t ___________________________________________________________________________________ \n";
        String vLine = "\t|\t";
        String endLine = "\t|";
        String tab = "\t";





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
    }
}
//    static String Task = ("\nTask #");
//    static  int number = 2;
//
//
//    public static void Task(){
//        System.out.println( Task + (number ++));
//
//    }
//
//    public static void Task(String text, int num) {
//        System.out.println(text + num);
//        num++;
//    }