/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pengembalian;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ASUS
 */
public class Kembali extends JFrame{
    controllerKembali dk;
    public Kembali(){
        initComponents();
        dk = new controllerKembali(this);
        dk.isitable();
    }
    
    private JTextField nama, nomor,judul, penerbit, penulis, tahun, kategori;
    private JButton simpan;
    private JButton pinjam, kembali, tambah;
    private void initComponents() {
        JPanel leftPanel = new JPanel(new BorderLayout());
        tabelDataBuku = new JTable();

        tabelDataBuku.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
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
        
        simpan = new JButton("Simpan");
        Panel.add(simpan);
        rightPanel.add(Panel);
        
        simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete();
                create();
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
        dk.create();
        dk.isitable();
    }
    private void delete() {
        dk.hapus();
        dk.isitable();
    }
    
    private void tabelDataBukuMouseClicked(java.awt.event.ActionEvent evt){
        int baris = tabelDataBuku.getSelectedRow();
        nama.setText(tabelDataBuku.getValueAt(baris,0).toString());
        nomor.setText(tabelDataBuku.getValueAt(baris,1).toString());
        judul.setText(tabelDataBuku.getValueAt(baris,2).toString());
        penerbit.setText(tabelDataBuku.getValueAt(baris,3).toString());
        penulis.setText(tabelDataBuku.getValueAt(baris,4).toString());
        tahun.setText(tabelDataBuku.getValueAt(baris,5).toString());
        kategori.setText(tabelDataBuku.getValueAt(baris,6).toString());
    }
    
    
    
    
    private javax.swing.JTable tabelDataBuku;
    public JTable getBukuPinjam() {
        return tabelDataBuku;
    }
    public String getNama() {
        return nama.getText();
    }
    public String getNomor() {
        return nomor.getText();
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
