
public class Pet {
		private String name;
		private String ownerName;
		private String color;
		protected Integer sex;
		public static final int MALE = 0;
		public static final int FEMALE = 1;
		public static final int SPARYED = 2;
		public static final int NEUTERED = 3;
		
		
		Pet(String name, String ownerName, String color){
			this.name = name;
			this.ownerName = ownerName;
			this.color = color;
		}
		String getPetName(){
			return name;
		}
		String getOwnerName(){
			return ownerName;
		}
		String getColor(){
			return color;
		}
		void setSex(int sexid){
			sex = sexid;
			
		}
		String getSex(){
			if(sex == 0) return "MALE"; 
			if(sex == 1) return "FEMALE"; 
			if(sex == 2) return "SPARYED"; 
			if(sex == 3) return "NEUTERED"; 
			return "invalid input";
			
		}
		public String toString(){
			String s = "";
			s += this.getPetName() + " owned by " + this.getOwnerName() + "\n"; 
			s += "Color: " + this.getColor() + "\n"; 
			s += "Sex: " + this.getSex() + "\n";
			return s;
		}
		
		public static void main(String args[]){
			Pet a = new Pet("asdf","asdf","asdf");
			a.setSex(3);
			System.out.println(a.getSex());
			
		}

		
		
}
