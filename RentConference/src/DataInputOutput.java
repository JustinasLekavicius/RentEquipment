import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DataInputOutput {
	
	private Formatter RoomFormatter;
	private Formatter EquipmentFormatter;
	static File RoomsFile = new File("./data/rooms.txt");
	static File EquipmentFile = new File("./data/equipment.txt");
	static File CurrentOrdersFile = new File("./data/currentorders.txt");
	static File OrderHistoryFile = new File("./data/orderhistory.txt");
	public static void CheckIfExists()
	{
		if (!RoomsFile.exists())
		{
			JOptionPane.showMessageDialog(null, RoomsFile.getName() + " doesn't exist!");
		}
		if (!EquipmentFile.exists())
		{
			JOptionPane.showMessageDialog(null, EquipmentFile.getName() + " doesn't exist!");
		}
	}
	public static void ReadEquipment() 
	
	{
		
		try {
			Scanner EquipmentScanner = new Scanner(EquipmentFile);
			for (Equipment x: Equipment.values())
			{
				String name = EquipmentScanner.next();
				x.setOrdered(EquipmentScanner.nextInt());
				x.setAvailable(EquipmentScanner.nextInt());
			}
			EquipmentScanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public static void ReadRooms() 
	
	{
		
		try {
			Scanner RoomsScanner = new Scanner(RoomsFile);
			for (Rooms x: Rooms.values())
			{
				String name = RoomsScanner.next();
				x.setOrdered(RoomsScanner.nextBoolean());
			}
			RoomsScanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public static void ReadOrderHistory() 
	
	{
		
		try {
			Scanner OrderHistoryScanner = new Scanner(OrderHistoryFile);
			while (OrderHistoryScanner.hasNextLine())
				OrderHistoryWindow.OrderHistoryText.append(OrderHistoryScanner.nextLine() + "\n");
				OrderHistoryScanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void WriteEquipment()
	{
	try {
		Scanner EquipmentScanner = new Scanner(EquipmentFile);
		File TempFile = new File("./data/temp.txt");
		PrintWriter printwriter = new PrintWriter(TempFile);
		for (Equipment x: Equipment.values())
		{
			
			String name = EquipmentScanner.next();
			int ordered = EquipmentScanner.nextInt() + x.getOrdered();
			int available = EquipmentScanner.nextInt() - x.getOrdered();
			printwriter.println(name + " " + ordered + " " + available);
		}
		EquipmentFile.delete();
		TempFile.renameTo(EquipmentFile);
		printwriter.close();
		EquipmentScanner.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public static void WriteRooms()
	{
	try {
		Scanner RoomsScanner = new Scanner(RoomsFile);
		File TempFile = new File("./data/temp.txt");
		PrintWriter printwriter = new PrintWriter(TempFile);
		for (Rooms room: Rooms.values())
		{	
			String name = RoomsScanner.next();
			boolean ordered = RoomsScanner.nextBoolean();
			if (room.getSelected() == true) { 
			room.setOrdered(true);
			ordered = room.getOrdered();
			}
			printwriter.println(name + " " + ordered);
		}
		RoomsFile.delete();
		TempFile.renameTo(RoomsFile);
		printwriter.close();
		RoomsScanner.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public static void WriteOrder()
	{
	try {
		TimeFlow.ReservationEndDate = TimeFlow.calendar.getTime();
		FileWriter printwriter = new FileWriter(OrderHistoryFile, true);
		printwriter.append("---------------------------------------------\n");
		printwriter.append("Reservation start: " + TimeFlow.FormatStandard.format(TimeFlow.ReservationStartDate)+ " \n");
		printwriter.append("Reservation end: " + TimeFlow.FormatStandard.format(TimeFlow.ReservationEndDate) + " \n");
		printwriter.append("---------------------------------------------\n");
		for (Equipment x: Equipment.values())
		{
			if (x.getOrdered() != 0)
			printwriter.append(x.getName() + ", ordered:  " + x.getOrdered() + " units \n");
		}
		for (Rooms room: Rooms.values())
		{
			if (room.getSelected() == true)
			{
				printwriter.append(room.getName() + " \n");
			}
		}
		printwriter.append("Order total: " + Main.finalTotal + " EUR\n");
		printwriter.append("---------------------------------------------\n");
		printwriter.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
