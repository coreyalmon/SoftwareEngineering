package PresentationLayer;
import javax.swing.JPanel;

public abstract class AbstractPanel {
	protected JPanel panel;
	
    public abstract void addComponentsToPanel();
    
    public JPanel getPanel() {
    	return panel;
    }
}
