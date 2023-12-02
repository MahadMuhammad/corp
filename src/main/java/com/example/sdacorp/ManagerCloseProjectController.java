package com.example.sdacorp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagerCloseProjectController {

    @FXML
    private Button forclosing;

    ManagerModel managerModel = new ManagerModel();


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
    void OnClickVeiwEmployees(ActionEvent event)throws IOException {

        managerModel.manager_View_Employee_page(new Stage());

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
