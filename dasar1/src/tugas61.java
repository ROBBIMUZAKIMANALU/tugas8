import java.util.Random;
import java.util.Scanner;

public class tugas61 {


    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        int var2 = 0;
        int var3 = (new Random()).nextInt(10) + 1;
        System.out.println(" ********** ");
        System.out.println("welcome to geussing game  ");
        System.out.println(" ************* ");
        System.out.println();
        System.out.print("enter an int from 1 to 10: ");
        int var4 = var1.nextInt();
        ++var2;

        while(var4 != var3) {
            System.out.println();
            System.out.println("try again... ");
            System.out.print("enter an int from 1 to 10: ");
            var4 = var1.nextInt();
            ++var2;
        }

        System.out.print("kamu menang ");
        System.out.println("" + var2 + "guesses.");
        var1.close();
    }
}
