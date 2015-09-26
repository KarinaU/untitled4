import java.io.IOException;
import java.util.Scanner;

/**
 * Created by IT_School on 20.09.2015.
 */
public class main {
    /*public static void main (String args[]) throws IOException {
        int x;
        x = System.in.read();
        char c = (char)x;
        System.out.println("Код символа: " + c + " = " + x);
    }*/


    /*public static void main(String args[]){
        System.out.println("Введите Ваше имя и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Привет, " + name);
        scan.close();
    }*/


    /*public static void main(String args[]){
        double a = 7;
        int b = 2;
            System.out.println(a/b);
    }*/


    /*public static void main(String args[]){
        int a =7;
        System.out.println(a++);
        System.out.println(++a);
    }*/


    /*public static void main(String args[]){
        float f = 0.1;
        double d = .5;
    }*/


    /*public static void main(String args[]){
        float x = 0, y = 0;
        x = (float) (0.3 + 0.4);

        y = 0.3f + 0.4f;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);
    }*/


    /*public static void main(String args[]){
        int a = 7;
        double b = 0.0;
        double c = -0.0;
        double d = 2.5;
        double g = Double.NEGATIVE_INFINITY;

        System.out.println(a / b);
        System.out.println(a / c);
        System.out.println(b == c);

        System.out.println(d / 0);
        System.out.println(g * 0);
    }*/


    /*public static void main(String args[]){
        char c1 = '1';
        char c2 = '\u0031';
        char c3 = 49;
        System.out.println(c1 + c2 + c3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1 + c2);
    }*/


    /*public static void main(String args[]){
        char ch1, ch2;
        ch1 = 88;
        ch2 = 'Y';
        System.out.println("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);
    }*/

    /*public static void main(String args[]) {
        System.out.println("4/2=" + 4 / 2 == "4/2=2");
    }*/


    /*public static void main(String args[]) {
        String a = "a";
        String b = "a";
        System.out.println (a==b);
    }*/

    /*public static void main(String args[]) {
        String a = "a";
        String b = new String(a);// новый объект создали по сравнению с предыдущим вариантом
        System.out.println(a == b);
    }*/


    /*public static void main(String args[]) {
        String a = "a";
        String b = "a";
        String c = a;
        a = "c";
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }*/


    /*public static void main(String args[]) {
        System.out.println("\u0420\u043e\u0441\u0441\u0438\u044f");
    }*/

    /*public static void main(String args[]) {
        byte b1 = 50, b2 = -99;
        int k = b1 + b2;
        System.out.println("k=" + k);
    }*/


    /*public static void main(String args[]) {
        byte b1 = 50, b2 = -99;
        b1 += b2;
        System.out.println("b1 = " + b1);
    }*/


    public static void main(String args[]) {
        byte b1 = 50, b2 = 100;
        Byte k = (byte) (b1 + b2);
        System.out.println("k=" + k);
    }
}
