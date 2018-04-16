public class MainMeal {
	public static void main(String[] args) {	
		NewMealBuilder meal= new NewMealBuilder();
		Cashier cashier= new Cashier(meal);
		cashier.make_meal();
		Meal first_meal=cashier.get_meal();
		
		System.out.println("Meal Built");

		System.out.println("Meal->Main Item: "+first_meal.get_main_item());

		System.out.println("Meal->Side Item: "+first_meal.get_side_item());

		System.out.println("Meal->Drink: "+first_meal.get_drink());

		System.out.println("Meal->Toy: "+first_meal.get_toy());
		System.out.println("Thank You");
		
	}
}

