package com.example.sdacorp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;


import java.io.IOException;

public class ManagerCloseProjectController {

    @FXML
    private Label forclosing;

    ManagerModel managerModel = new ManagerModel();


    @FXML
    void OnClickHomeBtn(ActionEvent event) throws IOException {

        managerModel.manager_home_page(new Stage());
        close_stage();

    }


    @FXML
    void OnClickCreateProjectBtn(ActionEvent event)throws IOException {

        managerModel.manager_create_project_page(new Stage());

        close_stage();


    }

    @FXML
    void OnClickUpdateInfoBtn(ActionEvent event) throws IOException{
        managerModel.manager_Update_Info_page(new Stage());

        close_stage();

    }


    @FXML
    void OncClickCloseProjectBtn(ActionEvent event) throws IOException{

        managerModel.manager_Close_project_stage(new Stage());
        close_stage();

    }

    public void close_stage()
    {
        Stage closestage = (Stage) forclosing.getScene().getWindow();
        closestage.close();
    }



}
