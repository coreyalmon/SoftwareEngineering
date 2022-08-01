package PresentationLayer;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import DataAccessLayer.FoodDetails;
import DataAccessLayer.FoodType;

public class ImagePanel extends AbstractPanel {

	private Image image;
	public ImagePanel() {
		
		panel = new JPanel();
		FoodDetails foodDetails = new FoodDetails(FoodType.FOOD_TYPE_CAKE);
		image = foodDetails.getImage();


		JLabel imageIcon = new JLabel(new ImageIcon(image));
		panel.add(imageIcon);
	}

	@Override
	public void addComponentsToPanel() {

	}
}
