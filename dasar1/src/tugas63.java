public class tugas63 {

    public static void main(String[] var0) {
        int var1 = 1;

        while(var1 <= 3) {
            System.out.print("Al's all wet. ");
            System.out.println("Oh, why is Al all wet? Oh,");
            System.out.print("Al's all wet 'cause ");
            System.out.println("he's standing in the rain.");
            System.out.println("Why is Al out in the rain?");
            switch (var1) {
                case 1:
                    System.out.println("That's because he has no brain.");
                    break;
                case 2:
                    System.out.println("That's because he is a pain.");
                    break;
                case 3:
                    System.out.println("'Cause this is the last refrain.");
            }

            switch (var1) {
                case 3:
                    System.out.println("Last refrain, last refrain,");
                case 2:
                    System.out.println("He's a pain, he's a pain,");
                case 1:
                    System.out.println("Has no brain, has no brain,");
                default:
                    System.out.println("In the rain, in the rain.");
                    System.out.println("Ohhhhhhhh...");
                    System.out.println();
                    ++var1;
            }
        }

        System.out.print("Al's all wet. ");
        System.out.println("Oh, why is Al all wet? Oh,");
        System.out.print("Al's all wet 'cause ");
        System.out.println("he's standing in the rain.");
    }
}
