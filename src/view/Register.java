package view;

import controller.Register_Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Register extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("register.fxml"));
        Parent root = loader.load();
        stage.setTitle("Users Register System");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setOnCloseRequest(e ->

        {
            e.consume();
            Register_Controller system = new Register_Controller();
            system.close_Request();

        });

        stage.show();

    }

    public static void run(String[] args) {
        launch(args);

    }

}