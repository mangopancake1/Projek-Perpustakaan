/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import DAOdataPerpus.DAOdataBuku;
import DAOImplements.DAOBuku;
import perpustakaan.*;
import main.*;
/**
 *
 * @author ASUS
 */
public class dataController {
    menu frame;
    DAOBuku impldataBuku;
    List<dataBuku>dp;
    public dataController(menu frame){
        this.frame = frame;
        impldataBuku = new DAOdataBuku();
        dp = impldataBuku.getALL();
    }
    
}
