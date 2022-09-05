package PresentationLayer;
import javax.swing.*;

public abstract class CartI {
	protected JPanel panel;
	
	public abstract void addComponentsToPanel();
	
	public JPanel getPanel() {
		return panel;
	}
}
