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
    
    private JButton pinjam, kembali, tambah;
    public menu() {
       JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
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
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Perpustakaan");      
    }
    private void openPinjam() {
        JFrame Peminjaman = new Peminjaman();
        Peminjaman.setVisible(true);
        this.dispose();
    }
    private void openKembali() {
        JFrame Kembali = new Kembali();
        Kembali.setVisible(true);
        this.dispose(); 
    }
    private void openTambah() {
        JFrame Tambahdata = new Tambahdata();
        Tambahdata.setVisible(true);
        this.dispose();
    }
}
