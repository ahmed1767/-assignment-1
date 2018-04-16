
public class Meal implements MealPlan{

	private String main_item;
	private String side_item;
	private String drink_item;
	private String toy_item;
	

	@Override
	public void set_main_item(String meal) {
		main_item= meal;
	}
	
	public String get_main_item() {
		return main_item;
	}
	@Override
	public void set_side_item(String item) {
		// TODO Auto-generated method stub
		side_item=item;
		
	}
	
	public String get_side_item() {
		return side_item;
	}

	@Override
	public void set_drink(String drink) {
		// TODO Auto-generated method stub
		drink_item=drink;
	}

	
	public String get_drink() {
		return drink_item;
	}
	
	@Override
	public void set_toy(String toy) {
		// TODO Auto-generated method stub
		toy_item= toy;
	}
	
	public String get_toy() {
		return toy_item;
	}

}

