package PresentationLayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MainFrame implements ActionListener
{
    private JFrame window;
    private ShoppingPageUI shoppingPanel;

    public MainFrame()
    {
    	this.initialize();
    }
    
    private void initialize() {
        this.window = new JFrame();
        this.window.setTitle("Shopping Project");
        this.window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.window.setSize(800, 500);
        this.window.setLocationRelativeTo(null);
        
        LoginUI loginUI = new LoginUI();
//        window.add(loginUI.getPanel());  
//        window.setVisible(true);
        
        
        ShoppingPageUI shoppingPageUI = ShoppingPageUI.getInstance();
        
		
            
            window.add(shoppingPageUI.getFXPanel());  
            window.setVisible(true);
            
            
        
      //  CardPanel cardPanel = new CardPanel();
     
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
 }
