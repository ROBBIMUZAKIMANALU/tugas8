import javax.swing.JOptionPane;
import java.awt.*;

public class  tugas21 { {
    }

    public static void main(String[] var0) {
        String var1 = JOptionPane.showInputDialog("username :");
        String var2 = JOptionPane.showInputDialog("password :");
        if (var1 == null || var2 == null || (!var1.equals("bburd") || !var2.equals("swordfish")) && (!var1.equals("hittre") || !var2.equals("greamstone"))) {
            JOptionPane.showMessageDialog((Component)null, "who are you?");
        } else {
            JOptionPane.showMessageDialog((Component)null, "you're in");
        }

    }
}

