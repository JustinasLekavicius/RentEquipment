import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow extends OrderWindow {
	
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
		frame.getContentPane().setBackground(new Color(153, 204, 204));
		frame.setBackground(new Color(153, 204, 204));
		frame.setResizable(false);
		frame.setTitle("RentConference");
		frame.setBounds(100, 100, 455, 327);
		frame.getContentPane().setLayout(null);
		JButton NewOrderButton = new JButton("Start a new order");
		NewOrderButton.setBounds(124, 50, 200, 50);
		frame.getContentPane().add(NewOrderButton);
		JButton OrderConfirmationButton = new JButton("Order confirmation");
		OrderConfirmationButton.setBounds(124, 128, 200, 50);
		frame.getContentPane().add(OrderConfirmationButton);
		JButton AboutButton = new JButton("About....");
		AboutButton.setBounds(333, 0, 117, 25);
		frame.getContentPane().add(AboutButton);
		JButton OrderHistoryButton = new JButton("Order history");
		OrderHistoryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		OrderHistoryButton.setBounds(6, 256, 155, 27);
		frame.getContentPane().add(OrderHistoryButton);
		JButton CurrentOrdersButton = new JButton("Current orders");
		CurrentOrdersButton.setBounds(289, 256, 155, 27);
		frame.getContentPane().add(CurrentOrdersButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		AboutButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent arg0)
					{
						AboutWindow.On();
					}
				});
		
		OrderHistoryButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{	OrderHistoryWindow.OrderHistoryText.setText("");
				DataInputOutput.ReadOrderHistory();
				OrderHistoryWindow.On();
			}
		});
		
		CurrentOrdersButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{	CurrentOrdersWindow.CurrentOrdersText.setText("");
				DataInputOutput.ReadCurrentOrders();
				CurrentOrdersWindow.On();
			}
		});
		NewOrderButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (finalTotal != 0 && OrderStarted == true)
				OrderWarningWindow.On();
				else {
					OrderWindow.ClearAllSelections();
				OrderWindow.CheckIfRented();
				DataInputOutput.ReadEquipment();
				DataInputOutput.ReadRooms();
				OrderWindow.setText();
				OrderStarted = true;
				total = 0;
				OrderWindow.RoomButtonGroup.clearSelection();
				MainWindow.Off();
				OrderWindow.On();
				}
			}
		});
		
		OrderConfirmationButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{	if (finalTotal != 0)
			{
				MainWindow.Off();
				OrderConfirmation.On();
			}
			else JOptionPane.showMessageDialog(null, "You have not started your order yet!");
			
			}
			
		});
		
	}
}
