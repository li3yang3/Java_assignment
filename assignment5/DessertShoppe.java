class DessertShoppe{
	 public final static double taxRate = 6.5;;
	 public final static String storeName = "M & M Dessert Shoppe";
	 public final static int maxSize = 50 ;
	 public final static int costWidth = 10;
   	
	 public static String cents2dollarsAndCents(int cents){
		 String str = "";
		 
		 int dollar = cents/100;
		 cents = cents % 100;
		
		 
		 if(dollar > 0) {
			 str = str + dollar;
		 }
		 str += ".";
		 if(cents < 10) {
			 str += "0";
		 }
		 
		 str += cents;
		 return str;
	 }
}
