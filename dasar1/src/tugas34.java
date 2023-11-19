import java.awt.Component;
import javax.swing.JOptionPane;

public class tugas34 {
    public tugas34() {
    }

    public static void main(String[] var0) {
        int var1 = JOptionPane.showConfirmDialog((Component)null, "apakah anda memiliki anak lebih dari dua ?", "Konfirmasi", 0);
        if (var1 > 2) {
            JOptionPane.showMessageDialog((Component)null, "bukan keluarga berencana");
        } else {
            JOptionPane.showMessageDialog((Component)null, " keluarga berencana");
        }

    }
}
