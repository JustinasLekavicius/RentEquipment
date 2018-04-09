import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Choice;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.List;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JTextPane;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.DropMode;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;

import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class HelpMeChoose {

	private JTextField txtmoniSkaiius;
	private JTextField txtTypeOfEvent;
	private JTextField txtData;
	private JTextField txtPradia;
	private JTextField txtPabaiga;

	static HelpMeChoose window = new HelpMeChoose();
	JFrame frame = new JFrame();
	private JButton btnChoose;
	static void On()
	{
		window.frame.setVisible(true);
	}
	static void Off()
	{
		window.frame.setVisible(false);
	}
	public HelpMeChoose() {
			frame.setBounds(100, 100, 337, 395);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			txtmoniSkaiius = new JTextField();
			txtmoniSkaiius.setText("Number of people");
			txtmoniSkaiius.setEditable(false);
			txtmoniSkaiius.setColumns(10);
			txtmoniSkaiius.setBounds(12, 83, 126, 22);
			frame.getContentPane().add(txtmoniSkaiius);
			
			txtTypeOfEvent = new JTextField();
			txtTypeOfEvent.setText("Type of event");
			txtTypeOfEvent.setEditable(false);
			txtTypeOfEvent.setColumns(10);
			txtTypeOfEvent.setBounds(12, 13, 126, 22);
			frame.getContentPane().add(txtTypeOfEvent);
			
			JSpinner spinner = new JSpinner();
			spinner.setModel(new SpinnerListModel(new String[] {"Conference", "VU SA meeting", "Open discusion", "lecture", "Student for Student (SS)", "Other"}));
			spinner.setBounds(12, 48, 126, 22);
			frame.getContentPane().add(spinner);
			
			JSpinner spinner_1 = new JSpinner();
			spinner_1.setModel(new SpinnerNumberModel(10, 0, 200, 10));
			spinner_1.setBounds(12, 118, 126, 22);
			frame.getContentPane().add(spinner_1);
			
			txtData = new JTextField();
			txtData.setText("Reservation time:");
			txtData.setEditable(false);
			txtData.setColumns(10);
			txtData.setBounds(12, 153, 126, 22);
			frame.getContentPane().add(txtData);
			
			JSpinner spinner_2 = new JSpinner();
			spinner_2.addInputMethodListener(new InputMethodListener() {
				public void caretPositionChanged(InputMethodEvent arg0) {
				}
			});
			spinner_2.setModel(new SpinnerDateModel(new Date(1523221200000L), null, null, Calendar.HOUR));
			spinner_2.setBounds(163, 193, 120, 22);
			frame.getContentPane().add(spinner_2);
			
			txtPradia = new JTextField();
			txtPradia.setText("Start");
			txtPradia.setEditable(false);
			txtPradia.setColumns(10);
			txtPradia.setBounds(12, 193, 126, 22);
			frame.getContentPane().add(txtPradia);
			
			txtPabaiga = new JTextField();
			txtPabaiga.setText("End");
			txtPabaiga.setEditable(false);
			txtPabaiga.setColumns(10);
			txtPabaiga.setBounds(12, 225, 126, 22);
			frame.getContentPane().add(txtPabaiga);
			
			JSpinner spinner_3 = new JSpinner();
			spinner_3.setModel(new SpinnerDateModel(new Date(1523221200000L), null, null, Calendar.SECOND));
			spinner_3.setBounds(163, 225, 120, 22);
			frame.getContentPane().add(spinner_3);
			
			JButton btnNewButton = new JButton("Back");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					RoomWindow backButton = new RoomWindow();
					RoomWindow.On();
					HelpMeChoose.Off();
				}
			});
			btnNewButton.setBounds(6, 288, 97, 25);
			frame.getContentPane().add(btnNewButton);
			
			btnChoose = new JButton("Choose");
			btnChoose.setBounds(199, 288, 97, 25);
			frame.getContentPane().add(btnChoose);
		}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	}
	
