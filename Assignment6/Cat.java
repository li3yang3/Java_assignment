import java.util.Date;

import Boardable.Boardable;

public class Cat extends Pet implements Boardable {
		private String hairLength;
		private Date boardstart;
		private Date boardend;
		
		Cat(String name, String ownerName, String color, String hairLength){
			super(name,ownerName,color);
			this.hairLength = hairLength;
			
		}
		String getHairLength(){
			return hairLength;
		}
		public String toString() {
			String s = "";
			s += "Cat: \n";
			s += this.getPetName() + " owned by " + this.getOwnerName() + "\n"; 
			s += "Color: " + this.getColor() + "\n"; 
			s += "Sex: " + this.getSex() + "\n";
			s += "Hair: " + this.getHairLength();
			return s;

		}
		public void setBoardStart(int month, int day, int year){
			boardstart = new Date(year - 1900, month - 1, day - 1);
		}
		
		public void setBoardEnd(int month, int day, int year){
			boardend = new Date(year - 1900, month - 1, day + 1);
		}
		
		public boolean boarding(int month, int day, int year){
		    Date checkdate = new Date(year - 1900, month - 1, day);
			return checkdate.after(boardstart) && checkdate.before(boardend);
			
		}
		
}
