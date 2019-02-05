
public class Fruit extends MarketProduct{

	double weight_in_kg;
	int price_per_kg;

	public Fruit(String name_of_product, double kg_weight, int kg_price) {

		super(name_of_product);
		this.weight_in_kg = kg_weight;
		this.price_per_kg = kg_price;
	}

	@Override
	public int getCost() {
		//return (int) this.weight_in_kg*this.price_per_kg;
	
		double cost_as_double;
		cost_as_double = price_per_kg * weight_in_kg;
		int cost = (int) cost_as_double;
		return cost; 		
	}

	public double getWeight() {
		//double cost_as_double;
		//cost_as_double = number_of_eggs*price_per_dozen / 12;
		double weight = this.weight_in_kg;
		return weight;
	}
	public boolean equals (Object obj) {

		if (obj == null) 
			return false;
		
		else if (obj.getClass() == this.getClass()) {
			Fruit fruit1 = (Fruit) obj;
			if ((this.getName().equals(fruit1.getName())) && (this.getCost() == fruit1.getCost()) && (this.getWeight() ==fruit1.getWeight())) 
				return true;
		}

		else if  (obj instanceof SeasonalFruit) {
			SeasonalFruit sfruit1 = (SeasonalFruit) obj;
			if ((this.getName().equals(sfruit1.getName())) && (this.getCost() == sfruit1.getCost()) && (this.getWeight() ==sfruit1.getWeight())) 
				return true;
		}
		return false;
	}

}
