//
/**
* @author 
* @author 
* CIS 36B, Final Project
*/

import java.util.ArrayList;

public class SelfCreation extends BasicSalad {
	ArrayList<Ingredient> selfIngredient;

	/**
	 * Default constructor for SelfCreation. Set the price and size to default value
	 * Declare a ArrayList for all ingredients for the Selfcreations
	 */
	public SelfCreation() {
		super();
		selfIngredient = new ArrayList<>();
	}

	/**
	 * Two-arguments constructor for SelfCreation. Set the price and size to default
	 * value Declare a ArrayList for all ingredients for the Selfcreations
	 */
	public SelfCreation(String size) {
		super("Self Made", size);
		selfIngredient = new ArrayList<>();
	}

	
	/**
	 * Copy the ingredients into the ArrayList selfcreations
	 * 
	 * @param in
	 *            the list of ingredients for selfcreation
	 */
	public void setIngredient(ArrayList<Ingredient> in) {
		for (int i = 0; i < in.size(); i++) {
			selfIngredient.add(in.get(i));
		}
	}

	/**
	 * Returns the list of the ingredients for selfCreation
	 * @return the list of the ingredients 
	 */
	public ArrayList<Ingredient> getIngredient (){
		return this.selfIngredient;
	}
	
	/**
	 * Add a new ingredient to the salad
	 * 
	 * @param i
	 *            new ingredient
	 */
	@Override
	public void add(Ingredient in) {
		selfIngredient.add(in);
	}

	/**
	 * Remove the ingredient from the salad
	 * 
	 * @param i
	 *            the ingredient need to remove
	 */
	@Override
	public void remove(String in) {
		for (int i = 0; i < selfIngredient.size(); i++) {
			if (selfIngredient.get(i).getName().equalsIgnoreCase(in)) {
				selfIngredient.remove(i);
				break;
			}
		}
		removePrice();
	}

	/**
	 * Calculate the total calories for all ingredients within a salad
	 */
	@Override
	public int totalCalories() {
		for (int i = 0; i < selfIngredient.size(); i++) {
			super.setCalories(super.getCalories() + selfIngredient.get(i).getCalories());
		}
		if (super.getSize().equalsIgnoreCase("small")) {
			return (int) (super.getCalories() * 0.6);
		} else {
			return super.getCalories();
		}

	}

	/**
	 * print ingredient in the selfIngredient;
	 */
	public String printIngredient() {
		String in = "\n";
		for (int i = 0; i < selfIngredient.size() - 1; i++) {
			in += selfIngredient.get(i).getName() + ", ";
		}
		in += selfIngredient.get(selfIngredient.size() - 1).getName();
		return in;
	}

	/**
	 * call printIngredient()
	 */
	@Override
	public String toString() {
		return "\n\nYour choice: " + getName() + printIngredient() + "\nCalorie: " + this.totalCalories() + " calories"
				+ super.toString();
	}

}
