package com.example.sdacorp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.DatePicker;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.Instant;
import java.sql.Date;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Pair;

import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import javafx.scene.control.TextField;


public class ManagerManageProjectController implements Initializable {

    @FXML
    private TextField P_ID;

    @FXML
    private Label forclosing;

    @FXML
    private ListView<String> listview;

    @FXML
    private DatePicker pdeadline;

    @FXML
    private TextField pdesc;

    @FXML
    private Label plabel;

    @FXML
    private TextField pname;





    ProjectMain.ProjectCRUD projectCRUD = new ProjectMain.ProjectCRUD();
    ProjectMain.Project project;


    ManagerModel managerModel = new ManagerModel();


    @FXML
    void OnClickManageBtn(ActionEvent event) {

        project = new ProjectMain.Project(
                pname.getText(),
                pdesc.getText(),
                project.getStatus(),
                pdeadline.getValue(),
               project.getStartDate(),
                pdeadline.getValue()
        );
        try {
            projectCRUD.updateProject(project);
            plabel.setText("UPDATED");
        } catch (SQLException e) {
            plabel.setText("NOT UPDATED");
            e.printStackTrace();
        }



    }



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
    @FXML

    void handleKeyPressed(KeyEvent event) {

            if (P_ID.getText().isBlank()) {
                plabel.setText("Enter the PROJECT ID FIRST");
            } else if (event.getCode().equals(KeyCode.ENTER)) {

                try {
                    String project_id_str = P_ID.getText();
                    int project_id = Integer.parseInt(project_id_str);

                    try {
                        project = projectCRUD.getProject(project_id);
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }

                    String name = project.getName();
                    String description = project.getDescription();
                    Date deadline = project.getDeadline();

                    // Convert java.sql.Date to LocalDate
                    Instant instant = deadline.toLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant();
                    LocalDate localDeadline = instant.atZone(ZoneId.systemDefault()).toLocalDate();

                    pname.setText(name);
                    pdesc.setText(description);
                    pdeadline.setValue(localDeadline);

                } catch (NumberFormatException e) {
                    plabel.setText("Invalid input for project ID.");
                }

            }
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
