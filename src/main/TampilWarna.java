package main;

import javax.swing.JFrame;

public class TampilWarna {
    // eksekusi aplikasi
    public static void main(String[] args) {
        // mencipatkan frame untuk WarnaJPanel
        JFrame frame = new JFrame("Menggunakan Warna");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        WarnaJPanel warnaJPanel = new WarnaJPanel();
        frame.add(warnaJPanel);
        frame.setSize(400, 180);
        frame.setVisible(true);
    }
}
