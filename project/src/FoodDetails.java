package DataAccessLayer;

import java.awt.Image;

//Food data combines FoodImage and Food into 1 class
public class FoodDetails {
	private FoodType FOOD_TYPE;
	private FoodImage foodImage;
	private FoodFactory foodFactory;

	public FoodDetails(FoodType FOOD_TYPE) {

		FoodFactory foodFactory = new FoodFactory();
		this.FOOD_TYPE = FOOD_TYPE;
		foodImage = new FoodImage(FOOD_TYPE);
	}

	public double getPrice() {
		return foodFactory.getFood(FOOD_TYPE).getPrice();
	}

	public String getName() {
		return foodFactory.getFood(FOOD_TYPE).getName();	
	}

	public Image getImage() {
		return foodImage.getImage();
	}



	public static void main(String[] args) {
		FoodDetails foodDetails = new FoodDetails(FoodType.FOOD_TYPE_CAKE);
		System.out.println(foodDetails.getImage());

	}

}
