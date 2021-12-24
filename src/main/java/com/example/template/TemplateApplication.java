package com.example.template;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TemplateApplication extends Application {
    static ConfigurableApplicationContext context;
    private Parent root;
    private Stage mainStage;

    public static void main(String[] args) {

        context=SpringApplication.run(TemplateApplication.class, args);
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        mainStage=primaryStage;
        root= FXMLLoader.load(TemplateApplication.class.getResource("/view.fxml"));
        Scene scene=new Scene(root);
        mainStage.setScene(scene);
        mainStage.show();
    }


}
