
public class Jam extends MarketProduct {
	
	int number_of_jars;
	int price_per_jar;

	public Jam(String name_of_product, int number_of_jars, int jar_price) {
		super (name_of_product);
		this.number_of_jars = number_of_jars;
		this.price_per_jar = jar_price;
	}

	@Override
	public int getCost() {
		int cost;
		cost = number_of_jars * price_per_jar;
		return cost;
	}
	
	public int getNumber() {
		//double cost_as_double;
		//cost_as_double = number_of_eggs*price_per_dozen / 12;
		int number = this.number_of_jars;
		return number;
	}

	public boolean equals (Object obj) {

		if (obj == null) 
			return false;

		else if  (obj instanceof Jam) {
			Jam jam1 = (Jam) obj;
			if ((this.getName().equals(jam1.getName())) && (this.getCost() == jam1.getCost()) && (this.getNumber() ==jam1.getNumber())) 
				return true;
		}
		return false;
	}
}
