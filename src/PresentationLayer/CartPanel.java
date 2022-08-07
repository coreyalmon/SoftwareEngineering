package PresentationLayer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import BusinessLogicLayer.*;
import DataAccessLayer.FoodType;

public class CartUX extends CartI implements ActionListener{
	
	private ShoppingCart shoppingCart;
	private ShoppingLogic shoppingLogic;
	private JPanel containerPanel, totalPanel;
	private JPanel[] itemPanels;
	private JLabel totalLabel;
	private JLabel[] imageLabels;
	private JLabel[] nameLabels;
	private JLabel[] quantLabels;
	private JLabel[] priceLabels;
	private JButton backButton, payButton;
	private ImageIcon[] imageIcons;
	FoodType[] foodTypes = {FoodType.FOOD_TYPE_BROCCOLI, 
			FoodType.FOOD_TYPE_CARROT,
			FoodType.FOOD_TYPE_LETTUCE,
			FoodType.FOOD_TYPE_CAKE,
			FoodType.FOOD_TYPE_BROWNIES,
			FoodType.FOOD_TYPE_MUFFIN,
			FoodType.FOOD_TYPE_EGG,
			FoodType.FOOD_TYPE_BREAD,
			FoodType.FOOD_TYPE_CEREAL};
	CardPanel cardPanel;
	ShoppingPanel shoppingPanel;

	CartUX(ShoppingCart shoppingCart){
		this.shoppingCart = shoppingCart;
		this.addComponentsToPanel();
	}
	
	@Override
	public void addComponentsToPanel() {
		
		panel = new JPanel();
		shoppingLogic = new ShoppingLogic(shoppingCart);
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel.setPreferredSize(new Dimension(500, 800));
		
		containerPanel = new JPanel();
		containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.Y_AXIS));
		containerPanel.setPreferredSize(new Dimension(500,675));
		
		totalPanel = new JPanel();
		totalPanel.setLayout(new FlowLayout());
		totalPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		totalPanel.setPreferredSize(new Dimension(500,125));
		totalPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		totalLabel = new JLabel();
		totalLabel.setPreferredSize(new Dimension(300,125));
		totalLabel.setText("Total: $" + String.valueOf(shoppingLogic.getTotalCostOfItems()));
		
		payButton = new JButton("Pay");
		payButton.setPreferredSize(new Dimension(75,25));
		payButton.addActionListener(this);
		
		itemPanels = new JPanel[9];
		imageLabels = new JLabel[9];
		imageIcons = new ImageIcon[9];
		nameLabels = new JLabel[9];
		quantLabels = new JLabel[9];
		priceLabels = new JLabel[9];
			
		//will go through each item one by one 
		//if there is 0 of that item, a panel will not be made
		for(int i = 0; i<9; i++) {
			if(shoppingLogic.getAmountOfType(foodTypes[i])!=0) {
				itemPanels[i] = new JPanel();
				imageIcons[i] = new ImageIcon();
				imageLabels[i] = new JLabel();
				nameLabels[i] = new JLabel();
				quantLabels[i] = new JLabel();
				priceLabels[i] = new JLabel();
				switch(i) {
					case 0:
						addToListPanel(foodTypes[i], 
							imageIcons[i], 
							imageLabels[i], 
							nameLabels[i], 
							quantLabels[i], 
							priceLabels[i], 
							itemPanels[i]);
						break;
					case 1:
						addToListPanel(foodTypes[i], 
							imageIcons[i], 
							imageLabels[i], 
							nameLabels[i], 
							quantLabels[i], 
							priceLabels[i], 
							itemPanels[i]);
						break;
					case 2:
						addToListPanel(foodTypes[i], 
							imageIcons[i], 
							imageLabels[i], 
							nameLabels[i], 
							quantLabels[i], 
							priceLabels[i],
							itemPanels[i]);
						break;
					case 3:
						addToListPanel(foodTypes[i], 
							imageIcons[i], 
							imageLabels[i], 
							nameLabels[i],
							quantLabels[i], 
							priceLabels[i], 
							itemPanels[i]);
						break;
					case 4:
						addToListPanel(foodTypes[i], 
							imageIcons[i], 
							imageLabels[i],
							nameLabels[i], 
							quantLabels[i],
							priceLabels[i],
							itemPanels[i]);
						break;
					case 5:
						addToListPanel(foodTypes[i], 
							imageIcons[i], 
							imageLabels[i], 
							nameLabels[i], 
							quantLabels[i],
							priceLabels[i], 
							itemPanels[i]);
						break;
					case 6:
						addToListPanel(foodTypes[i], 
							imageIcons[i], 
							imageLabels[i], 
							nameLabels[i], 
							quantLabels[i], 
							priceLabels[i],
							itemPanels[i]);
						break;
					case 7:
						addToListPanel(foodTypes[i],
							imageIcons[i], 
							imageLabels[i], 
							nameLabels[i], 
							quantLabels[i],
							priceLabels[i],
							itemPanels[i]);
						break;
					case 8:
						addToListPanel(foodTypes[i],
							imageIcons[i], 
							imageLabels[i], 
							nameLabels[i], 
							quantLabels[i],
							priceLabels[i],
							itemPanels[i]);
						break;
				}
				containerPanel.add(itemPanels[i]);
			}
		}
			
		totalPanel.add(totalLabel);
		totalPanel.add(payButton);

		panel.add(containerPanel);
		panel.add(totalPanel);
	}
	
	
	public void addToListPanel(FoodType foodType, 
			ImageIcon imageIcon, 
			JLabel imageLabel, 
			JLabel nameLabel, 
			JLabel quantLabel,
			JLabel priceLabel, 
			JPanel itemPanel) {
		
		itemPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		itemPanel.setLayout(new FlowLayout());
		itemPanel.setPreferredSize(new Dimension(500,75));
		imageIcon.setImage(shoppingLogic.getInfoOnType(foodType).getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT));
		imageLabel.setPreferredSize(new Dimension(100,75));
		imageLabel.setIcon(imageIcon);
		nameLabel.setPreferredSize(new Dimension(100,75));
		nameLabel.setText(shoppingLogic.getInfoOnType(foodType).getName());
		quantLabel.setPreferredSize(new Dimension(100,75));
		quantLabel.setText("Quantity: " + String.valueOf(shoppingLogic.getAmountOfType(foodType)));
		priceLabel.setPreferredSize(new Dimension(100,75));
		priceLabel.setText("Total: $" + String.valueOf(shoppingLogic.getTotalCostOfType(foodType)));
		itemPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		itemPanel.setLayout(new FlowLayout());
		itemPanel.setPreferredSize(new Dimension(500,75));
		itemPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		itemPanel.add(imageLabel);
		itemPanel.add(nameLabel);
		itemPanel.add(quantLabel);
		itemPanel.add(priceLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==payButton) {
			containerPanel.removeAll();
			totalPanel.remove(payButton);
			totalLabel.setText("Thank You for Shopping!");
		}
		if(e.getSource()==backButton) {
			
		}
	}
}
