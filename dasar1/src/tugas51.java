import java.util.Scanner;


public class tugas51 {


    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("masukan nilai kamu :");
        double var2 = var1.nextDouble();
        if (var2 < 49.99) {
            System.out.println("e");
        } else if (var2 < 59.99) {
            System.out.println("d");
        } else if (var2 < 69.99) {
            System.out.println("c");
        } else if (var2 < 79.99) {
            System.out.println("b");
        } else if (var2 >= 80.0) {
            System.out.println("a");
        }

        var1.close();
    }
}
