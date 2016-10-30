import java.util.ArrayList;
import java.util.List;

public class AnimalHospital {
	private List<Pet> anilist = new ArrayList<>();
	
	void printPetInfoByName(String name){
		for(Pet p : anilist){
			if(p.getPetName().equals(name)){
				System.out.println(p.toString());
			}
		}
	}
	/* search the list of pets for every pet of a given name, and print the pet¡¯s information, using the toString() method. */
	void printPetInfoByOwner(String name){
		for(Pet p : anilist){
			if(p.getOwnerName().equals(name)){
				System.out.println(p.toString());
			}
		}
	}
	/* search the list of pets for pets owned by the given person and print the pet¡¯s information for every match, using the toString() method. */
	void printPetsBoarding(int month, int day, int year){
		for(Pet p: anilist){
			if(p instanceof Cat){
				if(((Cat)p).boarding(month,day,year)){
					System.out.println(((Cat)p).toString());
				}
			}
			if(p instanceof Dog){
				if(((Dog)p).boarding(month,day,year)){
					System.out.println(((Dog)p).toString());
				}
			}
		}
	}

}
