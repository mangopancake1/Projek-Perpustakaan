/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tambah;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.menu;
/**
 *
 * @author ASUS
 */
public class Tambahdata extends JFrame{
    controllerTambah dc;
    public Tambahdata(){
        initComponents();
        dc = new controllerTambah(this);
        dc.isitable();
    }
    
    private JTextField judul, penerbit, penulis, tahun, kategori;
    private JButton create, update, delete, kembali;
    private void initComponents() {
        JPanel leftPanel = new JPanel(new BorderLayout());
        tabelDataBuku = new JTable();

        tabelDataBuku.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
                }
        ));
        tabelDataBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActionEvent dummyEvent = new ActionEvent(tabelDataBuku, ActionEvent.ACTION_PERFORMED, "");
                tabelDataBukuMouseClicked(dummyEvent);
            }
        });
        JScrollPane scrollPane = new JScrollPane(tabelDataBuku);
        leftPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        JPanel Panel = new JPanel(new GridLayout(0, 1, 5, 5));
        Panel.add(new JLabel("Judul"));
        judul = new JTextField(20);
        Panel.add(judul);
        
        Panel.add(new JLabel("Penerbit"));
        penerbit = new JTextField(20);
        Panel.add(penerbit);

        Panel.add(new JLabel("Penulis"));
        penulis = new JTextField(20);
        Panel.add(penulis);
        
        Panel.add(new JLabel("Tahun Terbit"));
        tahun = new JTextField(20);
        Panel.add(tahun);
        
        Panel.add(new JLabel("Kategori"));
        kategori = new JTextField(20);
        Panel.add(kategori);
        rightPanel.add(Panel);
        
        JPanel jPanel = new JPanel(new GridLayout(5, 1, 5, 5));
        create = new JButton("Simpan");
        jPanel.add(create);
        update = new JButton("Update");
        jPanel.add(update);
        delete = new JButton("Delete");
        jPanel.add(delete);
        kembali = new JButton("Kembali");
        jPanel.add(kembali);
        rightPanel.add(jPanel);
        
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                create();
            }
        });
        
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update();
            }
        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete();
            }
        });
        
        kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kembali();
            }
        });
        
        setLayout(new BorderLayout());
        add(leftPanel, BorderLayout.CENTER);
        add(rightPanel, BorderLayout.EAST);
        
        setTitle("Peminjaman");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private void create() {
        dc.create();
        dc.isitable();
    }
    private void update() {
        dc.update();
        dc.isitable();
    }
    private void delete() {
        dc.delete();
        dc.isitable();
    }
    private void kembali() {
        JFrame menu = new menu();
        menu.setVisible(true);
        this.dispose();
    }
    
    private void tabelDataBukuMouseClicked(java.awt.event.ActionEvent evt){
        int baris = tabelDataBuku.getSelectedRow();
        judul.setText(tabelDataBuku.getValueAt(baris,0).toString());
        penerbit.setText(tabelDataBuku.getValueAt(baris,1).toString());
        penulis.setText(tabelDataBuku.getValueAt(baris,2).toString());
        tahun.setText(tabelDataBuku.getValueAt(baris,3).toString());
        kategori.setText(tabelDataBuku.getValueAt(baris,4).toString());
    }
    
    
    
    
    private javax.swing.JTable tabelDataBuku;
    public JTable getBukuTable() {
        return tabelDataBuku;
    }
    public String getJudul() {
        return judul.getText();
    }
    public String getPenerbit() {
        return penerbit.getText();
    }
    public String getPenulis() {
        return penulis.getText();
    }
    public String getTahun() {
        return tahun.getText();
    }
    public String getKategori(){
        return kategori.getText();
    }
}
