public class Main {

/*    While using the varargs, you must follow some rules otherwise program code won't compile. The rules are as follows:
    There can be only one variable argument in the method.
    Variable argument (varargs) must be the last argument.*/

/*    Examples of varargs that fails to compile:
    void method(String... a, int... b){}
    void method(int... a, String b){}  */


    public static void main(String[] args) {
        int sum = add(1, 2, 3, 4);
        System.out.println(sum);

        display("Software", "Development", "Academy");
    }

    private static int add(int... args) {
        int sum = 0;
        for (int a : args) {
            sum += a;
        }
        return sum;
    }

    public static void display(String... values) {
        for (String s : values) {
            System.out.println(s);
        }
    }
}
