import java.util.Scanner;

public class tugas35 {

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Masukkan nilai ujian (0-100): ");
        int var2 = var1.nextInt();
        var1.close();
        if (var2 >= 70) {
            System.out.println("Selamat! Anda lulus ujian.");
        } else if (var2 >= 50) {
            System.out.println("Anda harus mengikuti ujian susulan.");
        } else {
            System.out.println("Maaf, Anda tidak lulus ujian.");
        }

        if (var2 >= 90) {
            System.out.println("Prestasi sangat baik!");
        } else if (var2 >= 80) {
            System.out.println("Prestasi baik.");
        }

        if (var2 < 50) {
            System.out.println("Anda perlu belajar lebih keras.");
        } else {
            System.out.println("Teruskan kerja keras Anda.");
        }

    }
}
