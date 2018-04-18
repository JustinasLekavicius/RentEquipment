import java.awt.*;
import javax.swing.*;

public class Main 
{
	static int total = 0;
	static int finalTotal = 0;
	static int NumberOfDays = 1;
	static boolean OrderStarted = false;
	public static void main (String args[])
	{
		MainWindow.On();
	}
}
//TODO: Padaryt, jog Number of Days spinneris teisingai skaičiuotų TOTAL;                          ////////DONE. REIKIA PATESTUOT/////////
//TODO: Padaryt, jog paspaudus "Start a new order" mygtuką viskas atsižymėtų ir Total grįžtų į 0.  ////////DONE. REIKIA PATESTUOT/////////

/*REIKALAVIMAI:
 DONE   * At least 6 classes must be defined.                                                                            
 		*Usage of inheritance. Your defined class is to be inherited. Extension of the Java API class is not counted.
 		*Only the main method can be static! Other static methods and static variables are not allowed.
 		*All class variables must be non-static and local/temporary/loop variables can not be defined as class variables.
 		*The main method can contain less than 6 code lines.
 		*Any other method should not be too long, too (it cannot last for several pages).
 		*Usage of overloading and overriding.
 		*Simulation of the real time flow. The parameters (start date/time, jump over time, etc.) can be passed in the command line (and/or GUI) during program execution.
 		E.g. the program starts on 2017-02-15 (or any other chosen day), some steps are done by the user. At any step the program time can pass further by X days, months, or hours. The user initiates it when the user wants it. After time goes by X time units the changes are represented: more goods are delivered, the service time ended, more data are available, etc.
 		*Some information must be stored in file system.
 		*Nice test data must be prepared (as Part I required). The data cannot have person A B that buys product C. A, B, and C must be realistic.
 		*Logical access modifiers.
 		*Comments are written in javadoc style.
 		*You will get comments on part I and all comments must be considered and implemented.
 		*Coding style. Class names, variables, and methods must be only in one language, either English, either Lithuanian. Do not mix languages. E.g. Clientas class would not be acceptable.
 		*In the final version handle all I/O exceptions correctly. Remember that your colleagues will review your work, thus, you have to explain how to compile and run your program, where the data files are stored. If you use some IDE tell which one.
 		*Prepare your program for the VU MIF environment. Project defence will be at VU MIF computers. Also, students will have to review each others projects and during the defence any student could be asked to show how she/he tried to run/execute some project.
 		*Test your program much in advance!
 		*It is recommended to remove deprecated usage of Java.
 		*Archive your project correctly so that any other student would be able to run the program without creating additional files, directories, etc.
 		*When all the members of the team are listed be aware that they should be listed alphabetically (it is a standard), otherwise, the first student gets most of the credit :)
 		*Non-standard (non- Java API) packages are not allowed to use.
 		*Do not make comments for each line. Comments should be before the important methods, complex blocks, etc.
 */
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