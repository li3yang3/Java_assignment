/
Scenario : Travelling to LA

Description : A tourist is trying to find the cheapest flight to LA.

Author:Yang Li
NEUID:001253037

Objects (with Behaviors and State): 
	  Object : traveller
		State : name, accountID, address
		Behavior : visitWebsite(), rankTheTicketByPrice(),findCheapestFlight(), bookCheapestFlight(), payTheTicket()
	
	
	  Object : travelwebsite
		State : Collection of Airplane tickets
		Behavior : displayTickets(),  acceptPaymentFromTraveller(), sendTicketToTraveller()
	
	  Object : ticket
		State : flightNumber, price
		Behavior : getFlightNumber(), getPrice()
	
	  Object : Money
		state : amount	
*/		
		
Class Traveller {
      String Name;
      Integer accountID;
      String address;
      void visitWebsite(Travelwebsite tw){}
      void rankTheTicketByPrice(Ticket tickets[]){}
      Ticket findCheapestFlight(Ticket tickets[]){}
      void  bookCheapestFlight(Ticket ticket){}
      Money payTheTicket(Ticket ticket){};
      
}

Class Travelwebsite{
      Ticket[] tickets;
      Ticket displayTickets(){}
      void acceptPaymentFromTraveller(Traveller t, Money m){}
      void sendTicketToTraveller(Traveller t){}

}

Class Ticket{
      String flightNumber;
      Float price;
      String getFlightNumber(){}
      Float getPrice(){} 
      

}

Class Money{
      Float amount;

}

class TraveltoLA{
	public static void main(String args[]){
	Travelwebsite expedia = new Travelwebsite();
	
	Ticket alaska = new Ticket();
	alaska.flightNumber = "AS3412";
	alaska.price = 365.0;
	Ticket delta = new Ticket();
	delta.flightNumber = "DL581";
        delta.price = 295.0;
	Ticket[] tickets = {alaska,delta};
	
	Traveller frank = new Traveller();
	frank.name = "frank";
	frank.accountID = "frank_Sea";
	frank.address = "Seattle";
	
	frank.visitWebsite(expedia);
	Ticket[] tickets = expedia.displayTickets();
	frank.rankTheTicketByPrice(tickets);
	Ticket ticket = frank.findCheapestFlight(tickets);
	frank.bookCheapestFlight(ticket);
	Money money = frank.payTheTicket(ticket);
	expedia.acceptPaymentFromTraveller(frank, money);
	expedia.sendTicketToTraveller(frank);

	}

}


