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
		frame.getContentPane().setBackground(new Color(153, 204, 204));
		frame.setBackground(new Color(153, 204, 204));
		frame.setResizable(false);
		frame.setTitle("Credits");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 440, 112);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		JTextPane credits = new JTextPane();
		credits.setFont(new Font("Dialog", Font.BOLD, 14));
		credits.setBackground(new Color(153, 204, 204));
		credits.setEditable(false);
		credits.setText("Developed by Justinas Lekavičius and Vytenis Alaburda of Mathematics and Informatics Faculty (Vilnius University)");
		credits.setBounds(12, 12, 426, 88);
		frame.getContentPane().add(credits);

	}
}
