package DataAccessLayer;

public class FoodFactory {
	public Food getFood(FoodType FOOD_TYPE) {
		switch(FOOD_TYPE) {
			case FOOD_TYPE_BROCCOLI -> {
				return (new Broccoli()); 
			}
			case FOOD_TYPE_CARROT -> {
				return (new Carrot()); 
			}
			case FOOD_TYPE_LETTUCE -> {
				return (new Lettuce());
			}
			case FOOD_TYPE_CAKE -> {
				return (new Cake());
			}
			case FOOD_TYPE_BROWNIES -> {
				return (new Brownies());
			}
			case FOOD_TYPE_MUFFIN -> {
				return (new Muffin());
			}
			case FOOD_TYPE_EGG -> {
				return (new Egg());
			}
			case FOOD_TYPE_BREAD -> {
				return (new Bread());
			}
			case FOOD_TYPE_CEREAL -> {
				return (new Cereal());
			}
			default -> {
				throw new IllegalArgumentException("Unexpected value: " + FOOD_TYPE);
			}
		}
	}

	private class Broccoli extends Food {
		private Broccoli() {
			this.setPrice(2.01);
			this.setName("Broccoli");
		}
	}
	private class Carrot extends Food {
		private Carrot() {
			this.setPrice(1.46);
			this.setName("Carrot");
		}
	}
	private class Lettuce extends Food {
		private Lettuce() {
			this.setPrice(3.33);
			this.setName("Lettuce");
		}
	}
	private class Cake extends Food {
		private Cake() {
			this.setPrice(4.55);
			this.setName("Cake");
		}
	}
	private class Brownies extends Food {
		private Brownies() {
			this.setPrice(6.50);
			this.setName("Brownies");
		}
	}
	private class Muffin extends Food {
		private Muffin() {
			this.setPrice(5.55);
			this.setName("Muffin");
		}
	}
	private class Egg extends Food {
		private Egg() {
			this.setPrice(0.50);
			this.setName("Egg");
		}
	}	
	private class Bread extends Food {
		private Bread() {
			this.setPrice(2.75);
			this.setName("Bread");
		}
	}	
	private class Cereal extends Food {
		private Cereal() {
			this.setPrice(7.23);
			this.setName("Cereal");
		}
	}
	public static void main(String[] args) {
		FoodFactory factory = new FoodFactory();
		FoodFactory muffin = factory.getFood(FOOD_TYPE_MUFFIN);
		System.out.println(muffin.getName());
	}
}
