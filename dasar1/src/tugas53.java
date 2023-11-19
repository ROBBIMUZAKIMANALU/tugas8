import java.util.Scanner;

public class tugas53 {

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Masukkan nilai angka: ");
        double var2 = var1.nextDouble();
        var1.close();
        char var4;
        if (var2 >= 0.0 && var2 <= 100.0) {
            int var5 = (int)var2 / 25;
            switch (var5) {
                case 5:
                    var4 = 'D';
                    break;
                case 6:
                    var4 = 'C';
                    break;
                case 7:
                    var4 = 'B';
                    break;
                case 8:
                    var4 = 'A';
                    break;
                case 9:
                case 10:
                    var4 = 'A';
                    break;
                default:
                    var4 = 'E';
            }
        } else {
            var4 = 'T';
        }

        System.out.println("Nilai huruf: " + var4);
    }
}
