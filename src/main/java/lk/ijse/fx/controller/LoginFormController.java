package lk.ijse.fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private AnchorPane rootNode;

    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode= FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));
        Scene scene=new Scene(rootNode);
        Stage stage = (Stage)this.rootNode.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Customer");
        stage.show();
    }
}
