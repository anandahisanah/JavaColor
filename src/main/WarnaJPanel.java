package main;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class WarnaJPanel extends JPanel {
    public void paintComponent(Graphics g) {
        // memanggil paintComponent dari superkelas
        super.paintComponent(g);

        this.setBackground(Color.WHITE);

        // menetapkan warna penggambaran baru dengan integer

        g.setColor(new Color(255, 0, 0));
        g.fillRect(15, 25, 100, 20);
        g.drawString("RGB sekarang: " + g.getColor(), 130, 40);

        // menetapkan warna penggambaran baru dengan float
        g.setColor(new Color(0.50f, 0.75f, 0.0f));
        g.fillRect(15, 25, 100, 20);
        g.drawString("RGB sekarang: " + g.getColor(), 130, 65);

        // menetapkan warna penggambaran baru menggunakan objek static Color
        g.setColor(Color.BLUE);
        g.fillRect(15, 25, 100, 20);
        g.drawString("RGB sekarang: " + g.getColor(), 130, 90);

        // menampilkan nilai-nilai RGB individual
        Color warna = Color.MAGENTA;
        g.setColor(warna);
        g.fillRect(15, 100, 100, 20);
        g.drawString("Nilai-nilai RGB: " + warna.getRed() + ", " + warna.getGreen() + ", " + warna.getBlue(), 130, 115);
    }
}