/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author ASUS
 */
public class tabelBuku extends AbstractTableModel{
    List<dataBuku>dp;
    public tabelBuku(List<dataBuku>dp){
        this.dp = dp;
    }
    @Override
    public int getRowCount() {
        return dp.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0:
                return "Judul";
            case 1:
                return "Penerbit";
            case 2:
                return "Penulis";
            case 3:
                return "Tahun";
            case 4:
                return "Kategori";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column){
            case 0:
                return dp.get(row).getJudul();
            case 1:
                return dp.get(row).getPenerbit();
            case 2:
                return dp.get(row).getPenulis();
            case 3:
                return dp.get(row).getTahun();
            case 4:
                return dp.get(row).getKategori();
            default:
                return null;
        }
    }
    
}
