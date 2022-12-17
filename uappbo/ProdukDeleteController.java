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
import javafx.stage.Stage;

public class ProdukDeleteController{
    
   @FXML 
   private Button btnMakanan;
   
   @FXML
   private Button btnProduk;
   
   @FXML
   private Button btnKembali;
    
    @FXML
   public void barangDlt (ActionEvent event) throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("BarangDelete.fxml"));
       Parent root = (Parent) loader.load();
       Stage stage = (Stage) btnProduk.getScene().getWindow();
       stage.setScene(new Scene(root));
   
   }
   
   @FXML
   public void makananDlt (ActionEvent event) throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("MakananDelete.fxml"));
       Parent root = (Parent) loader.load();
       Stage stage = (Stage) btnProduk.getScene().getWindow();
       stage.setScene(new Scene(root));
   
   }
   
   @FXML
   public void kembali (ActionEvent event) throws IOException{       
       FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
       Parent root = (Parent) loader.load();
       Stage stage = (Stage) btnKembali.getScene().getWindow();
       stage.setScene(new Scene(root));
   }  
    
}
