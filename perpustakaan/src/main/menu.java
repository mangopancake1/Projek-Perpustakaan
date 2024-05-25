/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import javax.swing.*;
import java.awt.*;
import controller.dataController;
/**
 *
 * @author ASUS
 */
public class menu extends JFrame{
    dataController dc;
    public menu(){
        initComponents();
        dc = new dataController(this);
    }
    private JButton pinjam, kembali, tambah;
    
    private void initComponents() {
        JPanel panel = new JPanel(new GridLayout(5, 1, 5, 5));
        pinjam = new JButton("Peminjaman");
        panel.add(pinjam);

        kembali = new JButton("Pengembali");
        panel.add(kembali);

        tambah = new JButton("Tambah Buku Baru");
        panel.add(tambah);
        
        setTitle("Perpustakaan");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
