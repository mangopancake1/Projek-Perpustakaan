/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peminjaman;
import java.util.List;
import perpustakaan.*;
/**
 *
 * @author ASUS
 */
public class controllerPinjam {
    Peminjaman frame;
    DAOImPinjam ImPinjam;
    List<dataBuku> dp;
    public controllerPinjam(Peminjaman frame){
        this.frame = frame;
        ImPinjam = new DAOPinjam();
        dp = ImPinjam.getALL();
    }
    public void save(){
        dataBuku dp = new dataBuku();
        dp.setNama(frame.getNama());
        dp.setNomor(Integer.parseInt(frame.getNomor()));
        dp.setJudul(frame.getJudul());
        dp.setPenerbit(frame.getPenerbit());
        dp.setPenulis(frame.getPenulis());
        dp.setTahun(Integer.parseInt(frame.getTahun()));
        dp.setKategori(frame.getKategori());
        ImPinjam.save(dp);
    }
}
