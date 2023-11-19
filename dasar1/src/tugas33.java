import java.util.Scanner;

public class tugas33 {


    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("kalau makan diatas 50.000 diskon 10% ");
        System.out.println("kalau makan diatas 100.000 diskon 15% ");
        System.out.print("masukan total =");
        int var2 = var1.nextInt();
        double var3 = (double)var2 * 0.9;
        double var5 = (double)var2 * 0.85;
        if (var2 > 50000) {
            System.out.println("cuma bayar " + var3);
        } else if (var2 > 100000) {
            System.out.println("cuma bayar" + var5);
        }

    }
}
