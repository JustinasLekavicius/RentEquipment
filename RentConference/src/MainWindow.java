import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow{
	
	static MainWindow window = new MainWindow();
	JFrame frame = new JFrame();

	static void On()
	{
		window.frame.setVisible(true);
	}
	static void Off()
	{
		window.frame.setVisible(false);
	}
	public MainWindow() {
		frame.setTitle("Rent Equipment Software V0.01");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		JButton RoomButton = new JButton("Rent a room");
		RoomButton.setBounds(124, 50, 200, 50);
		frame.getContentPane().add(RoomButton);
		JButton EquipmentButton = new JButton("Rent equipment");
		EquipmentButton.setBounds(124, 150, 200, 50);
		frame.getContentPane().add(EquipmentButton);
		JButton AboutButton = new JButton("About....");
		AboutButton.setBounds(333, 0, 117, 25);
		frame.getContentPane().add(AboutButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AboutButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent arg0)
					{
						AboutWindow.On();
					}
				});
		RoomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				MainWindow.Off();
				RoomWindow.On();
			}
		});
		
	}
}
