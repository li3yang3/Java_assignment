import java.util.ArrayList;

class Checkout{
	protected ArrayList items;
	protected final double taxR;
	protected int total;
	
	public Checkout(){
		items = new ArrayList();
		taxR = DessertShoppe.taxRate;
	}
	
	public int numberOfItems(){
		return items.size();
	}
		
	public void enterItem(DessertItem item){
		items.add(item);
	}
	
	public void clear(){
		for(int i = items.size()-1;i >= 0;i--){
			items.remove(items.get(i));
		}
	}
	 public int totalCost(){
		 total = 0;
		 for(int j = 0; j < items.size(); j++){
		        	total += ((DessertItem) items.get(j)).getCost();
		 }
		 return total;
	 }
	 
	 public int totalTax(){
		return (int)Math.round((this.totalCost() * taxR) / 100) ;
	 }
	 
	 public String toString() {
		 String res = "";
		 res += DessertShoppe.storeName + "\n";
		 res +="--------------------" + "\n";
		 for(int k = 0; k < items.size(); k++){
			 if(items.get(k) instanceof Candy){
				res += ((Candy)items.get(k)).weight + " lbs.  @ " +  (((Candy)items.get(k)).pricePerPound)/100 + " /lb. \n";
			 }
			 if(items.get(k) instanceof Cookie){
				res += (int)((Cookie)items.get(k)).number + " @ " +  (((Cookie)items.get(k)).pricePerDozen)/100 + " /dz. \n";
			 }
			 res += String.format("%-25s %7s" , ((DessertItem)items.get(k)).getName() , DessertShoppe.cents2dollarsAndCents(((DessertItem)items.get(k)).getCost())) + "\n";
		 }
		 res += "\n" + String.format("%-25s %7s" ,"tax:  ", DessertShoppe.cents2dollarsAndCents(totalTax())) + "\n";
		 res +=  String.format("%-25s %7s" ,"Total Cost:  ", DessertShoppe.cents2dollarsAndCents(totalCost()+totalTax()));
		 return res;
	 }
}
