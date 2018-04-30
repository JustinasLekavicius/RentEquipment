import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EnumSet;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
public class OrderWindow extends TotalCalculation {
	
	static OrderWindow window = new OrderWindow();
    static JFrame frame;
    static JLabel StartDateText;
    static JLabel EndDateText;
    static JButton StartPlusButton;
    static JButton StartMinusButton;
    static JButton EndPlusButton;
    static JButton EndMinusButton;
    static JRadioButton AuditoriumButton;
    static JRadioButton BigHallButton;
	static JRadioButton MediumSizedRoomButton;
	static JRadioButton MediumSizedClassroomButton;
	static JRadioButton SmallRoomButton;
	static ButtonGroup RoomButtonGroup;
	static JTextPane ProjectorText;
    static JTextPane LargeSpeakerText;
    static JTextPane LaserPointerText;
	static JTextPane MicrophoneText;
	static JTextPane WhiteBoardText;
	static JTextPane ProjectionScreenText;
	static JTextPane AmplifierText;
	static JSpinner ProjectorSpinner;
	static JSpinner LargeSpeakerSpinner;
	static JSpinner LaserPointerSpinner;
	static JSpinner MicrophoneSpinner;
	static JSpinner WhiteBoardSpinner;
	static JSpinner ProjectionScreenSpinner;
	static JSpinner AmplifierSpinner;
	static JSpinner NumberOfDaysSpinner;
	static void On()
	{
		window.frame.setVisible(true);
		
	}
	static void Off()
	{
		window.frame.setVisible(false);

	}
	static void setText()
	{
		ProjectorText.setText(Equipment.projector.getName() + " (" + Equipment.projector.getPrice() + " EUR), available: " + Equipment.projector.getAvailable());
		LargeSpeakerText.setText(Equipment.largespeaker.getName() + " (" + Equipment.largespeaker.getPrice() + " EUR), available: " + Equipment.largespeaker.getAvailable());
		LaserPointerText.setText(Equipment.laserpointer.getName() + " (" + Equipment.laserpointer.getPrice() + " EUR), available: " + Equipment.laserpointer.getAvailable());
		MicrophoneText.setText(Equipment.microphone.getName() + " (" + Equipment.microphone.getPrice() + " EUR), available: " + Equipment.microphone.getAvailable());
		WhiteBoardText.setText(Equipment.whiteboard.getName() + " (" + Equipment.whiteboard.getPrice() + " EUR), available: " + Equipment.whiteboard.getAvailable());
		ProjectionScreenText.setText(Equipment.tripodscreen.getName() + " (" + Equipment.tripodscreen.getPrice() + " EUR), available: " + Equipment.tripodscreen.getAvailable());
		AmplifierText.setText(Equipment.amplifier.getName() + " (" + Equipment.amplifier.getPrice() + " EUR), available: " + Equipment.amplifier.getAvailable());

	}
	static void CheckIfRented()
	{
		if (Rooms.auditorium.getOrdered() == true)
		{
			AuditoriumButton.setEnabled(false);
		}
		else AuditoriumButton.setEnabled(true);
		
		if (Rooms.bighall.getOrdered() == true)
		{
			BigHallButton.setEnabled(false);
		}
		else BigHallButton.setEnabled(true);
		
		if (Rooms.mediumsizedroom.getOrdered() == true)
		{
			MediumSizedRoomButton.setEnabled(false);
		}
		else MediumSizedRoomButton.setEnabled(true);
		
		if (Rooms.mediumsizedclassroom.getOrdered() == true)
		{
			MediumSizedClassroomButton.setEnabled(false);
		}
		else MediumSizedClassroomButton.setEnabled(true);
		
		if (Rooms.smallroom.getOrdered() == true)
		{
			SmallRoomButton.setEnabled(false);
		}
		else SmallRoomButton.setEnabled(true);
	}
	
