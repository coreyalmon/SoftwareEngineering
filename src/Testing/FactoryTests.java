package Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import DataAccessLayer.Food;
import DataAccessLayer.FoodFactory;
import DataAccessLayer.FoodType;

class FactoryTests {
	
	@Test
	void testGetFood() {
		assertTrue((new FoodFactory().getFood(FoodType.FOOD_TYPE_BROCCOLI)) instanceof Food);
	}
	
	@Test
	void testGetName() {
		assertEquals(((new FoodFactory()).getFood(FoodType.FOOD_TYPE_BROCCOLI).getName()), "Broccoli");
	}


}
