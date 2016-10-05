/*2. Implement Class MusicAlbum which encapsulated a music Album, each album has a string variable albumTitle and a String variable singer representing the name of singer, double variable price representing the price of album, objects of this class are Initialized using all of its instance variables.
The class has accessor methods for all its Variables and a mutator method for price.*/

public class MusicAlbum{
	String albumTitle;
	String singer;
	double price;
	
	public MusicAlbum(String albumTitle,String singer,double price) {
	     this.albumTitle = albumTitle;
             this.singer = singer;
	     this.price = price;
	}
	public String getalbumTitle(){
		return albumTitle;
	}
	
	public void setalbumTitle(String albumTitle){
	       this.albumTitle = albumTitle;
	}
	
        public String getSinger() {
        	return singer;
        }

    	public void setSinger(String singer) {
        	this.singer = singer;
    	}
	
	public double getPrice() {
	      return price;
	}
	
	public void setPrice(double price) {
	        this.price = price;
	}
	
}
	
