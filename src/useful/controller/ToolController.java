package useful.controller;

//Imports the other packages
import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ToolController
{
	//
	private List<Donut> donutList;
	private PopupDisplay display;
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>();
		display = new PopupDisplay();
	}
	
	// public void start grabs the start method in the package "ToolRunner"
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");
		
	}
}
