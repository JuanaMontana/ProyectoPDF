/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Juan
 */
public class MenuInicialController implements Initializable {
    
    
    @FXML
    private AnchorPane root;
    @FXML
    private Button botonRedo;
    @FXML
    private Button botonUndo;
    
    
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleRedo(ActionEvent event) {
    }

    @FXML
    private void handleUndo(ActionEvent event) {
    }
}
    
   
