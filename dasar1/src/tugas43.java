import java.util.Scanner;

public class tugas43 {
    public tugas43() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);

        double var2;
        do {
            System.out.print("Masukkan angka positif (atau angka negatif untuk keluar): ");
            var2 = (double)var1.nextInt();
            if (var2 >= 0.0) {
                System.out.println("Anda memasukkan angka positif: " + var2);
            } else {
                System.out.println("Terima kasih, keluar dari program.");
            }
        } while(var2 >= 0.0);

        var1.close();
    }
}
