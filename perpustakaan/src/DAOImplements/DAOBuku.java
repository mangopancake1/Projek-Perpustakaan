/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOImplements;
import java.util.List;
import perpustakaan.*;
/**
 *
 * @author ASUS
 */
public interface DAOBuku {
    public void create(dataBuku p);
    public void update(dataBuku p);
    public void delete(dataBuku p);
    List<dataBuku> getALL();
}
