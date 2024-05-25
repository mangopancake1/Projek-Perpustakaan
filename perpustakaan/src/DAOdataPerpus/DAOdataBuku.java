/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOdataPerpus;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import koneksi.connector;
import perpustakaan.*;
import DAOImplements.DAOBuku;
/**
 *
 * @author ASUS
 */
public class DAOdataBuku implements DAOBuku{
    Connection connection;
    final String select = "SELECT * FROM data_buku";
    final String create = "INSERT INTO data_buku (judul, alur, penokohan, akting, nilai) VALUES (?, ?, ?, ?, ?);";
    final String update = "UPDATE data_buku SET alur=?, penokohan=?, akting=?, nilai=? WHERE judul=?";
    final String delete = "DELETE FROM data_buku WHERE judul=?";
    public DAOdataBuku(){
        connection = connector.connection();
    }

    @Override
    public void create(dataBuku p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(dataBuku p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(dataBuku p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<dataBuku>getALL() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
