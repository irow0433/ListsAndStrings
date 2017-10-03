package useful.controller;

//Imports the other packages
import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;

public class ToolController
{
	//
	private List<Donut> donutList;
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>();
	}
	
	// public void start grabs the start method in the package "ToolRunner"
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
	}
}
