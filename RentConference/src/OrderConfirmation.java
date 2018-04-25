import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OrderConfirmation extends Main {
	
	static OrderConfirmation window = new OrderConfirmation();
	static JFrame frame;
	static JTextArea TotalOrder;
	

	 static void On()
	{
		window.frame.setVisible(true);
	}
	 static void Off()
	{
		window.frame.setVisible(false);
	}
	 static void setTotalText()
		{
			TotalOrder.setText("");
			TotalOrder.setFont(new Font("Dialog", Font.PLAIN, 17));
			TotalOrder.setBackground(new Color(153, 204, 204));
			for (Equipment items: Equipment.values()) {
				if(items.getOrdered() != 0)
			TotalOrder.append(items.getName() + " " + items.getOrdered() + " units for " + (items.getPrice() * items.getOrdered()) + " EUR \n");
			}
			TotalOrder.append("For "+ NumberOfDays + " days\n");
			TotalOrder.append("Total: " + finalTotal + " EUR \n");
			TotalOrder.setEditable(false);
			TotalOrder.setBounds(70, 115, 525, 271);
			frame.getContentPane().add(TotalOrder);
		}
	 static void clearTotalText()
	 {
		 TotalOrder.setText("");
	 }
	public OrderConfirmation() {
		frame = new JFrame();
		TotalOrder = new JTextArea();
		frame.getContentPane().setBackground(new Color(153, 204, 204));
		frame.setBackground(new Color(153, 204, 204));
		frame.setResizable(false);
		frame.setTitle("Warning");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 661, 559);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		JTextPane OrderText = new JTextPane();
		OrderText.setFont(new Font("Dialog", Font.BOLD, 30));
		OrderText.setBackground(new Color(153, 204, 204));
		OrderText.setEditable(false);
		OrderText.setText("Your order:");
		OrderText.setBounds(209, 27, 264, 88);
		frame.getContentPane().add(OrderText);
		JTextPane ConfirmationText = new JTextPane();
		ConfirmationText.setText("Are you sure you want to confirm your order?");
		ConfirmationText.setFont(new Font("Dialog", Font.BOLD, 20));
		ConfirmationText.setEditable(false);
		ConfirmationText.setBackground(new Color(153, 204, 204));
		ConfirmationText.setBounds(57, 398, 525, 88);
		frame.getContentPane().add(ConfirmationText);
		
		JButton NoButton = new JButton("No");
		NoButton.setBounds(12, 498, 117, 25);
		frame.getContentPane().add(NoButton);
		NoButton.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent arg0) {
						OrderConfirmation.Off();
						MainWindow.On();
					}
					
				});
		JButton YesButton = new JButton("Yes");
		YesButton.setBounds(532, 498, 117, 25);
		frame.getContentPane().add(YesButton);
		YesButton.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent arg0) {
				TotalOrder.setText("");
				finalTotal = 0;
				OrderConfirmation.Off();
				MainWindow.On();
				JOptionPane.showMessageDialog(null, "Thank you for ordering! Have a nice day!");

			}
			
		});
		
	}
}
