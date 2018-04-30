
import java.awt.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

import javax.swing.*;
import java.util.GregorianCalendar;
public class Main 
{
	static int total = 0;
	static int finalTotal = 0;
	static int NumberOfDays = 1;
	static boolean OrderStarted = false;
	public static void main (String args[])
	{
		MainWindow.On();
		DataInputOutput.CheckIfExists();
		DataInputOutput.ReadEquipment();
		DataInputOutput.ReadRooms();
		//Date
		
	}
}

/** 
 * 
 * 
 * Our vision of the program is a user friendly, multi-window application used for renting conference
 * rooms and equipment, either separately or both. The user should get suggestions according to the choices
 * made (rooms for expected amount of people, type of event etc.). If the user decides to rent 
 * equipment, he should be asked if he wants to rent a room as well, and vice versa. The rented equipment
 * and rooms should have an expiration date depending on the choice of the user and a status, whether the
 * object is already rented or not.
 
 * Our vision of the flow of the program
MainWindow --> Rent Equipment --> Back
							  --> Next 			      --> Need a room? Yes/No  --> Yes  	 --> Rent A room etc.
							  		   				    					 --> No/Done
							  		   				  
		   --> 	Rent A Room   --> Help me choose      --> User enters data   --> choose available rooms --> Confirm/Cancel
	   						  --> User chooses himself--> Confirmation 		 --> Done
	   						  --> Back 				  

**/