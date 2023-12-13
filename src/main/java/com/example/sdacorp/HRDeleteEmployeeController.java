package com.example.sdacorp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import static com.example.sdacorp.EmployeeMain.EmployeeCRUD;

public class HRDeleteEmployeeController implements Initializable {

    @FXML
    private Label forclosing;

    @FXML
    private TextField emp_ID;

    @FXML
    private Label label;

    EmployeeMain.EmployeeCRUD employeeCRUD = new EmployeeMain.EmployeeCRUD();
    EmployeeMain.Employee employee;


    HRModel hrModel=new HRModel();


    AccessID accessID=new AccessID();

    int HR_id = accessID.getHRId();



    @FXML
    private ListView<String> listview;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            EmployeeMain.EmployeeCRUD EmployeeCRUD = new EmployeeMain.EmployeeCRUD();
            List<Pair<Integer,String>> allemployee = EmployeeCRUD.getAllEmployees();
            // assign the data to the table

            for (Pair<Integer,String> employee : allemployee) {
                String s = "\t\t" + employee.getKey()  + "\t\t\t\t\t\t\t\t\t\t" + employee.getValue() + " \n";
                listview.getItems().add(s);
            }

            //project_table = (TableColumn<Integer, String>) projectCRUD.getAllProject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void OnClickCreateAccount(ActionEvent event) throws IOException{

        hrModel.hr_CreateAccountPage(new Stage());
        close_stage();

    }


    @FXML
    void onclickrgistrationbtn(ActionEvent event) throws IOException {

        hrModel.hr_registrationpage(new Stage());
        close_stage();


    }

    @FXML
    void onclickupdateinfobtn(ActionEvent event) throws IOException {

        hrModel.hr_updateinfopage(new Stage());
        close_stage();


    }

    @FXML
    void OnClickHomeBtn(ActionEvent event)throws IOException {

        hrModel.hr_Homepage(new Stage());
        close_stage();

    }

    @FXML
    void OnClickNotification (ActionEvent event) throws IOException{

        hrModel.hr_Notification(new Stage());
        close_stage();

    }



    @FXML
    void OnClcikDeleteEmployee(ActionEvent event)throws IOException {
        hrModel.hr_delete_employee(new Stage());
        close_stage();

    }

    @FXML
    void OnClickDeleteBtn(ActionEvent event) throws SQLException {

        if(emp_ID.getText().isBlank())
        {
            label.setText("Enter Employee ID First");
        }

        else
        {
            String employee_id_str = emp_ID.getText();
            int employee_id = Integer.parseInt(employee_id_str);

            employeeCRUD.deleteEmployee(employee_id);

            label.setText("Employee Deleted successfully");
        }

    }

    public void close_stage()
    {
        Stage closestage = (Stage) forclosing.getScene().getWindow();
        closestage.close();
    }

}
