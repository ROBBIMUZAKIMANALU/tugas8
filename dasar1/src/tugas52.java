import java.util.Scanner;

public class tugas52 {


    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("masukan nilai kamu :");
        double var2 = var1.nextDouble();
        double var4 = var2 * 0.04;
        if (var4 < 2.0) {
            System.out.println("e");
        } else if (var4 < 2.4) {
            System.out.println("d");
        } else if (var4 < 2.8) {
            System.out.println("c");
        } else if (var4 < 3.2) {
            System.out.println("b");
        } else if (var4 >= 3.2) {
            System.out.println("a");
        }

        var1.close();
    }
}
