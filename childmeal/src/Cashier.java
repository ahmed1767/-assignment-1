
public class Cashier {
	
private Mealbuilder meal_builder;
	
	public Cashier(Mealbuilder meal_builder) {
		this.meal_builder=meal_builder;
	}
	
	public Meal get_meal() {
		return this.meal_builder.get_meal();
	}
	
	public void make_meal() {
		this.meal_builder.build_main_meal();
		this.meal_builder.build_side_item();
		this.meal_builder.build_drink();
		this.meal_builder.build_toy();
	}

}

