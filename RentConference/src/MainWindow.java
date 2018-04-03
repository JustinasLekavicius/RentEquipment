import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JToolBar;
//TEST NIGGA

public class MainWindow extends Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
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
		
		JButton RoomButton = new JButton("Rent a room");
		RoomButton.setBounds(124, 50, 200, 50);
		frame.getContentPane().add(RoomButton);
		
		JButton EquipmentButton = new JButton("Rent equipment");
		EquipmentButton.setBounds(124, 150, 200, 50);
		frame.getContentPane().add(EquipmentButton);
	}
}
