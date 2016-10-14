
class Cookie extends DessertItem{
	
	protected double number;
	protected double pricePerDozen;
	
	public Cookie(String name,double number,double pricePerDozen){
		super(name);
		this.number = number;
		this.pricePerDozen = pricePerDozen;
		
	}
	
	public int getCost(){
		return (int)(number / 12 * pricePerDozen);
	}
	
}

