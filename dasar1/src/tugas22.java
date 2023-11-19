import java.util.Scanner;

public class tugas22 {


    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("username: ");
        String var2 = var1.next();
        if (var2.equals("bburd")) {
            System.out.print("password: ");
            String var3 = var1.next();
            if (var3.equals("kelas")) {
                System.out.println("silahkan masuk");
            } else {
                System.out.println("salah password!!");
            }
        } else {
            System.out.println("bukan user");
        }

        var1.close();
    }
}
