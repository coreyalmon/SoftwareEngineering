package DataAccessLayer;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class FoodImage  {
	private Image image;
		
	public FoodImage(FoodType FOOD_TYPE) {	
		
		switch(FOOD_TYPE) {
			case FOOD_TYPE_CAKE -> {
				this.readImage("Cake.jpg");
			}

		default -> {
			throw new IllegalArgumentException("Unexpected value: " + FOOD_TYPE);
		}
	}	
	}
	
	private void readImage(String imageFilePath) throws IOException {
		try {
			image = ImageIO.read(new File(imageFilePath));
		} catch(IOException ex) {
			
			ex.printStackTrace();
			throw new IOException();
		}
	}
	
	public Image getImage() {
		return image;
	}
}
