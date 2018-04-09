import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EnumSet;

import javax.swing.*;

public class RoomWindow extends Main{
	
	static RoomWindow window = new RoomWindow();
	JFrame frame = new JFrame();
	static void On()
	{
		window.frame.setVisible(true);
	}
	static void Off()
	{
		window.frame.setVisible(false);
	}
	public RoomWindow() {
		frame.setResizable(false);
		frame.setTitle("Rooms");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		JButton HelpMeButton = new JButton("Help me choose!");
		HelpMeButton.setBounds(106, 230, 200, 44);
		frame.getContentPane().add(HelpMeButton);
		
		JButton AuditoriumButton = new JButton("Auditorium");
		AuditoriumButton.setBounds(12, 26, 117, 25);
		frame.getContentPane().add(AuditoriumButton);
		
		JButton HallButton = new JButton("Hall");
		HallButton.setBounds(12, 100, 117, 25);
		frame.getContentPane().add(HallButton);
		
		JButton RoomButton = new JButton("Room");
		RoomButton.setBounds(12, 63, 117, 25);
		frame.getContentPane().add(RoomButton);
		
		JButton BackButton = new JButton("Back");
		BackButton.setBounds(12, 249, 82, 25);
		frame.getContentPane().add(BackButton);
		
		JButton NextButton = new JButton("Next");
		NextButton.setBounds(321, 240, 117, 25);
		frame.getContentPane().add(NextButton);
		
		TextArea textArea = new TextArea();
		textArea.setText("Please select a room");
		textArea.setEditable(false);
		textArea.setBounds(134, 38, 304, 186);
		frame.getContentPane().add(textArea);
		
		JButton ClassroomButton = new JButton("Classroom");
		ClassroomButton.setBounds(12, 174, 117, 25);
		frame.getContentPane().add(ClassroomButton);
		
		JButton ChamberButton = new JButton("Chamber");
		ChamberButton.setBounds(12, 137, 117, 25);
		frame.getContentPane().add(ChamberButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		AuditoriumButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
					textArea.setText("The selected room is:\n" + Rooms.auditorija.getName() + "\nthe room can fit " + Rooms.auditorija.getArea() + " people\nthe rent price is " + Rooms.auditorija.getPrice() + " euros for a day.");
			}
		});
		HallButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
					textArea.setText("The selected room is:\n" + Rooms.sale.getName() + "\nthe room can fit " + Rooms.sale.getArea() + " people\nthe rent price is " + Rooms.sale.getPrice() + " euros for a day.");
			}
		});
		RoomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
					textArea.setText("The selected room is:\n" + Rooms.kambarys.getName() + "\nthe room can fit " + Rooms.kambarys.getArea() + " people\nthe rent price is " + Rooms.kambarys.getPrice() + " euros for a day.");
			}
		});
		ClassroomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
					textArea.setText("The selected room is:\n" + Rooms.klase.getName() + "\nthe room can fit " + Rooms.klase.getArea() + " people\nthe rent price is " + Rooms.klase.getPrice() + " euros for a day.");
			}
		});
		ChamberButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
					textArea.setText("The selected room is:\n" + Rooms.kambariukas.getName() + "\nthe room can fit " + Rooms.kambariukas.getArea() + " people\nthe rent price is " + Rooms.kambariukas.getPrice() + " euros for a day.");
			}
		});
		BackButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				
				RoomWindow.Off();
				MainWindow.On();
			}
		});
		HelpMeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				
				RoomWindow.Off();
				HelpMeChoose.On();
			}
		});
		NextButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				RoomOrEquipment = "Room";
				RoomWindow.Off();
				SuggestRoomOrEquipment.On();
			}
		});
	}
}
