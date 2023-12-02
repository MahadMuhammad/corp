package com.example.sdacorp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class ManagerController {

    ManagerModel managerModel = new ManagerModel();

    @FXML
    private Label man_add;

    @FXML
    private Label man_email;

    @FXML
    private Label man_name;

    @FXML
    private Label man_phone;
    @FXML

    private Button forclosing;


    private int manager_id;

    public void setmanager_id(int id) {
        manager_id = id;
    }

    ManagerMain.ManagerCRUD managerCRUD = new ManagerMain.ManagerCRUD();
    ManagerMain.Manager manager;

    public void Managerpage(Stage stage) throws IOException {
        try {
            manager = managerCRUD.getManager(manager_id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Manager.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        ManagerController managerController = fxmlLoader.getController();

        String name = manager.getName();
        String address = manager.getAddress();
        String ph = manager.getContact();
        String email = manager.getEmail();

        managerController.man_name.setText(name);
        managerController.man_add.setText(address);
        managerController.man_phone.setText(ph);
        managerController.man_email.setText(email);

        // Set up the stage
        stage.setResizable(false);
        stage.setTitle("Manager Page");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void OnClickCreateProjectBtn(ActionEvent event)throws IOException {

        managerModel.manager_create_project_page(new Stage());

       close_stage();

    }

    @FXML
    void OnClickUpdateInfoBtn(ActionEvent event)throws IOException {

        managerModel.manager_Update_Info_page(new Stage());
        close_stage();

    }

    @FXML
    void OnClickVeiwEmployees(ActionEvent event) throws IOException {

        managerModel.manager_View_Employee_page(new Stage());
        close_stage();

    }

    @FXML
    void OncClickCloseProjectBtn(ActionEvent event) throws IOException {

        managerModel.manager_Close_project_stage(new Stage());
        close_stage();

    }

    public void close_stage()
    {
        Stage closestage = (Stage) forclosing.getScene().getWindow();
        closestage.close();
    }

}
