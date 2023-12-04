package com.example.sdacorp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeModel {


    public void employee_home_page(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Emp.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setResizable(false);
        stage.setTitle("Employee Page");
        stage.setScene(scene);
        stage.show();
    }
    public void employee_create_form(Stage stage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CreateForm.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setResizable(false);
        stage.setTitle("Create Form");
        stage.setScene(scene);
        stage.show();

    }

//    public void employee_view_projects(Stage stage) throws IOException {
//
//
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CreateForm.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//
//        stage.setResizable(false);
//        stage.setTitle("Update Information");
//        stage.setScene(scene);
//        stage.show();
//
//    }

}

