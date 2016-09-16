/
Scenario : Pay tuition

Description : A student wants to pay his tuition through myNEU account.

Author:Yang Li
NEUID:001253037

Objects (with Behaviors and State): 
	Object : Student
		State : name, studentID
		Behavior : visitWebsite(), findCurrentBill(), confirmTheBill(), payTuitionToWebsite()
	
	
	Object : UniversityWebsite
		State : Collection of Bills
		Behavior : displayBillsInfo(),  acceptPaymentFromStudent(), sendConfirmationToStudent()
	
	Object : Bill
		State : name, price, credit
		Behavior : getName(), getPrice(), getCredit()
	
	Object : Tuition
		state : amount	
*/
class Student{
	String name;
	Integer studentID;
	void visitWebsite(UniversityWebsite uw){}
	Bill findCurrentBill(Student s, Bill bills[]){}
	Tuition payTuitionToWebsite(UniversityWebsite uw){}
	
}

class UniversityWebsite{
	Bill[] bills; 
	Bill displayBillsInfo(){}
	void acceptPaymentFromStudent(Student s, Tuition t){}
	void sendConfirmationToStudent(Student s){}
			
}

class Bill{
	String name;
	Float price;
	Integer credit;
	Float getPrice(){}
	String getName(){}
        Integer getCredit(){}
}

class Tuition{
	Float amount;
	
}

class Paytuition{
	public static void main(String args[]){
		UniversityWebsite myNEU = new UniversityWebsite();
                
                Bill newFallTerm = new Bill();
                bill.name = "newFallTerm";
                bill.price = 13383.0;
                Bill PrevSpringTerm = new Bill();
                bill.name = "PrevSpringTerm";
                bill.price = 11583.0;
                Bill[] bills = {newFallTerm, PrevSpringTerm};
		

		Student rick = new Student();
		rick.name = "rick";
		rick.stduentID = 001253037;
		
		rick.visitsWebsite(myNEU);
		Bill[] bills = myNEU.displayBillsInfo();
		Bill bill = rick.findCurrentBill(rick,bills);
		rick.confirmTheBill(bill);
		
		Tuiton tuition = rick.payTuitionToWebsite(myNEU);
		myNEU.acceptPaymentFromStudent(rick, tuition);
		myNEU.sendConfirmationToStudent(rick);
	}

}