	static void ClearAllSelections()
	{
		RoomButtonGroup.clearSelection();
		ProjectorSpinner.setValue(0);
		LargeSpeakerSpinner.setValue(0);
		LaserPointerSpinner.setValue(0);
		MicrophoneSpinner.setValue(0);
		WhiteBoardSpinner.setValue(0);
		ProjectionScreenSpinner.setValue(0);
		AmplifierSpinner.setValue(0);
		NumberOfDaysSpinner.setValue(1);
	}
	static void SetOrderedValues()
	{
		Equipment.projector.setOrdered((int) ProjectorSpinner.getValue());
		Equipment.largespeaker.setOrdered((int) LargeSpeakerSpinner.getValue());
		Equipment.laserpointer.setOrdered((int) LaserPointerSpinner.getValue());
		Equipment.microphone.setOrdered((int) MicrophoneSpinner.getValue());
		Equipment.whiteboard.setOrdered((int) WhiteBoardSpinner.getValue());
		Equipment.tripodscreen.setOrdered((int) ProjectionScreenSpinner.getValue());
		Equipment.amplifier.setOrdered((int) AmplifierSpinner.getValue());
	}
	public OrderWindow() {
	    
	    TimeFlow.ReservationStartDate = (Date) TimeFlow.getCurrentDate();
	    TimeFlow.ReservationEndDate = (Date) TimeFlow.getCurrentDate();
	    TimeFlow.calendar = Calendar.getInstance();
	    TimeFlow.calendar.setTime(TimeFlow.getCurrentDate());
	    
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 204));
		frame.setBackground(new Color(153, 204, 204));
		frame.setResizable(false);
		frame.setTitle("Order window");
		frame.setBounds(100, 100, 856, 546);
		frame.getContentPane().setLayout(null);
				
		JTextArea TextRoom = new JTextArea();
		TextRoom.setFont(new Font("Dialog", Font.PLAIN, 17));
		TextRoom.setBackground(new Color(153, 204, 204));
		TextRoom.setText("Please select a room.");
		TextRoom.setEditable(false);
		TextRoom.setBounds(524, 38, 304, 136);
		frame.getContentPane().add(TextRoom);
	
		AuditoriumButton = new JRadioButton ("Auditorium");
		AuditoriumButton.setFont(new Font("Dialog", Font.BOLD, 10));
		AuditoriumButton.setBackground(new Color(153, 204, 204));
		AuditoriumButton.setBounds(378, 38, 138, 25);
		frame.getContentPane().add(AuditoriumButton);
		
		BigHallButton = new JRadioButton ("Big Hall");
		BigHallButton.setFont(new Font("Dialog", Font.BOLD, 10));
		BigHallButton.setBackground(new Color(153, 204, 204));
		BigHallButton.setBounds(378, 112, 138, 25);
		frame.getContentPane().add(BigHallButton);
		
		MediumSizedRoomButton = new JRadioButton ("Medium sized room");
		MediumSizedRoomButton.setFont(new Font("Dialog", Font.BOLD, 10));
		MediumSizedRoomButton.setBackground(new Color(153, 204, 204));
		MediumSizedRoomButton.setBounds(378, 75, 138, 25);
		frame.getContentPane().add(MediumSizedRoomButton);		
		
		MediumSizedClassroomButton = new JRadioButton("Medium sized classroom");
		MediumSizedClassroomButton.setFont(new Font("Dialog", Font.BOLD, 10));
		MediumSizedClassroomButton.setBackground(new Color(153, 204, 204));
		MediumSizedClassroomButton.setBounds(378, 186, 178, 25);
		frame.getContentPane().add(MediumSizedClassroomButton);
		
		SmallRoomButton = new JRadioButton("Small room");
		SmallRoomButton.setFont(new Font("Dialog", Font.BOLD, 10));
		SmallRoomButton.setBackground(new Color(153, 204, 204));
		SmallRoomButton.setBounds(378, 149, 138, 25);
		frame.getContentPane().add(SmallRoomButton);
		
		RoomButtonGroup = new ButtonGroup();
		
		RoomButtonGroup.add(MediumSizedClassroomButton);
		RoomButtonGroup.add(SmallRoomButton);
		RoomButtonGroup.add(AuditoriumButton);
		RoomButtonGroup.add(BigHallButton);
		RoomButtonGroup.add(MediumSizedRoomButton);
		
		JButton HelpMeButton = new JButton("Help me choose!");
		HelpMeButton.setBounds(563, 230, 200, 44);
		frame.getContentPane().add(HelpMeButton);
		
		JButton BackButton = new JButton("Back");
		BackButton.setBounds(12, 460, 82, 25);
		frame.getContentPane().add(BackButton);
		
		JButton NextButton = new JButton("Next");
		NextButton.setBounds(711, 460, 117, 25);
		frame.getContentPane().add(NextButton);
		
		JTextArea TotalText = new JTextArea();
		TotalText.setBackground(new Color(153, 204, 204));
		TotalText.setFont(new Font("Dialog", Font.PLAIN, 12));
		TotalText.setEditable(false);
		TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
		TotalText.setBounds(650, 407, 178, 32);
		frame.getContentPane().add(TotalText);
		
		ProjectorText = new JTextPane();
		ProjectorText.setEditable(false);
		ProjectorText.setBackground(new Color(153, 204, 204));
		ProjectorText.setBounds(77, 75, 156, 44);
		frame.getContentPane().add(ProjectorText);
		
		LargeSpeakerText = new JTextPane();
		LargeSpeakerText.setEditable(false);
		LargeSpeakerText.setBackground(new Color(153, 204, 204));
		LargeSpeakerText.setBounds(77, 120, 156, 54);
		frame.getContentPane().add(LargeSpeakerText);
		
		LaserPointerText = new JTextPane();
		LaserPointerText.setEditable(false);
		LaserPointerText.setBackground(new Color(153, 204, 204));
		LaserPointerText.setBounds(77, 168, 212, 55);
		frame.getContentPane().add(LaserPointerText);
		
		MicrophoneText = new JTextPane();
		MicrophoneText.setEditable(false);
		MicrophoneText.setBackground(new Color(153, 204, 204));
		MicrophoneText.setBounds(77, 219, 191, 51);
		frame.getContentPane().add(MicrophoneText);
		
		WhiteBoardText = new JTextPane();
		WhiteBoardText.setEditable(false);
		WhiteBoardText.setBackground(new Color(153, 204, 204));
		WhiteBoardText.setBounds(77, 326, 218, 56);
		frame.getContentPane().add(WhiteBoardText);
		
		ProjectionScreenText = new JTextPane();
		ProjectionScreenText.setEditable(false);
		ProjectionScreenText.setBackground(new Color(153, 204, 204));
		ProjectionScreenText.setBounds(77, 377, 218, 44);
		frame.getContentPane().add(ProjectionScreenText);
		
		AmplifierText = new JTextPane();
		AmplifierText.setEditable(false);
		AmplifierText.setBackground(new Color(153, 204, 204));
		AmplifierText.setBounds(77, 274, 156, 56);
		frame.getContentPane().add(AmplifierText);
		
		ProjectorSpinner = new JSpinner();
		ProjectorSpinner.setEditor(new JSpinner.DefaultEditor(ProjectorSpinner));
		ProjectorSpinner.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent arg0) {
				if ((int) ProjectorSpinner.getValue() <= Equipment.projector.getAvailable()) {
				ProjectorCosts = (int) ProjectorSpinner.getValue() * Equipment.projector.getPrice();
	TotalCalculation.CalculateTotal();				
	TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
				}
				else ProjectorSpinner.setValue(Equipment.projector.getAvailable());
	}
		});
		ProjectorSpinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		ProjectorSpinner.setBounds(12, 77, 53, 20);
		frame.getContentPane().add(ProjectorSpinner);
		
		LargeSpeakerSpinner = new JSpinner();
		LargeSpeakerSpinner.setEditor(new JSpinner.DefaultEditor(LargeSpeakerSpinner));
		LargeSpeakerSpinner.addChangeListener(new ChangeListener()
		{

			public void stateChanged(ChangeEvent arg0) {
				if ((int) LargeSpeakerSpinner.getValue() <= Equipment.largespeaker.getAvailable()) {
				LargeSpeakerCosts = (int) LargeSpeakerSpinner.getValue() * Equipment.largespeaker.getPrice();
	TotalCalculation.CalculateTotal();				
	TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
				}
				else LargeSpeakerSpinner.setValue(Equipment.largespeaker.getAvailable());
	}
		});
		LargeSpeakerSpinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		LargeSpeakerSpinner.setBounds(12, 127, 53, 20);
		frame.getContentPane().add(LargeSpeakerSpinner);
		
		LaserPointerSpinner = new JSpinner();
		LaserPointerSpinner.setEditor(new JSpinner.DefaultEditor(LaserPointerSpinner));

		LaserPointerSpinner.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent arg0) {
				if ((int) LaserPointerSpinner.getValue() <= Equipment.laserpointer.getAvailable()) {
				LaserPointerCosts = (int) LaserPointerSpinner.getValue() * Equipment.laserpointer.getPrice();
	TotalCalculation.CalculateTotal();				
	TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
				}
				else LaserPointerSpinner.setValue(Equipment.laserpointer.getAvailable());
			}
		});
		LaserPointerSpinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		LaserPointerSpinner.setBounds(12, 174, 53, 20);
		frame.getContentPane().add(LaserPointerSpinner);
		
		MicrophoneSpinner = new JSpinner();
		MicrophoneSpinner.setEditor(new JSpinner.DefaultEditor(MicrophoneSpinner));
		MicrophoneSpinner.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent arg0) {
				if ((int) MicrophoneSpinner.getValue() <= Equipment.microphone.getAvailable()) {
				MicrophoneCosts = (int) MicrophoneSpinner.getValue() * Equipment.microphone.getPrice();
	TotalCalculation.CalculateTotal();				
	TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
				}
				else MicrophoneSpinner.setValue(Equipment.microphone.getAvailable());
			}
		});
		MicrophoneSpinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		MicrophoneSpinner.setBounds(12, 230, 53, 20);
		frame.getContentPane().add(MicrophoneSpinner);
		
		WhiteBoardSpinner = new JSpinner();
		WhiteBoardSpinner.setEditor(new JSpinner.DefaultEditor(WhiteBoardSpinner));
		WhiteBoardSpinner.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent arg0) {
				if ((int) WhiteBoardSpinner.getValue() <= Equipment.whiteboard.getAvailable()) {
				WhiteBoardCosts = (int) WhiteBoardSpinner.getValue() * Equipment.whiteboard.getPrice();
	TotalCalculation.CalculateTotal();				
	TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
				}
				else WhiteBoardSpinner.setValue(Equipment.whiteboard.getAvailable());
	}
		});
		WhiteBoardSpinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		WhiteBoardSpinner.setBounds(12, 330, 53, 20);
		frame.getContentPane().add(WhiteBoardSpinner);
		
		AmplifierSpinner = new JSpinner();
		AmplifierSpinner.setEditor(new JSpinner.DefaultEditor(AmplifierSpinner));
		AmplifierSpinner.addChangeListener(new ChangeListener()
				{
			public void stateChanged(ChangeEvent arg0) {
				if ((int) AmplifierSpinner.getValue() <= Equipment.amplifier.getAvailable()) {
				AmplifierCosts = (int) AmplifierSpinner.getValue() * Equipment.amplifier.getPrice();
	TotalCalculation.CalculateTotal();				
	TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
				}
				else AmplifierSpinner.setValue(Equipment.amplifier.getAvailable());
			}
				});
		AmplifierSpinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		AmplifierSpinner.setBounds(12, 284, 53, 20);
		frame.getContentPane().add(AmplifierSpinner);
		
		ProjectionScreenSpinner = new JSpinner();
		ProjectionScreenSpinner.setEditor(new JSpinner.DefaultEditor(ProjectionScreenSpinner));
		ProjectionScreenSpinner.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent arg0) {
				if ((int) ProjectionScreenSpinner.getValue() <= Equipment.tripodscreen.getAvailable()) {
				ProjectionScreenCosts = (int) ProjectionScreenSpinner.getValue() * Equipment.tripodscreen.getPrice();
	TotalCalculation.CalculateTotal();				
	TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
				}
				else ProjectionScreenSpinner.setValue(Equipment.tripodscreen.getAvailable());
	}

		});
		ProjectionScreenSpinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		ProjectionScreenSpinner.setBounds(12, 377, 53, 20);
		frame.getContentPane().add(ProjectionScreenSpinner);
		
		JTextArea EquipmentText = new JTextArea();
		EquipmentText.setText("Please select the needed equipment.");
		EquipmentText.setFont(new Font("Dialog", Font.PLAIN, 17));
		EquipmentText.setEditable(false);
		EquipmentText.setBackground(new Color(153, 204, 204));
		EquipmentText.setBounds(25, 31, 345, 32);
		frame.getContentPane().add(EquipmentText);
		
		JTextArea NumberOfDaysText = new JTextArea();
		NumberOfDaysText.setText("Number of days:");
		NumberOfDaysText.setFont(new Font("Dialog", Font.PLAIN, 20));
		NumberOfDaysText.setEditable(false);
		NumberOfDaysText.setBackground(new Color(153, 204, 204));
		NumberOfDaysText.setBounds(327, 389, 178, 32);
		frame.getContentPane().add(NumberOfDaysText);
		
		NumberOfDaysSpinner = new JSpinner();
		NumberOfDaysSpinner.setValue(1);
		NumberOfDaysSpinner.setEditor(new JSpinner.DefaultEditor(NumberOfDaysSpinner));
		NumberOfDaysSpinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		NumberOfDaysSpinner.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent arg0) {
				NumberOfDays = (int) NumberOfDaysSpinner.getValue();
	TotalCalculation.CalculateTotal();				
	TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
			}
		});
		NumberOfDaysSpinner.setBounds(503, 394, 53, 20);
		frame.getContentPane().add(NumberOfDaysSpinner);
		
		StartDateText = new JLabel("Start date goes here.");
		StartDateText.setEnabled(false);
		StartDateText.setFont(new Font("Arial", Font.BOLD, 17));
		StartDateText.setText(TimeFlow.FormatStandard.format(TimeFlow.ReservationStartDate));
		StartDateText.setForeground(Color.BLACK);
		StartDateText.setBackground(Color.DARK_GRAY);
		StartDateText.setBounds(201, 455, 138, 24);
		frame.getContentPane().add(StartDateText);
	
		StartPlusButton = new JButton("+");
		StartPlusButton.setEnabled(false);
		StartPlusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TimeFlow.calendar.add(Calendar.DATE, 1);
				TimeFlow.ReservationStartDate = (Date) TimeFlow.calendar.getTime();
				StartDateText.setText(TimeFlow.FormatStandard.format(TimeFlow.calendar.getTime()));
				}
			
		});
		StartPlusButton.setBounds(357, 434, 53, 25);
		frame.getContentPane().add(StartPlusButton);
		
		StartMinusButton = new JButton("-");
		StartMinusButton.setEnabled(false);
		StartMinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (TimeFlow.FormatStandard.format (TimeFlow.calendar.getTime()).equals(TimeFlow.FormatStandard.format(TimeFlow.ReservationStartDate)))
					JOptionPane.showMessageDialog(null, "Sorry, you cannot travel back in time. Try going 88 miles per hour.");
				else {
					TimeFlow.calendar.add(Calendar.DATE, -1);
				StartDateText.setText(TimeFlow.FormatStandard.format(TimeFlow.calendar.getTime()));
				}
				}
			});
		
		StartMinusButton.setBounds(357, 460, 53, 25);
		frame.getContentPane().add(StartMinusButton);
		
		JLabel ReservationStartText = new JLabel("Reservation start");
		ReservationStartText.setEnabled(false);
		ReservationStartText.setBounds(193, 434, 146, 16);
		frame.getContentPane().add(ReservationStartText);
		
		JLabel ReservationEndText = new JLabel("Reservation end");
		ReservationEndText.setEnabled(false);
		ReservationEndText.setBounds(422, 434, 146, 16);
		frame.getContentPane().add(ReservationEndText);
		
		EndDateText = new JLabel("End date goes here.");
		EndDateText.setEnabled(false);
		EndDateText.setText(TimeFlow.FormatStandard.format(TimeFlow.ReservationStartDate));
		EndDateText.setForeground(Color.BLACK);
		EndDateText.setFont(new Font("Arial", Font.BOLD, 17));
		EndDateText.setBackground(Color.DARK_GRAY);
		EndDateText.setBounds(430, 455, 138, 24);
		frame.getContentPane().add(EndDateText);
		
		EndPlusButton = new JButton("+");
		EndPlusButton.setEnabled(false);
		EndPlusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		EndPlusButton.setBounds(586, 434, 53, 25);
		frame.getContentPane().add(EndPlusButton);
		EndPlusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				TimeFlow.calendar.add(Calendar.DATE, 1);
				EndDateText.setText(TimeFlow.FormatStandard.format(TimeFlow.calendar.getTime()));
				}
				
			});
		
		EndMinusButton = new JButton("-");
		EndMinusButton.setEnabled(false);
		EndMinusButton.setBounds(586, 460, 53, 25);
		frame.getContentPane().add(EndMinusButton);
		EndMinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (TimeFlow.FormatStandard.format(TimeFlow.calendar.getTime()).equals(TimeFlow.FormatStandard.format(TimeFlow.ReservationEndDate)))
					JOptionPane.showMessageDialog(null, "Sorry, you cannot travel back in time. Try going 88 miles per hour.");
				else {
					TimeFlow.calendar.add(Calendar.DATE, -1);
				EndDateText.setText(TimeFlow.FormatStandard.format(TimeFlow.calendar.getTime()));
				}
				}
			});
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BackButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{	finalTotal = total;
				SetOrderedValues();
				TotalCalculation.setTotalTextOrderConfirmation();
				TotalText.setText("Total: " + 0 + " EUR");
				TimeFlow.calendar.add(Calendar.DATE, NumberOfDays);
				ClearAllSelections();
				OrderWindow.Off();
				MainWindow.On();
			}
		});
		HelpMeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				
				OrderWindow.Off();
				HelpMeChoose.On();
			}
		});
		NextButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (total != 0) {
				finalTotal = total;
				SetOrderedValues();
				TotalCalculation.setTotalTextOrderConfirmation();
				TimeFlow.calendar.add(Calendar.DATE, NumberOfDays);
				ClearAllSelections();
				OrderWindow.Off();
				OrderConfirmation.On();
				}
				else JOptionPane.showMessageDialog(null, "You have not selected anything!");

			}
		});

