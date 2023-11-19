import java.util.Scanner;

public class tugas41 {

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        double var2 = 0.0;
        boolean var4 = true;
        System.out.println("masukan nilai kamu dan ketik tutup jika selesai");

        while(var4) {
            if (var1.hasNextDouble()) {
                double var5 = var1.nextDouble();
                var2 += var5;
            } else if (var1.hasNext("selesai")) {
                var4 = false;
            } else {
                System.out.println("masukan angka bukan huruf");
                System.out.println("mohon perhatikan kembali");
                var1.next();
            }
        }

        var1.close();
        System.out.print("total kamu adalah" + var2);
    }
}
