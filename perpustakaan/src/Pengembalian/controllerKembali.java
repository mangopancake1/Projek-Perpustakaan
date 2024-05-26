/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pengembalian;
import java.util.List;
import perpustakaan.*;
import Peminjaman.Peminjaman;
/**
 *
 * @author ASUS
 */
public class controllerKembali {
    Kembali frame;
    DAOImKembali ImKembali;
    List<dataBuku> dp;
    public controllerKembali(Kembali frame){
        this.frame = frame;
        ImKembali = new DAOKembali();
        dp = ImKembali.getALL();
    }
    public void create(){
        dataBuku dp = new dataBuku();
        dp.setJudul(frame.getJudul());
        dp.setPenerbit(frame.getPenerbit());
        dp.setPenulis(frame.getPenulis());
        dp.setTahun(Integer.parseInt(frame.getTahun()));
        dp.setKategori(frame.getKategori());
        ImKembali.hapus(dp);
    }
    public void hapus() {
        dataBuku dp = new dataBuku();
        dp.setJudul(frame.getJudul());
        ImKembali.hapus(dp);
    }
    public void isitable(){
        dp = ImKembali.getALL();
        tabelPinjam mp = new tabelPinjam(dp);
        frame.getBukuPinjam().setModel(mp);
    }
}
