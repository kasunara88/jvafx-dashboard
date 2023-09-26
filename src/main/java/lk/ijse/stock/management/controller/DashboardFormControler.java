package lk.ijse.stock.management.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormControler {
    public void bttnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));
        Scene scene = new Scene(rootNode);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Customer Manage");
        stage.centerOnScreen();
        stage.show();

    }
}
