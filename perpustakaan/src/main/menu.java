/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import javax.swing.*;
import java.awt.*;
import controller.dataController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Peminjaman.Peminjaman;
import Pengembalian.Kembali;
import Tambah.Tambahdata;
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
       JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(150, 200, 50, 200));
        
        pinjam = new JButton("Peminjaman");
        pinjam.setPreferredSize(new Dimension(200, 50));
        pinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openPinjam();
            }
        });
        panel.add(pinjam);
        
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        kembali = new JButton("Pengembalian");
        kembali.setPreferredSize(new Dimension(200, 50));
        kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openKembali();
            }
        });
        panel.add(kembali);
        
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        tambah = new JButton("Tambah Buku Baru");
        tambah.setPreferredSize(new Dimension(200, 50));
        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openTambah();
            }
        });
        panel.add(tambah);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
        setSize(560, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Perpustakaan");      
    }
    private void openPinjam() {
        JFrame Peminjaman = new Peminjaman();
        Peminjaman.setVisible(true);
        this.dispose(); // Close the current window
    }
    private void openKembali() {
        JFrame Kembali = new Kembali();
        Kembali.setVisible(true);
        this.dispose(); // Close the current window
    }
    private void openTambah() {
        JFrame Tambahdata = new Tambahdata();
        Tambahdata.setVisible(true);
        this.dispose(); // Close the current window
    }
}
