package com.example.sdacorp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class EmployeeController implements Initializable {

    @FXML
    private Label emp_add;

    @FXML
    private Label emp_email;

    @FXML
    private Label emp_name;

    @FXML
    private Label emp_phone;

    private int employee_id;

    @FXML
    private Label forclosing;

    public void setemployee_id(int id) {
        employee_id = id;
    }

    EmployeeMain.EmployeeCRUD employeeCRUD = new EmployeeMain.EmployeeCRUD();
    EmployeeMain.Employee employee;

    public void Employerpage(Stage stage) throws IOException {
        // Fetch HR information here, just before displaying the scene
        try {
            employee = employeeCRUD.getEmployee(employee_id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Emp.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Access the HRController instance associated with the loaded FXML
        EmployeeController employeeController = fxmlLoader.getController();

        String name = employee.getName();
        String address = employee.getAddress();
        String ph = employee.getContact();
        String email = employee.getEmail();

        employeeController.emp_name.setText(name);
        employeeController.emp_add.setText(address);
        employeeController.emp_phone.setText(ph);
        employeeController.emp_email.setText(email);

        // Set up the stage
        stage.setResizable(false);
        stage.setTitle("Employee Page");
        stage.setScene(scene);
        stage.show();
    }


        EmployeeModel EmployeeModel = new EmployeeModel();

        //AccessID accessID=new AccessID();


    //private int employee_id= employeeCRUD.getEmployeeId();


        @Override
        public void initialize(URL location, ResourceBundle resources)   {

            try {

                employee = employeeCRUD.getEmployee(employee_id);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        }

        @FXML
        void onClickHomebtn(ActionEvent event) throws IOException {

            EmployeeModel.employee_home_page(new Stage());
            close_stage();

        }



//        @FXML
//        void OnClickViewProjectBtn(ActionEvent event)throws IOException {
//
//            EmployeeModel.employee_view_projects(new Stage());
//            close_stage();
//        }
//
//        @FXML
//        void OnClickUpdateInfoBtn(ActionEvent event)throws IOException {
//
//            EmployeeModel.employee_Update_Info_page(new Stage());
//            close_stage();
//
//        }



        @FXML
        void OncClickCreateFormBtn(ActionEvent event) throws IOException {

            EmployeeModel.employee_create_form(new Stage());
            close_stage();

        }


//        @FXML
//        void OncClickCreateNotificationBtn(ActionEvent event) throws IOException {
//
//        EmployeeModel.employee_Notification(new Stage());
//        close_stage();
//
//        }
        public void close_stage()
        {
            Stage closestage = (Stage) forclosing.getScene().getWindow();
            closestage.close();
        }

    }
