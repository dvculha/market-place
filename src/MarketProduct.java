
public abstract class MarketProduct {

	String name;

	public MarketProduct(String name_of_product) {
		
		this.name = name_of_product;
	}

	public final String getName() {
		
		return this.name;	
	}

	public abstract int getCost();

	public abstract boolean equals (Object obj) ;

}
