import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EnumSet;

import javax.swing.*;

public class RoomWindow{
	
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
		frame.setTitle("Rent Equipment Software V0.01");
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
				for (Rooms theroom: EnumSet.range(Rooms.auditorija, Rooms.auditorija))
				textArea.setText("The selected room is:\n " + theroom.getName() + "\nthe area is " + theroom.getArea() + " square meters\nthe rent price is " + theroom.getPrice() + " euros for a day.");
			}
		});
		HallButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				for (Rooms theroom: EnumSet.range(Rooms.sale, Rooms.sale))
					textArea.setText("The selected room is:\n " + theroom.getName() + "\nthe area is " + theroom.getArea() + " square meters\nthe rent price is " + theroom.getPrice() + " euros for a day.");
			}
		});
		RoomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				for (Rooms theroom: EnumSet.range(Rooms.kambarys, Rooms.kambarys))
					textArea.setText("The selected room is:\n " + theroom.getName() + "\nthe area is " + theroom.getArea() + " square meters\nthe rent price is " + theroom.getPrice() + " euros for a day.");
			}
		});
		ClassroomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				for (Rooms theroom: EnumSet.range(Rooms.klase, Rooms.klase))
					textArea.setText("The selected room is:\n " + theroom.getName() + "\nthe area is " + theroom.getArea() + " square meters\nthe rent price is " + theroom.getPrice() + " euros for a day.");
			}
		});
		ChamberButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				for (Rooms theroom: EnumSet.range(Rooms.kambariukas, Rooms.kambariukas))
					textArea.setText("The selected room is:\n " + theroom.getName() + "\nthe area is " + theroom.getArea() + " square meters\nthe rent price is " + theroom.getPrice() + " euros for a day.");
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
		
	}
}
