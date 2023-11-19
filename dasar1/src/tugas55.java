import java.util.Scanner;

public class tugas55 {
    public tugas55() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Masukkan nilai angka: ");
        double var2 = var1.nextDouble();
        var1.close();
        double var4 = var2 / 25.0;
        System.out.print("ip kamu adalah " + var4);
    }
}
