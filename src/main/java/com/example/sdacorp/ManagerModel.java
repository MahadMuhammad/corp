package com.example.sdacorp;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ManagerModel  {









    public void manager_create_project_page(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ManagerCreateProject.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setResizable(false);
        stage.setTitle("Create Project");
        stage.setScene(scene);
        stage.show();

    }

    public void manager_Update_Info_page(Stage stage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ManagerUpdateInfo.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setResizable(false);
        stage.setTitle("Update Information");
        stage.setScene(scene);
        stage.show();


    }

    public void manager_View_Employee_page(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ManagerVeiwEmployee.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setResizable(false);
        stage.setTitle("View Employee");
        stage.setScene(scene);
        stage.show();

    }


    public void manager_Close_project_stage(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ManagerCloseProject.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setResizable(false);
        stage.setTitle("Close Project");
        stage.setScene(scene);
        stage.show();

    }












}