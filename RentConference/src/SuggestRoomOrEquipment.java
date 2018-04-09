import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EnumSet;

import javax.swing.*;

public class SuggestRoomOrEquipment extends Main {
	
	static SuggestRoomOrEquipment window = new SuggestRoomOrEquipment();
	JFrame frame = new JFrame();
	
	
	static void On()
	{
		window.frame.setVisible(true);
	}
	static void Off()
	{
		window.frame.setVisible(false);
		
	}
	public SuggestRoomOrEquipment() {
		frame.setResizable(false);
		frame.setTitle("Rooms");
		frame.setBounds(100, 100, 447, 193);
		frame.getContentPane().setLayout(null);
		JTextPane Text = new JTextPane();
		Text.setEditable(false);
		Text.setFont(new Font("Arial", Font.PLAIN, 20));
		Text.setBounds(60, 30, 334, 70);
		frame.getContentPane().add(Text);
		JButton NoButton = new JButton("No");
		NoButton.setBounds(20, 137, 82, 25);
		frame.getContentPane().add(NoButton);
		JButton YesButton = new JButton("Yes");
		YesButton.setBounds(330, 137, 117, 25);
		frame.getContentPane().add(YesButton);
		if (RoomOrEquipment.equals("Equipment")) {
			Text.setText("Currently your order is " + total +" EUR. Would like to rent a room as well?");
			YesButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					SuggestRoomOrEquipment.Off();
					RoomWindow.On();
				}
			});
		}
			else if (RoomOrEquipment.equals("Room")) {
				Text.setText("Currently your order is " + total +" EUR. Would like to rent equipment as well?");
		YesButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				SuggestRoomOrEquipment.Off();
				EquipmentWindow.On();
			}
		});
			}
		
	}
}
