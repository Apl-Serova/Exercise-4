import java.util.Scanner;
public class Bottom {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите X: ");
        int X = s.nextInt();
        System.out.println("Введите Y: ");
        int Y = s.nextInt();
        System.out.println("Введите Z: ");
        int Z = s.nextInt();
        int sr = X + Y + Z;
        sr /=3;
        if (sr>3)
            System.out.println("Программа выполнена корректно");
    }
}
