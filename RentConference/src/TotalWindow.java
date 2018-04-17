import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EnumSet;

import javax.swing.*;

public class TotalWindow extends Main {
	
	static TotalWindow window = new TotalWindow();
	JFrame frame = new JFrame();
	
	
	static void On()
	{
		window.frame.setVisible(true);
	}
	static void Off()
	{
		window.frame.setVisible(false);
		
	}
	public TotalWindow() {
		frame.setResizable(false);
		frame.setTitle("Total");
		frame.setBounds(100, 100, 447, 193);
		frame.getContentPane().setLayout(null);
		JTextPane Text = new JTextPane();
		Text.setEditable(false);
		Text.setFont(new Font("Arial", Font.PLAIN, 20));
		Text.setBounds(60, 30, 334, 70);
		frame.getContentPane().add(Text);
		JButton OkButton = new JButton("OK");
		OkButton.setBounds(162, 137, 117, 25);
		Text.setText("The total order is " + total + "EUR.");
		frame.getContentPane().add(OkButton);
			OkButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					TotalWindow.Off();
					MainWindow.On();
				}
		
		
	
});
	}
}
