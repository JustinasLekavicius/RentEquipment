import java.awt.*;
import javax.swing.*;

public class OrderHistoryWindow {
	
	static OrderHistoryWindow window = new OrderHistoryWindow();
	JFrame frame = new JFrame();
	static TextArea OrderHistoryText;
	
	static void On()
	{
		window.frame.setVisible(true);
	}
	static void Off()
	{
		window.frame.setVisible(false);
	}
	
	public OrderHistoryWindow() {
		frame.getContentPane().setBackground(new Color(153, 204, 204));
		frame.setBackground(new Color(153, 204, 204));
		frame.setResizable(false);
		frame.setTitle("Order history");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 711, 475);
		frame.getContentPane().setLayout(null);
		
		OrderHistoryText = new TextArea();
		OrderHistoryText.setEditable(false);
		OrderHistoryText.setBounds(10, 30, 691, 435);
		frame.getContentPane().add(OrderHistoryText);
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

	}
}
