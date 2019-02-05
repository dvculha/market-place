
public class SeasonalFruit extends Fruit {


	public SeasonalFruit(String name_of_product, double kg_weight, int kg_price) {
		
		super (name_of_product, kg_weight, kg_price);
	}

	public int getCost() {
		return (int) (super.getCost()* 0.85);
		
	}
}
