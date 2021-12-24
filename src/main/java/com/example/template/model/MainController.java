package com.example.template.model;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;
@Controller
public class MainController implements Initializable {
    @Autowired
    @Qualifier("lblTitulo")
    private String titulo;
    @javafx.fxml.FXML
    private Label label;




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        label.setText(titulo);
    }


}
