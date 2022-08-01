package PresentationLayer;
import java.awt.CardLayout;
import javax.swing.JPanel;

//Panel that switches pages between cart and shopping. Might not use. Watch ActionListener video
public class CardPanel extends AbstractPanel {
	
	private ShoppingPanel shoppingPanel;
	private CartPanel cartPanel;
	
	public CardPanel() {
		this.addComponentsToPanel();
	}
	@Override
	public void addComponentsToPanel() {

		//Create the panel that contains the "cards".
		panel = new JPanel(new CardLayout());
		panel.add(shoppingPanel.getJPanel());
		panel.add(cartPanel.getPanel());
	}
	
}
