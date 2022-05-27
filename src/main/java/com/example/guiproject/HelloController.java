package com.example.guiproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private PasswordField passwordTextField;


    @FXML
    private Button loginButton;


    @FXML
    private TextField usernameTextField;

    @FXML
    void loginButtonClicked(MouseEvent mouseEvent) {
        if(usernameTextField.getText().equals("wwf")&&passwordTextField.getText().equals("123"))
        {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("登录成功");
            alert.setContentText("Login Success");
            alert.show();
        }
    }
}