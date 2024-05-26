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
    final String delete = "DELETE FROM data_buku WHERE id=?";
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
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setString(1, p.getJudul());
            statement.executeUpdate();
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
            Logger.getLogger(DAOdataBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dp;
    }
    
}
