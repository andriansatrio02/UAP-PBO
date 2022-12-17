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
import Model.makananModel;


/**
 * FXML Controller class
 *
 * @author baash
 */
public class MakananDeleteController{
   makananModel mkn = new makananModel();
    
   @FXML
   private TextField FLidD;

   @FXML
   private Button btnHapus;
   
   @FXML
   private Button btnKembali;
   
   @FXML
   public void hapus (ActionEvent event) throws IOException{
       Makanan mkn2 = new Makanan();
       mkn2.setId(Integer.parseInt(FLidD.getText()));
       mkn.deleteProduk(mkn2);
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
