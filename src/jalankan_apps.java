import javax.swing.*;

public class jalankan_apps {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new aplikasi_total_pembelianbuku().getMainapps());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
