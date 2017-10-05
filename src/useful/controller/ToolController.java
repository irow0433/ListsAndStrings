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
		fillTheList();
		showTheList();
	}
	private void showTheList()
	{
		for (int i = 0; i <= donutList.size(); i += 1)
		{
			display.displayText(donutList.get(i).toString());
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");
		Donut glazed = new Donut("Glazed");
		Donut Sprinkles = new Donut("Sprinkles");
		Donut classic = new Donut("Classic");
		Donut sugarPowder = new Donut("Sugar Powder");
		
		donutList.add(bleachDonut);
		donutList.add(jellyFilled);
		donutList.add(rustyNail);
		donutList.add(springSmitch);
		donutList.add(trashDonut);
	}
}
