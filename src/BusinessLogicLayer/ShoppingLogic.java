package BusinessLogicLayer;

import java.math.BigDecimal;
import java.math.RoundingMode;

import DataAccessLayer.FoodDetails;
import DataAccessLayer.FoodType;


public class ShoppingLogic {
	
	private ShoppingCart shoppingCart;
	private double totalCostOfItems;
	
	public ShoppingLogic(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
		this.totalCostOfItems = this.getTotalCostOfItems();
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
	
	public double getTotalCostOfItems() {
		double total = 0;
		int foodTypeOrdinal = 0;

		for(int numberOfItemsPerType : shoppingCart) {
			total += numberOfItemsPerType * this.getInfoOnType(FoodType.values()[foodTypeOrdinal]).getPrice();
//			System.out.println("total: " + total + " =numberOfItemsPerType: " + numberOfItemsPerType + " price: " 
//					+ this.getInfoOnType(FoodType.values()[foodTypeOrdinal]).getPrice());

			foodTypeOrdinal++;
		}
		
		return BigDecimal.valueOf(total).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
	
	public void activateCoupons() {
		Coupon coupon = new FixedAmountCoupon()
	}
	
	public void setTotalCostOfItems(double totalCostOfItems) {
		this.totalCostOfItems = totalCostOfItems;
	}
}
