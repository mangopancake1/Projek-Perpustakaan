/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Peminjaman;
import java.util.List;
import perpustakaan.*;
/**
 *
 * @author ASUS
 */
public interface DAOImPinjam {
    public void save(dataBuku p);
    List<dataBuku> getALL();
}
