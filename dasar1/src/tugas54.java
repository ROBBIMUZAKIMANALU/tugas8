import java.util.Scanner;

public class tugas54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai angka: ");
        double nilai = scanner.nextDouble();

        double Nilai = nilai*0.05;
        scanner.close();

        char nilaiHuruf;


        if (nilai >= 0 && nilai <= 4) {
            int range = (int) Nilai / 6;

            switch (range) {
                case 6:
                case 5:
                    nilaiHuruf = 'A';
                    break;
                case 4:
                    nilaiHuruf = 'B';
                    break;
                case 3:
                    nilaiHuruf = 'C';
                    break;
                case 2:
                    nilaiHuruf = 'D';
                    break;
                default:
                    nilaiHuruf = 'E';
                    break;
            }
        } else {
            nilaiHuruf = 'T';
        }

        System.out.println("Nilai huruf: " + nilaiHuruf);
    }
}