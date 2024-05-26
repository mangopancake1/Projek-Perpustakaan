/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tambah;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ASUS
 */
public class Tambahdata extends JFrame{
    public Tambahdata() {
        setTitle("Peminjaman");
        setSize(560, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Add components for the Peminjaman GUI
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        
        JLabel label = new JLabel("Tambah Data Buku");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label);
        
        // Add more components as needed
        
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
}
