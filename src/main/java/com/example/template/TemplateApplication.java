package com.example.template;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Objects;

@SpringBootApplication
public class TemplateApplication extends Application {
    static ConfigurableApplicationContext context;
    private Parent root;
    private Stage mainStage;

    public static void main(String[] args) {


        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        context=SpringApplication.run(TemplateApplication.class);
        FXMLLoader loader = new FXMLLoader(TemplateApplication.class.getResource("/view.fxml"));
        loader.setControllerFactory(context::getBean);
        mainStage=primaryStage;
        root= loader.load();
        Scene scene=new Scene(root);
        mainStage.setScene(scene);
        mainStage.show();
    }


}
