/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.pnk.gymsmanagementsystem_1.controller;

import java.io.File;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.util.ResourceBundle;

import java.net.URL;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 *
 * @author Administrator
 */
public class LoginController implements Initializable{
    @FXML
    private Button cancelButton;
    @FXML
    private Label  loginMessageLabel;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private ImageView lockImageView;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile = new File("assets/NicePng_24-hour-fitness-logo_3418412.png");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);
        
        File lockFile = new File("assets/PngItem_1407260.png");
        Image lockImage = new Image(brandingFile.toURI().toString());
        lockImageView.setImage(lockImage);
    }
    
    public void loginButtonAction(ActionEvent event){
        loginMessageLabel.setText("You try to login");
    }
    
    public void cancelButtonAction(ActionEvent event){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
