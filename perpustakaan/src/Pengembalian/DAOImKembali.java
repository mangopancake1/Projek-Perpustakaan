/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pengembalian;
import java.util.List;
import perpustakaan.*;
/**
 *
 * @author ASUS
 */
public interface DAOImKembali {
    public void create(dataBuku p);
    public void hapus(dataBuku p);
    List<dataBuku> getALL();
}
