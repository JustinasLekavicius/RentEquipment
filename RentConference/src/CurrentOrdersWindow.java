import java.awt.*;
import javax.swing.*;

public class CurrentOrdersWindow {
	
	static CurrentOrdersWindow window = new CurrentOrdersWindow();
	JFrame frame = new JFrame();
	static TextArea CurrentOrdersText;
	
	static void On()
	{
		window.frame.setVisible(true);
	}
	static void Off()
	{
		window.frame.setVisible(false);
	}
	
	public CurrentOrdersWindow() {
		frame.getContentPane().setBackground(new Color(153, 204, 204));
		frame.setBackground(new Color(153, 204, 204));
		frame.setResizable(false);
		frame.setTitle("Current orders");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 711, 475);
		frame.getContentPane().setLayout(null);
		CurrentOrdersText = new TextArea();
		CurrentOrdersText.setEditable(false);
		CurrentOrdersText.setBounds(10, 30, 691, 435);
		frame.getContentPane().add(CurrentOrdersText);
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

	}
}
