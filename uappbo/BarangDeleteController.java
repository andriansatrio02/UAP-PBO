/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uappbo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import Model.barangModel;

/**
 * FXML Controller class
 *
 * @author baash
 */
public class BarangDeleteController {
   barangModel brg = new barangModel();
    
   @FXML
   private TextField FLbarD;

   @FXML
   private Button btnHapus;
   
   @FXML
   private Button btnKembali;
   
   @FXML
   public void hapus (ActionEvent event) throws IOException{
       Barang brg2 = new Barang(FLbarD.getText());
       brg.deleteProduk(brg2);
       FXMLLoader loader = new FXMLLoader(getClass().getResource("produkDelete.fxml"));
       Parent root = (Parent) loader.load();
       Stage stage = (Stage) btnHapus.getScene().getWindow();
       stage.setScene(new Scene(root));
   }
   
   @FXML
   public void kembali (ActionEvent event) throws IOException{
       FXMLLoader loader = new FXMLLoader(getClass().getResource("produkDelete.fxml"));
       Parent root = (Parent) loader.load();
       Stage stage = (Stage) btnKembali.getScene().getWindow();
       stage.setScene(new Scene(root));
   } 
    
}
