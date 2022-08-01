package DataAccessLayer;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class FoodImage  {
	private Image image;
		
	public FoodImage(FoodType FOOD_TYPE) {	
		switch(FOOD_TYPE) {
			case FOOD_TYPE_BROCCOLI -> {
				this.readImage("images/Broccoli.jpg");
			}
			case FOOD_TYPE_CARROT -> {
				this.readImage("images/Carrot.jpg");
			}
			case FOOD_TYPE_LETTUCE -> {
				this.readImage("images/Lettuce.jpg");
			}
			case FOOD_TYPE_CAKE -> {
				this.readImage("images/Cake.jpg");
			}
			case FOOD_TYPE_BROWNIES -> {
				this.readImage("images/Brownies.jpg");
			}
			case FOOD_TYPE_MUFFIN -> {
				this.readImage("images/Muffin.jpg");
			}
			case FOOD_TYPE_EGG -> {
				this.readImage("images/Egg.jpg");
			}
			case FOOD_TYPE_BREAD -> {
				this.readImage("images/Bread.jpg");
			}
			case FOOD_TYPE_CEREAL -> {
				this.readImage("images/Cereal.jpg");
			}
			default -> {
				throw new IllegalArgumentException("Unexpected value: " + FOOD_TYPE);
			}
		}	
	}

	private void readImage(String imageFilePath)  {
		try {
			image = ImageIO.read(new File(imageFilePath));
		} catch(IOException ex) {			
			ex.printStackTrace();
		}
	}
	
	public Image getImage() {
		return image;
	}
}
