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

public class EmployeeController {

    EmployeeModel employeemodel = new EmployeeModel();

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
    private Button forclosing;

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

    @FXML
    void OnClickUpdateInfoBtn(ActionEvent event) throws IOException {
        employeemodel.employee_Update_Info_page(new Stage());
        close_stage();
    }

    public void close_stage()
    {
        Stage closestage = (Stage) forclosing.getScene().getWindow();
        closestage.close();
    }
}