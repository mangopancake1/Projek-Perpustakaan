/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tambah;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import koneksi.connector;
import perpustakaan.*;
/**
 *
 * @author ASUS
 */
public class DAOTambah implements DAOImTambah{
    Connection connection;
    final String select = "SELECT * FROM peminjaman";
    final String create = "INSERT INTO data_buku (judul, penerbit, penulis, tahun, kategori) VALUES (?, ?, ?, ?, ?);";
    final String edit = "UPDATE data_buku SET judul= ?, penerbit=?, penulis=?, tahun=?, kategori=? where judul=?";
    final String delete = "DELETE FROM peminjaman WHERE judul=?";
    public DAOTambah(){
        connection = connector.connection();
    }

    @Override
    public void create(dataBuku p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(create, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getJudul());
            statement.setString(2, p.getPenerbit());
            statement.setString(3, p.getPenulis());
            statement.setInt(4, p.getTahun());
            statement.setString(5, p.getKategori());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                p.setJudul(rs.getString(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public void edit(dataBuku p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(create, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getJudul());
            statement.setString(2, p.getPenerbit());
            statement.setString(3, p.getPenulis());
            statement.setInt(4, p.getTahun());
            statement.setString(5, p.getKategori());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                p.setJudul(rs.getString(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
        @Override
    public void delete(dataBuku p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getNama());
            statement.setInt(2, p.getNomor());
            statement.setString(3, p.getJudul());
            statement.setString(4, p.getPenerbit());
            statement.setString(5, p.getPenulis());
            statement.setInt(6, p.getTahun());
            statement.setString(7, p.getKategori());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                p.setJudul(rs.getString(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public List<dataBuku>getALL() {
        List<dataBuku> dp = null;
        try{
            dp = new ArrayList<dataBuku>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                dataBuku buku = new dataBuku();
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("Penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                buku.setTahun(rs.getInt("tahun"));
                buku.setKategori(rs.getString("kategori"));
                dp.add(buku);
            }
        }catch (SQLException ex){
            Logger.getLogger(DAOTambah.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dp;
    }
}
