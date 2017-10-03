package useful.model;

public class Donut 
{
	//boolean is the true or false for these properties
	private boolean hasSprinkles;
	private boolean isGlazed;
	private String shape;
	private String flavor;
	private int holecount;
	
	public Donut()
	{
		this.flavor = "plain";
		this.shape = "round";
		this.holecount = 1;
		this.hasSprinkles = false;
		this.isGlazed = false;
	}
	
	public Donut(String flavor)
	{
		this.flavor = flavor;
	}
}
