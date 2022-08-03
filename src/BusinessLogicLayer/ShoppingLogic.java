package BusinessLogicLayer;

import DataAccessLayer.FoodDetails;
import DataAccessLayer.FoodType;


public class ShoppingLogic {
	private ShoppingCart shoppingCart;
	
	public ShoppingLogic(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	public int getAmountOfType(FoodType FOOD_TYPE) {
		return shoppingCart.get(FOOD_TYPE);
	}
	
	public double getTotalCostOfType(FoodType FOOD_TYPE) {
		return shoppingCart.get(FOOD_TYPE) * (new FoodDetails(FOOD_TYPE)).getPrice();
	}
	
	public FoodDetails getInfoOnType(FoodType FOOD_TYPE) {
		return new FoodDetails(FOOD_TYPE);
	}
	
//  Waiting on iterator design pattern implementation
//	public double totalCostOfCart() {
//		int total = 0;
//		int foodTypeOrdinal = 0;
//		for(int numberOfItemsPerType : shoppingCart) {
//			total += numberOfItemsPerType * this.getInfoOnType(FoodType.values()[foodTypeOrdinal]).getPrice();
//			foodTypeOrdinal++;
//		}
//	}
}
