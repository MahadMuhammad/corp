package com.example.sdacorp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Pair;

import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.ResourceBundle;

public class ManagerIncrementsController  {

    @FXML
    private TextField emp_ID;

    @FXML
    private TextField emp_curr_salary;

    @FXML
    private TextField ename;

    @FXML
    private Label forclosing;

    @FXML
    private TextField increment_amount;

    @FXML
    private ListView<?> listview;

    @FXML
    private Label plabel;

    ProjectMain.ProjectCRUD projectCRUD = new ProjectMain.ProjectCRUD();
    ProjectMain.Project project;


    ManagerModel managerModel = new ManagerModel();


    @FXML
    void OnClickCreateProjectBtn(ActionEvent event) {

    }

    @FXML
    void OnClickHomeBtn(ActionEvent event) {

    }

    @FXML
    void OnClickIncremntBtn(ActionEvent event) {

    }

    @FXML
    void OnClickUpdateInfoBtn(ActionEvent event) {

    }

    @FXML
    void OncClickCloseProjectBtn(ActionEvent event) {

    }

    @FXML
    void handleKeyPressed(KeyEvent event) {


    }




}
