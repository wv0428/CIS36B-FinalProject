/**
* @author Yunjing Mai
* @author Xinfang Zhang
* CIS 36B, Final Project
*/

public class SelfCreation extends BasicSalad {
	private final String NAME = "Self made";

	/**
	 * Default constructor for SelfCreation. 
	 * call superclass
	 */
	public SelfCreation() {
		super();
	}

	/**
	 * One argument constructor for SelfCreation.
	 * call superclass with size
	 */
	public SelfCreation(String size) {
		super(size);
	}

	/**
	 * Calculate the total calories for all ingredients within a salad
	 */
	@Override 
	public int totalCalories() {
		int total = 0;
		for (int i = 0; i < dishIngredient.size(); i++) {
			total += dishIngredient.get(i).getNumber() * dishIngredient.get(i).getCalories();
		}
		return total;
	}

	/**
	 * call printIngredient()
	 */
	@Override
	public String toString() {
		return "\n\nYour choice: " + NAME + printIngredient() + "\nCalorie: " + this.totalCalories() + " calories"
				+ super.toString();
	}

}
