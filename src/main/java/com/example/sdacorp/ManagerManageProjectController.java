package com.example.sdacorp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Pair;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ManagerManageProjectController implements Initializable {

    @FXML
    private Label forclosing;

    @FXML
    private ListView<String> listview;


    ManagerModel managerModel = new ManagerModel();


    @FXML
    void OnClickCreateProjectBtn(ActionEvent event) {

    }

    @FXML
    void OnClickHomeBtn(ActionEvent event) {

    }

    @FXML
    void OnClickUpdateInfoBtn(ActionEvent event) {

    }

    @FXML
    void OncClickCloseProjectBtn(ActionEvent event) {

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            ProjectMain.ProjectCRUD projectCRUD = new ProjectMain.ProjectCRUD();
            List<Pair<Integer,String>> allprojects = projectCRUD.getAllProject();
            // assign the data to the table

            for (Pair<Integer,String> project : allprojects) {
                String s = project.getKey() + "\t\t" + project.getValue() + " \n";
                listview.getItems().add(s);
            }







            //project_table = (TableColumn<Integer, String>) projectCRUD.getAllProject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
