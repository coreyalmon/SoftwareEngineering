package PresentationLayer;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmptyCartUXAdapter extends CartI implements ActionListener{
	
	private JPanel containerPanel, totalPanel;
	private JLabel noItemsLabel;
	private JButton backButton;
	
	void CartI(){
		this.addComponentsToPanel();
	}

	@Override
	public void addComponentsToPanel() {
		noItemsLabel = new JLabel("There are NO items in the cart");
		noItemsLabel.setPreferredSize(new Dimension(500,125));
		backButton = new JButton("BACK");
		backButton.setPreferredSize(new Dimension(75,25));
		backButton.addActionListener(this);
		totalPanel.add(backButton);
		containerPanel.add(noItemsLabel);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== backButton) {
			
		}
		
	}
	
	

}
