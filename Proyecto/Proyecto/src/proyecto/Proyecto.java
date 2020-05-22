/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 *
 * @author Juan
 */
public class Proyecto extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MenuInicial.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        LecturaPdf lecturaPdf = new LecturaPdf();
        lecturaPdf.setRutaDeArchivo("C:\\Users\\Juan\\Desktop\\2939-160-SE20.pdf");
        
        try{
            String texto = lecturaPdf.toText();
            System.out.println(texto);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        
        launch(args);
        
        
        
    }
    
}
