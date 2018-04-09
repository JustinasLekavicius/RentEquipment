import java.awt.*;
import javax.swing.*;

public class AboutWindow {
	
	static AboutWindow window = new AboutWindow();
	JFrame frame = new JFrame();
	
	static void On()
	{
		window.frame.setVisible(true);
	}
	static void Off()
	{
		window.frame.setVisible(false);
	}
	
	public AboutWindow() {
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 100);
		frame.getContentPane().setLayout(null);
		
		JTextPane credits = new JTextPane();
		credits.setEditable(false);
		credits.setText("Developed by Justinas Lekavičius and Vytenis Alaburda of Mathematics and Informatics Faculty (Vilnius University)");
		credits.setBounds(12, 12, 426, 276);
		frame.getContentPane().add(credits);

	}
}
