package com.example.sdacorp;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;



import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ManagerUpdateInfoController implements Initializable  {

    @FXML
    private TextField address;

    @FXML
    private TextField contact;

    @FXML
    private TextField email;

    @FXML
    private Button forclosing;

    @FXML
    private TextField password;

    @FXML
    private Label updlabel;

    @FXML
    private TextField username;

    AccessID accessID=new AccessID();


    ManagerModel managerModel=new ManagerModel();




    int manager_id = accessID.getManagerId();






    ManagerMain.ManagerCRUD managerCRUD = new ManagerMain.ManagerCRUD();
    ManagerMain.Manager manager;


    String name;
    Date dob;





    @FXML
    void onclickupdatebtn(ActionEvent event) {

        String ph = manager.getContact();
        String eemail = manager.getEmail();
        String uname = manager.getUsername();
        String passw = manager.getPassword();
        String add=manager.getAddress();
        String name = manager.getName();
        Date dob = manager.getDob();



        manager = new ManagerMain.Manager(manager_id, uname, passw, name, dob, "1", add, ph, eemail, true);
        try {
            managerCRUD.updateManager(manager);
            updlabel.setText("Updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
    void OnClickVeiwEmployees(ActionEvent event)throws IOException  {
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        setdata();
    }



        public void setdata() {
            try {

                manager = managerCRUD.getManager(manager_id);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


                String ph = manager.getContact();
                String eemail = manager.getEmail();
                String uname = manager.getUsername();
                String passw = manager.getPassword();
                String add=manager.getAddress();
                String name = manager.getName();
                Date dob = manager.getDob();

                email.setText(eemail);
                address.setText(add);
                contact.setText(ph);
                username.setText(uname);
                password.setText(passw);

        }




}

