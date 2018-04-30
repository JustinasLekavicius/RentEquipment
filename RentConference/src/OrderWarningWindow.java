import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OrderWarningWindow extends Main {
	
	static OrderWarningWindow window = new OrderWarningWindow();
	JFrame frame = new JFrame();
	
	static void On()
	{
		window.frame.setVisible(true);
	}
	static void Off()
	{
		window.frame.setVisible(false);
	}
	
	public OrderWarningWindow() {
		frame.getContentPane().setBackground(new Color(153, 204, 204));
		frame.setBackground(new Color(153, 204, 204));
		frame.setResizable(false);
		frame.setTitle("Warning");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 495, 192);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		JTextPane WarningText = new JTextPane();
		WarningText.setFont(new Font("Dialog", Font.BOLD, 20));
		WarningText.setBackground(new Color(153, 204, 204));
		WarningText.setEditable(false);
		WarningText.setText("You have an unfinished order, do you wish to start a new one?");
		WarningText.setBounds(46, 12, 426, 88);
		frame.getContentPane().add(WarningText);
		
		JButton NoButton = new JButton("No");
		NoButton.setBounds(46, 112, 117, 25);
		frame.getContentPane().add(NoButton);
		NoButton.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent arg0) {
						OrderWarningWindow.Off();
					}
					
				});
		JButton YesButton = new JButton("Yes");
		YesButton.setBounds(344, 112, 117, 25);
		frame.getContentPane().add(YesButton);
		YesButton.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent arg0) {
				total = 0;
				OrderWarningWindow.Off();
				MainWindow.Off();
				OrderWindow.ClearAllSelections();
				DataInputOutput.ReadRooms();
				DataInputOutput.ReadEquipment();
				OrderWindow.On();
			}
			
		});
	}
}
