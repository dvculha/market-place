
public class Egg extends MarketProduct {

	int number_of_eggs;
	int price_per_dozen;

	public Egg(String name_of_product, int number_req, int dozen_price) {

		super (name_of_product);
		this.number_of_eggs = number_req;
		this.price_per_dozen = dozen_price;
	}

	public int getCost() {
		//double cost_as_double;
		//cost_as_double = number_of_eggs*price_per_dozen / 12;
		int cost = (this.number_of_eggs * this.price_per_dozen)/12;
		return cost;
	}
	public int getNumber() {
		//double cost_as_double;
		//cost_as_double = number_of_eggs*price_per_dozen / 12;
		int number = this.number_of_eggs;
		return number;
	}

	public boolean equals (Object obj) {

		if (obj == null) 
			return false;

		else if  (obj instanceof Egg) {
			Egg egg1 = (Egg) obj;
			if ((this.getName().equals(egg1.getName())) && (this.getCost() == egg1.getCost()) && (this.getNumber() ==egg1.getNumber())) 
				return true;
		}
		return false;
	}
}
