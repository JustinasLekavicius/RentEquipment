import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import java.awt.Font;
//NOT YET AVAILABLE FOR USE
public class AvailableRooms {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AvailableRooms window = new AvailableRooms();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AvailableRooms() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton backButton = new JButton("BACK");
		backButton.setBounds(12, 239, 117, 25);
		frame.getContentPane().add(backButton);
		
		JTextPane txtpnRoomsAvailableTo = new JTextPane();
		txtpnRoomsAvailableTo.setText("Rooms available for rent");
		txtpnRoomsAvailableTo.setFont(new Font("Dialog", Font.BOLD, 20));
		for (Rooms kambariai: Rooms.values())
		{
		txtpnRoomsAvailableTo.setText("Kambarys1");
		}
		txtpnRoomsAvailableTo.setBounds(69, 38, 311, 51);
		frame.getContentPane().add(txtpnRoomsAvailableTo);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(56, 125, 321, 96);
		frame.getContentPane().add(textPane);
	}
}
