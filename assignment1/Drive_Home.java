/*
Scenario : Drive home

Description : A student is driving home from school.

Author:Yang Li
NEUID:001253037

Objects (with Behaviors and State): 
	Object : Driver
		State : name
		Behavior : openCarGPS(), findHome(), startNavigation(), driveCar()
	
	
	Object : GPS
		State : Collection of Locations
		Behavior : displayAMap(), NavigateToHome(), EndNavigation()
	
	Object : Location
		State : address
		Behavior : getAddress()
*/	


class Driver {
	String name;
	void openCarGPS(GPS g){}
	Location findHome(Location locations[]){}
	void startNavigation(Location l){}
	void driveCar(){}
	
}

class GPS {
	Location[] locations; //Array of Book
	Location[] displayAMap(){}
	void NavigateToHome(Location l){}
	void EndNavigation(){}
			
}

class Location {
	String address;
	String getAddress(){}

}

class DriveHome {
      public static void main(String args[]) {
      GPS googlemap = New GPS();
      
      Location school = new Location();
      school.address = "1100 Dexter Street";
      Location home = new Location();
      home.address = " 610 Galer Street";
      Location[] locations = {school,home};
      
      Driver harvey = new Driver();
      harvey.name = "harvey";
      
      harvey.openCarGPS(googlemap);
      Location[] locations = googlemap.displayAMap();
      Location l = harvey.findHome(locations);
      harvey.startNavigation(l);
      googlemap.NavigateToHome(l);
      harvey.driveCar();
      googlemap.EndNavigation();
      
   }
}
