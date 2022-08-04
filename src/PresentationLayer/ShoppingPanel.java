package PresentationLayer;
import java.awt.Button;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

// Meant to be the panel used for the shopping page
public class ShoppingPanel extends AbstractPanel {


	public ShoppingPanel() {
		this.addComponentsToPanel();	
	}





	@Override
	public void addComponentsToPanel() {
		panel = new JPanel();
		
		
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		JButton button;
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;


		button = new JButton("Button 1");
		c.weightx = 0.5;

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		panel.add(button, c);		
	}
}

