package DataAccessLayer;

public class FoodFactory {
	public Food getFood(FoodType FOOD_TYPE) {
		switch(FOOD_TYPE) {
			case FOOD_TYPE_BROCCOLI -> {
				return (new Broccoli()); 
			}
			case FOOD_TYPE_CAKE -> {
				return (new Cake());
			}
			default -> {
				throw new IllegalArgumentException("Unexpected value: " + FOOD_TYPE);
			}
		}
	}
	
	private class Broccoli extends Food {
		private Broccoli() {

		}

	}
	
	private class Cake extends Food {
		private Cake() {
			this.setPrice(4.55);
			this.setName("Cake");
		}
	}
}
