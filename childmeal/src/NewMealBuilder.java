public class NewMealBuilder implements Mealbuilder{
	
	public Meal meal;
	
	public NewMealBuilder() {
		this.meal=new Meal();
	}

	@Override
	public void build_main_meal() {
		// TODO Auto-generated method stub
		this.meal.set_main_item("HamBurger");
		
		
	}

	@Override
	public void build_side_item() {
		// TODO Auto-generated method stub
		this.meal.set_side_item("French Fries");
		
	}

	@Override
	public void build_drink() {
		// TODO Auto-generated method stub
		this.meal.set_drink("Orange Juice");
	}

	@Override
	public void build_toy() {
		// TODO Auto-generated method stub
		this.meal.set_toy("Mercedes SLS AMG Car");
	}
	
	@Override
	public Meal get_meal() {
		// TODO Auto-generated method stub
		return this.meal;
	}
}
