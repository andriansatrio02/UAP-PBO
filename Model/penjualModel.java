package Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import uappbo.*;

public class penjualModel {
    private final Connection CONN;
    
    public penjualModel(){
        this.CONN = DB.DBHelper.getConnection();
    }
    public void addPenjualan(Penjualan peju){
        String insert = "INSERT INTO penjualan VALUES ('"+peju.getNama_produk()+"','"
                + peju.getJumlahProduk() + "', '" + peju.getStok()+"','"+peju.getHarga()+"');"; 
        try {
           if( CONN.createStatement().executeUpdate(insert)>0){
            System.out.println("Data Berhasil Dimasukkan");
           }else{
               System.out.println("Data yang dimasukkan sudah ada");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(penjualModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Gagal Dimasukkan");
        }
    }
    
     public void updateProduk(Penjualan peju){//untuk memperbarui data pada query
        String update = "UPDATE penjualan SET jumlahProduk = '"+ peju.getJumlahProduk() +"', stok = '"+ peju.getStok()+"' WHERE stok = '"+peju.getStok()+"';";

        try {
           if( CONN.createStatement().executeUpdate(update)>0){
            System.out.println("Data Berhasil Diperbarui");
           }else{
               System.out.println("Data yang dimasukkan tidak berubah");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(penjualModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Gagal Dimasukkan");
        }
     }
     
     public void deleteProduk(Penjualan peju){//menghapus data didalam query
        String delete = "DELETE FROM penjualan WHERE nama_produk = '"+ peju.getNama_produk()+"';";
        
         try {
           if( CONN.createStatement().executeUpdate(delete)>0){
            System.out.println("Data Berhasil Dihapus");
//                  System.out.println(insert);
           }else{
               System.out.println("Data Gagal dihapus");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(penjualModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Gagal dihapus");
        }  
    }
}
