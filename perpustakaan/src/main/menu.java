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
       
        
        pinjam = new JButton("Peminjaman");
        add(pinjam);
        pinjam.setBounds(40, 100, 200, 30);
        pinjam.setFont(new Font("Arial", Font.ITALIC, 15));

        kembali = new JButton("Pengembalian");
        add(kembali);
        kembali.setBounds(40, 100, 200, 30);
        

        tambah = new JButton("Tambah Buku Baru");
        add(tambah);
        tambah.setBounds(40, 100, 200, 30);
        
        
        setVisible(true);
        setLayout(null);
        setSize(560, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Perpustakaan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
