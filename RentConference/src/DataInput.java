import java.io.File;
import java.util.Formatter;

import javax.swing.JOptionPane;

public class DataInput {
	
	private Formatter RoomFormatter;
	private Formatter EquipmentFormatter;
	
	public static void ReadRoom()
	{
		File Rooms = new File("./data/rooms.txt");
		File Equipment = new File("./data/equipment.txt");
		if (!Rooms.exists())
		{
			JOptionPane.showMessageDialog(null, Rooms.getName() + " doesn't exist!");
		}
		if (!Equipment.exists())
		{
			JOptionPane.showMessageDialog(null, Equipment.getName() + " doesn't exist!");
		}
	}
}
