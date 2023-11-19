import java.io.File;
import java.util.Scanner;

public class tugas65 {

    public static void main(String[] var0) {
        File var1 = new File("cookedBooks.txt");
        if (var1.exists()) {
            Scanner var2 = new Scanner(System.in);

            char var3;
            do {
                System.out.print("Delete evidence? (y/n) ");
                var3 = var2.findWithinHorizon(".", 0).charAt(0);
            } while(var3 != 'y' && var3 != 'n');

            if (var3 == 'y') {
                System.out.println("Okay, here goes...");
                var1.delete();
                System.out.println("The evidence has been deleted.");
            } else {
                System.out.println("Sorry, buddy. Just asking.");
            }

            var2.close();
        }

    }
}
