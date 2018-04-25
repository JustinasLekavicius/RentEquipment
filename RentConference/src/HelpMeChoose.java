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
import javax.swing.JTextArea;
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
import java.awt.Font;

public class HelpMeChoose {

	static HelpMeChoose window = new HelpMeChoose();
	JFrame frame = new JFrame();
	static void On()
	{
		window.frame.setVisible(true);
	}
	static void Off()
	{
		window.frame.setVisible(false);
	}
	public HelpMeChoose() {
		frame.setTitle("Help me choose!");
			frame.getContentPane().setBackground(new Color(153, 204, 204));
			frame.setBackground(new Color(153, 204, 204));
			frame.setBounds(100, 100, 337, 395);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JTextArea TextTypeOfEvent = new JTextArea();
			TextTypeOfEvent.setFont(new Font("Dialog", Font.PLAIN, 16));
			TextTypeOfEvent.setBackground(new Color(153, 204, 204));
			TextTypeOfEvent.setText("Type of event");
			TextTypeOfEvent.setEditable(false);
			TextTypeOfEvent.setColumns(10);
			TextTypeOfEvent.setBounds(12, 13, 126, 22);
			frame.getContentPane().add(TextTypeOfEvent);
			
			JSpinner TypeOfEventSpinner = new JSpinner();
			TypeOfEventSpinner.setModel(new SpinnerListModel(new String[] {"Conference", "VU SA meeting", "Open discusion", "Lecture", "Student for Student (SS)", "Other"}));
			TypeOfEventSpinner.setBounds(12, 48, 271, 22);
			frame.getContentPane().add(TypeOfEventSpinner);
			
			JTextArea TextNumberOfPeople = new JTextArea();
			TextNumberOfPeople.setFont(new Font("Dialog", Font.PLAIN, 16));
			TextNumberOfPeople.setBackground(new Color(153, 204, 204));
			TextNumberOfPeople.setText("Number of people");
			TextNumberOfPeople.setEditable(false);
			TextNumberOfPeople.setColumns(10);
			TextNumberOfPeople.setBounds(12, 83, 150, 22);
			frame.getContentPane().add(TextNumberOfPeople);
			
			JSpinner NumberOfPeopleSpinner = new JSpinner();
			NumberOfPeopleSpinner.setModel(new SpinnerNumberModel(10, 0, 200, 10));
			NumberOfPeopleSpinner.setBounds(12, 118, 150, 22);
			frame.getContentPane().add(NumberOfPeopleSpinner);
			
			JButton BackButton = new JButton("Back");
			BackButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					OrderWindow.On();
					HelpMeChoose.Off();
				}
			});
			BackButton.setBounds(6, 358, 97, 25);
			frame.getContentPane().add(BackButton);
			
			JButton ChooseButton = new JButton("Choose");
			ChooseButton.setBounds(228, 358, 97, 25);
			frame.getContentPane().add(ChooseButton);
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
	
