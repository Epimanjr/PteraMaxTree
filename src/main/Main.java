/*
 * The main class of the project.
 */
package main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Maxime BLAISE
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(new MainGroup(), Config.width, Config.height));
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    /**
     * @author Maxime BLAISE
     */
    class MainGroup extends Group {
        
        // Begin declaration components
        Label labelTitre;
        // End declaration components
        
        /**
         * Only one constructor.
         */
        MainGroup() {
            // Label title
            Font fontLabelTitre = new Font("Calibri", 26);
            labelTitre = new Label("PteraMaxTree");
            labelTitre.setTextFill(Color.web("#2020FF"));
            labelTitre.setFont(fontLabelTitre);
            this.getChildren().add(labelTitre);
        }
    }
}
