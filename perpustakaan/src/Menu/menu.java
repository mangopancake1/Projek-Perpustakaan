/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Peminjaman.Peminjaman;
import Pengembalian.Kembali;
import Tambah.Tambahdata;
import Login.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import koneksi.connector;
import Login.Login;
import Login.controllerLogin;
import Login.menuModel;
/**
 *
 * @author ASUS
 */
public class menu extends JFrame{
    
    private JButton pinjam, kembali, tambah, logout;
    private JLabel welcome;
    private JPanel spacer;
    public String username;
    Connection connection;
    Statement statement;
    
    
    public menu(String username) {
        
        this.username = username;
        connection = connector.connection();
       
        
        
       JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 200, 50, 200));
    
    
        welcome = new JLabel("PERPUSTAKAAN NASIONAL");
        welcome.setFont(new Font("Arial", Font.PLAIN, 20));
        welcome.setBorder(BorderFactory.createEmptyBorder(0, 0, 70, 0));
        panel.add(welcome);
        

        
        pinjam = new JButton("Peminjaman");
        pinjam.setPreferredSize(new Dimension(200, 50));
        pinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openPinjam();
            }
        });
        panel.add(pinjam);

        kembali = new JButton("Pengembalian");
        kembali.setPreferredSize(new Dimension(200, 50));
        kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openKembali();
            }
        });
        panel.add(kembali);

        tambah = new JButton("Tambah Buku Baru");
        tambah.setPreferredSize(new Dimension(200, 50));
        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openTambah();
            }
        });
        panel.add(tambah);
        
        logout = new JButton("Logout");
        logout.setPreferredSize(new Dimension(200, 50));
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openLogout();
            }
        });
        panel.add(logout);
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
    }private void openLogout() {
        menuModel model = new menuModel();
        Login view = new Login();
        controllerLogin controller = new controllerLogin(model,view);
    }
}
