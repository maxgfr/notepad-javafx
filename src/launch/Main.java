/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launch;

import controller.NotePadController;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
/**
 *
 * @author magolfier2
 */
public class Main extends Application {
    
    private static Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("/view/NotePad.fxml"));
            Scene scene = new Scene(root);
            primaryStage.getIcons().add(new Image("/assets/NotePad.png"));
            primaryStage.setScene(scene);
            primaryStage.show();
	} catch(IOException e) {
            e.printStackTrace();
	}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public static Stage getPrimaryStage() {
        return primaryStage;
    }
    
}
