/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import DAOdataPerpus.DAOdataBuku;
import DAOImplements.DAOBuku;
import perpustakaan.*;
import Peminjaman.Peminjaman;
/**
 *
 * @author ASUS
 */
public class dataController {
    Peminjaman frame;
    DAOBuku impldataBuku;
    List<dataBuku>dp;
    public dataController(Peminjaman frame){
        this.frame = frame;
        impldataBuku = new DAOdataBuku();
        dp = impldataBuku.getALL();
    }
    public void isitable(){
        dp = impldataBuku.getALL();
        tabelBuku mp = new tabelBuku(dp);
        frame.getBukuTable().setModel(mp);
    }
    public void delete() {
        dataBuku dp = new dataBuku();
        dp.setJudul(frame.getJudul());
        impldataBuku.delete(dp);
    }
}
