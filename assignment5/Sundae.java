class Sundae extends IceCream{
	protected String topName; 
	protected int topcost;
	public Sundae(String namenew,int costnew,String topName,int topcost){
		super(namenew,costnew);
		this.topName = topName;
		this.topcost = topcost;
	}
	
	public int getCost(){
		return cost + topcost;
	}
}
