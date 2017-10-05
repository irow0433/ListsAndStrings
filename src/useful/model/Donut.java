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
		this();
		this.flavor = flavor;
	}
	
	public String toString()
	{
		String description = "This donut is a " + flavor + " donut!";
		
		return description;
	}
	
	//what is below? that is what getters and setters look like
	public String getShape()
	{
		return shape;
	}
	
	//void means your not getting something back
	public void setShape(String shape)
	{
		this.shape = shape;
	}
	
	public String getFlavor()
	{
		return flavor;
	}
}