AuditoriumButton.addItemListener(new ItemListener()
{
	
	public void itemStateChanged(ItemEvent arg0) {
		
		if (arg0.getStateChange() == ItemEvent.SELECTED)
		{	
			Rooms.auditorium.setSelected(true);
			TextRoom.setText("The selected room is:\n" + Rooms.auditorium.getName() + "\nthe room can fit " + Rooms.auditorium.getArea() + " people\nthe rent price is " + Rooms.auditorium.getPrice() + " euros for a day.");
			AuditoriumCosts = Rooms.auditorium.getPrice();
			TotalCalculation.CalculateTotal();
			TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
		}
		else if (arg0.getStateChange() == ItemEvent.DESELECTED)
		{	Rooms.auditorium.setSelected(false);
			AuditoriumCosts = 0;
			TotalCalculation.CalculateTotal();			
			TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
		}
	}
});
BigHallButton.addItemListener(new ItemListener()
{
	
	public void itemStateChanged(ItemEvent arg0) {
		
		if (arg0.getStateChange() == ItemEvent.SELECTED)
		{	Rooms.bighall.setSelected(true);
			TextRoom.setText("The selected room is:\n" + Rooms.bighall.getName() + "\nthe room can fit " + Rooms.bighall.getArea() + " people\nthe rent price is " + Rooms.bighall.getPrice() + " euros for a day.");
			BigHallCosts = Rooms.bighall.getPrice();
			TotalCalculation.CalculateTotal();			
			TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
		}
		else if (arg0.getStateChange() == ItemEvent.DESELECTED)
		{
			Rooms.bighall.setSelected(false);
			BigHallCosts = 0;
			TotalCalculation.CalculateTotal();			
			TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
		}
	}
});
MediumSizedRoomButton.addItemListener(new ItemListener()
{
	
	public void itemStateChanged(ItemEvent arg0) {
		
		if (arg0.getStateChange() == ItemEvent.SELECTED)
		{
			Rooms.mediumsizedroom.setSelected(true);
			TextRoom.setText("The selected room is:\n" + Rooms.mediumsizedroom.getName() + "\nthe room can fit " + Rooms.mediumsizedroom.getArea() + " people\nthe rent price is " + Rooms.mediumsizedroom.getPrice() + " euros for a day.");
			MediumSizedRoomCosts = Rooms.mediumsizedroom.getPrice();
TotalCalculation.CalculateTotal();			
TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
		}
		else if (arg0.getStateChange() == ItemEvent.DESELECTED)
		{
			Rooms.mediumsizedroom.setSelected(false);
			MediumSizedRoomCosts = 0;
			TotalCalculation.CalculateTotal();			
			TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
		}
	}
});
MediumSizedClassroomButton.addItemListener(new ItemListener()
{
	public void itemStateChanged(ItemEvent arg0) {
		
		if (arg0.getStateChange() == ItemEvent.SELECTED)
		{
			Rooms.mediumsizedclassroom.setSelected(true);
			TextRoom.setText("The selected room is:\n" + Rooms.mediumsizedclassroom.getName() + "\nthe room can fit " + Rooms.mediumsizedclassroom.getArea() + " people\nthe rent price is " + Rooms.mediumsizedclassroom.getPrice() + " euros for a day.");
			MediumSizedClassroomCosts = Rooms.mediumsizedclassroom.getPrice();
			TotalCalculation.CalculateTotal();			
			TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
		}
		else if (arg0.getStateChange() == ItemEvent.DESELECTED)
		{
			Rooms.mediumsizedclassroom.setSelected(false);
			MediumSizedClassroomCosts = 0;
			TotalCalculation.CalculateTotal();	
			TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
		}
	}
});
SmallRoomButton.addItemListener(new ItemListener()
{
	
	public void itemStateChanged(ItemEvent arg0) {
		
		if (arg0.getStateChange() == ItemEvent.SELECTED)
		{
			Rooms.smallroom.setSelected(true);
			TextRoom.setText("The selected room is:\n" + Rooms.smallroom.getName() + "\nthe room can fit " + Rooms.smallroom.getArea() + " people\nthe rent price is " + Rooms.smallroom.getPrice() + " euros for a day.");
			SmallRoomCosts = Rooms.smallroom.getPrice();
			TotalCalculation.CalculateTotal();			
			TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
		}
		else if (arg0.getStateChange() == ItemEvent.DESELECTED)
		{
			Rooms.smallroom.setSelected(false);
			SmallRoomCosts = 0;
			TotalCalculation.CalculateTotal();
			TotalText.setText("Total: " + total + " EUR for " + NumberOfDays + " days");
		}
	}
});
	
}
}
