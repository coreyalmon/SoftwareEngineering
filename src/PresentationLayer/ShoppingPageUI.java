package PresentationLayer;


import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ShoppingPageUI {

	private static ShoppingPageUI shoppingPageUI;
	
	private JFXPanel fxPanel;

	private ShoppingPageUI() {
		fxPanel = new JFXPanel();
		this.addComponentsToPanel();	
	}

	public static ShoppingPageUI getInstance() {
		if(shoppingPageUI == null)
			shoppingPageUI = new ShoppingPageUI();
		return shoppingPageUI;
	}

	public JFXPanel getFXPanel() {
		return fxPanel;
	}
	
	
	   @FXML
       private void printHelloWorld(ActionEvent event) {
           event.consume();
           System.out.println("Hello, World!");
       }

	public void addComponentsToPanel() {		

		Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("ShoppingPageFX.fxml"));
                      
            
            Scene scene = new Scene(root);
            fxPanel.setScene(scene);
        } catch (Exception e) {
            System.err.println("error : " + e.getMessage() + "cause : " + e.getCause() + "\n" + e.getStackTrace());
        }
	}
}

