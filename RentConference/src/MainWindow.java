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
		frame.setBounds(100, 100, 450, 300);
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
		
		JButton PastOrderButton = new JButton("Past orders");
		PastOrderButton.setBounds(6, 256, 155, 27);
		frame.getContentPane().add(PastOrderButton);
		
		JButton PendingOrderButton = new JButton("Pending order");
		PendingOrderButton.setBounds(289, 256, 155, 27);
		frame.getContentPane().add(PendingOrderButton);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		AboutButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent arg0)
					{
						AboutWindow.On();
					}
				});
				
		NewOrderButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (OrderStarted == true)
				OrderWarningWindow.On();
				else {
				OrderStarted = true;
				total = 0;
				MainWindow.Off();
				OrderWindow.On();
				}
			}
		});
		
		OrderConfirmationButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				JOptionPane.showMessageDialog(null, "Your current order is " + finalTotal + " EUR.");
			}
		});
		
		
	}
}
