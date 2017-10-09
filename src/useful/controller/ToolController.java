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
		//showTheList();
		//changeTheList();
		practiceList();
	}
	
	private void showTheList()
	{
		String favorite = "Glazed donut";
		for (int i = 0; i < donutList.size(); i += 1)
		{
			String currentFlavor = donutList.get(i).getFlavor();
			
			// flavor is calling the previous flavor so currently it doesn't have a variable or something to go back to
			Donut currentDonut = donutList.get(i);
			String flavor = currentDonut.getFlavor();
			
			
			if (currentFlavor.equals(favorite))
			{
				for (int woop = 0; woop < 5; woop += 1)
				{
					display.displayText("The best FLAVOR EVER!!!");
				}
			}
			for (int currentLetteri = 0; currentLetteri < currentFlavor.length(); i += 1)	
			{
				display.displayText(currentFlavor.substring(currentLetteri, currentLetteri + 1));
		    }
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
		
		donutList.add(classic);
		donutList.add(jellyFilled);
		donutList.add(sugarPowder);
		donutList.add(Sprinkles);
		donutList.add(glazed);
	}
	
	private void changeTheList()
	{
		display.displayText("The list is this big: " + donutList.size());
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor()+ "was removed from the last");
		display.displayText("Now it is this big: " + donutList.size());
		donutList.add(removed);
		
		display.displayText("The list is still: " +donutList.size() +" items.");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavorr " + removed.getFlavor() + " has been removed");
	}
	
	private void practiceList()
	{
		display.displayText("Just so you know...");
		Donut removed = donutList.remove(3);
		display.displayText("I just ate one of your donuts! hahaha!!!");
		display.displayText("I will not be telling you which donut I ate!!!");
		display.displayText("I will be telling what the size of the donut was though!");
		display.displayText("This is the size of the donut...!!");
		display.displayText("the donuts size was " + donutList.size());
		display.displayText("but I will be giving you a donut back!!");
		
		
		
		for(int i = 1; i < donutList.size(); i += 2)
		{
			String currentDonut = donutList.get(i).getFlavor();
			
			Donut presentDonut = donutList.get(i);
			
		}
		
		
		
		
	}
	


}

