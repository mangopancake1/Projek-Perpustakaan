/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tambah;
import java.util.List;
import perpustakaan.*;
/**
 *
 * @author ASUS
 */
public interface DAOImTambah {
    public void create(dataBuku p);
    public void edit(dataBuku p);
    public void delete(dataBuku p);
    List<dataBuku> getALL();
}

//buat coba commit hapus aja ntar, harus diedit soalnyaaa