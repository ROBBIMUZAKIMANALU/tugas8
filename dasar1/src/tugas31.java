import java.util.Scanner;
public class tugas31 {
    public static void main (String hs []) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan nilai kamu :");
        double nilai = scanner.nextDouble();

        if (nilai <= 20) {
            System.out.println("E");
        } else if (nilai <= 40) {
            System.out.println("D");
        } else if (nilai <= 60) {
            System.out.println("V");
        } else if (nilai <= 80) {
            System.out.println("B");
        } else if (nilai > 80) {
            System.out.println("A");
        }if (nilai <=60){
            System.out.println("kamu gagal");
        }else{
            System.out.println("kamu lulus");
        }

    }
    }