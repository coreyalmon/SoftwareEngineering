package PresentationLayer;

import javax.swing.JFrame;

public class MainFrame
{
    private JFrame window;
    private ShoppingPanel shoppingPanel;

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
        
        ImagePanel imagePanel = new ImagePanel();
        window.add(imagePanel.getPanel());  
        window.setVisible(true);
    }
 }