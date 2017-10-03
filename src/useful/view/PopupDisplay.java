package useful.view;

import javax.swing.JOptionPane;

/**
 * The popup display class for CTEC AM Session 2017
 * @author irow0433
 *@Version 1.0 03.10.2017
 */
public class PopupDisplay 
{
	/**
	 * Displays the supplied message in popup windo
	 * @param message the message that is displayed
	 */
	
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Displays the suppplied question in a popup and returns the answer as a String
	 * @param fromQuestion The question to ask the user
	 * @return The String answer
	 */
	 public String getResponse(String fromQuestion)
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, fromQuestion);
				
		return response;
	}
}
