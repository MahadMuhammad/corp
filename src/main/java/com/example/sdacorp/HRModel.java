package com.example.sdacorp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HRModel {


    public void hr_registrationpage(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HRRegistration.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setResizable(false);
        stage.setTitle("Registration");
        stage.setScene(scene);
        stage.show();

    }

    public void hr_updateinfopage(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HRUpdateInfo.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setResizable(false);
        stage.setTitle("Update Information");
        stage.setScene(scene);
        stage.show();

    }





}
