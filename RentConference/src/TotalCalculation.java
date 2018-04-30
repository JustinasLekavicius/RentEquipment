import java.awt.Color;
import java.awt.Font;

public class TotalCalculation extends Main {

	static int ProjectorCosts = 0;
    static int LargeSpeakerCosts = 0;
    static int LaserPointerCosts = 0;
    static int MicrophoneCosts = 0;
    static int WhiteBoardCosts = 0;
    static int ProjectionScreenCosts = 0;
    static int AmplifierCosts = 0;
    static int AuditoriumCosts = 0;
    static int BigHallCosts = 0;
    static int MediumSizedRoomCosts = 0;
    static int MediumSizedClassroomCosts = 0;
    static int SmallRoomCosts = 0;
    
	static void	CalculateTotal ()

	{
		total = (ProjectorCosts + LargeSpeakerCosts + LaserPointerCosts + MicrophoneCosts + WhiteBoardCosts + ProjectionScreenCosts + AmplifierCosts + AuditoriumCosts + BigHallCosts + MediumSizedRoomCosts + MediumSizedClassroomCosts + SmallRoomCosts) * NumberOfDays;
	}
	static void setTotalTextOrderConfirmation()
	{
		OrderConfirmation.TotalOrder.setText("");
		OrderConfirmation.TotalOrder.setFont(new Font("Dialog", Font.PLAIN, 17));
		OrderConfirmation.TotalOrder.setBackground(new Color(153, 204, 204));
		for (Equipment items: Equipment.values()) {
			if(items.getOrdered() != 0)
		OrderConfirmation.TotalOrder.append(items.getName() + " " + items.getOrdered() + " units for " + (items.getPrice() * items.getOrdered()) + " EUR \n");
		}
		for (Rooms rooms: Rooms.values()) {
			if(rooms.getSelected() == true )
		OrderConfirmation.TotalOrder.append(rooms.getName() + " selected for " + rooms.getPrice() + " EUR \n");
		}
		OrderConfirmation.TotalOrder.append("For "+ NumberOfDays + " days\n");
		OrderConfirmation.TotalOrder.append("Total: " + finalTotal + " EUR \n");
		OrderConfirmation.TotalOrder.setEditable(false);
		OrderConfirmation.TotalOrder.setBounds(70, 115, 525, 271);
		OrderConfirmation.frame.getContentPane().add(OrderConfirmation.TotalOrder);
	}	
}
