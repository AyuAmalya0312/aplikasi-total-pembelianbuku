import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aplikasi_total_pembelianbuku {
    private JTextField harga_barang;
    private JTextField pembeli;
    private JButton button1;
    private JPanel mainapps;
    private JLabel total_bayar;

    public aplikasi_total_pembelianbuku() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int get_harga_barang = Integer.parseInt(harga_barang.getText());
                int get_pembeli = Integer.parseInt(pembeli.getText());

                int get_total_bayar = get_harga_barang*get_pembeli;
                total_bayar.setText(Integer.toString(get_total_bayar));
            }
        });
    }

    public JPanel getMainapps() {
        return mainapps;
    }
}
