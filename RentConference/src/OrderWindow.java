import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EnumSet;

import javax.swing.*;

public class OrderWindow extends Main{
	
	static OrderWindow window = new OrderWindow();
	JFrame frame = new JFrame();
	static void On()
	{
		window.frame.setVisible(true);
	}
	static void Off()
	{
		window.frame.setVisible(false);
	}
	public OrderWindow() {
		frame.getContentPane().setBackground(new Color(153, 204, 204));
		frame.setBackground(new Color(153, 204, 204));
		frame.setResizable(false);
		frame.setTitle("Order window");
		frame.setBounds(100, 100, 843, 359);
		frame.getContentPane().setLayout(null);
		JButton HelpMeButton = new JButton("Help me choose!");
		HelpMeButton.setBounds(563, 230, 200, 44);
		frame.getContentPane().add(HelpMeButton);
		JButton BackButton = new JButton("Back");
		BackButton.setBounds(12, 322, 82, 25);
		frame.getContentPane().add(BackButton);
		JButton NextButton = new JButton("Next");
		NextButton.setBounds(711, 322, 117, 25);
		frame.getContentPane().add(NextButton);
		JTextArea txtrPleaseSelectA = new JTextArea();
		txtrPleaseSelectA.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtrPleaseSelectA.setBackground(new Color(153, 204, 204));
		txtrPleaseSelectA.setText("Please select a room.");
		txtrPleaseSelectA.setEditable(false);
		txtrPleaseSelectA.setBounds(524, 38, 304, 186);
		frame.getContentPane().add(txtrPleaseSelectA);
	
		JRadioButton AuditoriumButton = new JRadioButton ("Auditorium");
		AuditoriumButton.setBackground(new Color(153, 204, 204));
		AuditoriumButton.setBounds(378, 38, 117, 25);
		frame.getContentPane().add(AuditoriumButton);
		
		JRadioButton HallButton = new JRadioButton ("Hall");
		HallButton.setBackground(new Color(153, 204, 204));
		HallButton.setBounds(378, 112, 117, 25);
		frame.getContentPane().add(HallButton);
		
		JRadioButton RoomButton = new JRadioButton ("Room");
		RoomButton.setBackground(new Color(153, 204, 204));
		RoomButton.setBounds(378, 75, 117, 25);
		frame.getContentPane().add(RoomButton);		
		JRadioButton ClassroomButton = new JRadioButton("Classroom");
		ClassroomButton.setBackground(new Color(153, 204, 204));
		ClassroomButton.setBounds(378, 186, 117, 25);
		frame.getContentPane().add(ClassroomButton);
		
		JRadioButton ChamberButton = new JRadioButton("Chamber");
		ChamberButton.setBackground(new Color(153, 204, 204));
		ChamberButton.setBounds(378, 149, 117, 25);
		frame.getContentPane().add(ChamberButton);
		
		ButtonGroup RoomButtonGroup = new ButtonGroup();
		RoomButtonGroup.add(ClassroomButton);
		RoomButtonGroup.add(ChamberButton);
		RoomButtonGroup.add(AuditoriumButton);
		RoomButtonGroup.add(HallButton);
		RoomButtonGroup.add(RoomButton);
		

		JTextArea TotalText = new JTextArea();
		TotalText.setBackground(new Color(153, 204, 204));
		TotalText.setFont(new Font("Dialog", Font.PLAIN, 20));
		TotalText.setEditable(false);
		TotalText.setText("Total: " + total + " EUR");
		TotalText.setBounds(250, 307, 286, 32);
		frame.getContentPane().add(TotalText);
		
		JCheckBox projektoriusCheckBox = new JCheckBox("Projector (80 EUR)");
		projektoriusCheckBox.setBackground(new Color(153, 204, 204));
		projektoriusCheckBox.setBounds(12, 53, 156, 23);
		frame.getContentPane().add(projektoriusCheckBox);
		
		JCheckBox garsiakalbisCheckBox = new JCheckBox("Large Speaker (40 EUR)");
		garsiakalbisCheckBox.setBackground(new Color(153, 204, 204));
		garsiakalbisCheckBox.setBounds(12, 89, 212, 23);
		frame.getContentPane().add(garsiakalbisCheckBox);
		
		JCheckBox lazerisCheckBox = new JCheckBox("Laser pointer (15 EUR)");
		lazerisCheckBox.setBackground(new Color(153, 204, 204));
		lazerisCheckBox.setBounds(12, 116, 212, 23);
		frame.getContentPane().add(lazerisCheckBox);
		
		JCheckBox mikrofonasCheckBox = new JCheckBox("Microphone (20 EUR)");
		mikrofonasCheckBox.setBackground(new Color(153, 204, 204));
		mikrofonasCheckBox.setBounds(12, 143, 191, 23);
		frame.getContentPane().add(mikrofonasCheckBox);
		
		JCheckBox lentaCheckBox = new JCheckBox("White board (25 EUR)");
		lentaCheckBox.setBackground(new Color(153, 204, 204));
		lentaCheckBox.setBounds(12, 177, 218, 23);
		frame.getContentPane().add(lentaCheckBox);
		
		JCheckBox ekranasCheckBox = new JCheckBox("Projection screen (45 EUR)");
		ekranasCheckBox.setBackground(new Color(153, 204, 204));
		ekranasCheckBox.setBounds(12, 240, 218, 23);
		frame.getContentPane().add(ekranasCheckBox);
		
		JCheckBox stiprintuvasCheckBox = new JCheckBox("Amplifier (60 EUR)");
		stiprintuvasCheckBox.setBackground(new Color(153, 204, 204));
		stiprintuvasCheckBox.setBounds(12, 213, 156, 23);
		frame.getContentPane().add(stiprintuvasCheckBox);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BackButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				suggested = false;
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
				if (suggested == false) {
				OrderWindow.Off();
				}
				
			}
		});
		projektoriusCheckBox.addItemListener(new ItemListener()
		{
			private int change = 0;
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				if (arg0.getStateChange() == ItemEvent.SELECTED)
				{
				total = total + Equipment.projektorius.getPrice();
				change = Equipment.projektorius.getPrice();
				TotalText.setText("Total: " + total + " EUR");
				}
				else 
				{
					total = total - change;
					TotalText.setText("Total: " + total + " EUR");
				}

			}
		});
ekranasCheckBox.addItemListener(new ItemListener()
{
	private int change = 0;
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getStateChange() == ItemEvent.SELECTED)
		{
		total = total + Equipment.ekranas.getPrice();
		change = Equipment.ekranas.getPrice();
		TotalText.setText("Total: " + total + " EUR");
		}
		else 
		{
			total = total - change;
			TotalText.setText("Total: " + total + " EUR");
		}

	}
});
garsiakalbisCheckBox.addItemListener(new ItemListener()
{
	private int change = 0;
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getStateChange() == ItemEvent.SELECTED)
		{
		total = total + Equipment.garsiakalbis.getPrice();
		change = Equipment.garsiakalbis.getPrice();
		TotalText.setText("Total: " + total + " EUR");
		}
		else 
		{
			total = total - change;
			TotalText.setText("Total: " + total + " EUR");
		}

	}
});
lazerisCheckBox.addItemListener(new ItemListener()
{
	private int change = 0;
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getStateChange() == ItemEvent.SELECTED)
		{
		total = total + Equipment.lazeris.getPrice();
		change = Equipment.lazeris.getPrice();
		TotalText.setText("Total: " + total + " EUR");
		}
		else 
		{
			total = total - change;
			TotalText.setText("Total: " + total + " EUR");
		}

	}
});
mikrofonasCheckBox.addItemListener(new ItemListener()
{
	private int change = 0;
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getStateChange() == ItemEvent.SELECTED)
		{
		total = total + Equipment.mikrofonas.getPrice();
		change = Equipment.mikrofonas.getPrice();
		TotalText.setText("Total: " + total + " EUR");
		}
		else 
		{
			total = total - change;
			TotalText.setText("Total: " + total + " EUR");
		}

	}
});
stiprintuvasCheckBox.addItemListener(new ItemListener()
{
	private int change = 0;
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getStateChange() == ItemEvent.SELECTED)
		{
		total = total + Equipment.stiprintuvas.getPrice();
		change = Equipment.stiprintuvas.getPrice();
		TotalText.setText("Total: " + total + " EUR");
		}
		else 
		{
			total = total - change;
			TotalText.setText("Total: " + total + " EUR");
		}

	}
});
lentaCheckBox.addItemListener(new ItemListener()
{
	private int change = 0;
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getStateChange() == ItemEvent.SELECTED)
		{
		total = total + Equipment.lenta.getPrice();
		change = Equipment.lenta.getPrice();
		TotalText.setText("Total: " + total + " EUR");
		}
		else 
		{
			total = total - change;
			TotalText.setText("Total: " + total + " EUR");
		}

	}
});
AuditoriumButton.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent arg0)
	{
			txtrPleaseSelectA.setText("The selected room is:\n" + Rooms.auditorija.getName() + "\nthe room can fit " + Rooms.auditorija.getArea() + " people\nthe rent price is " + Rooms.auditorija.getPrice() + " euros for a day.");
	}
});
HallButton.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent arg0)
	{
			txtrPleaseSelectA.setText("The selected room is:\n" + Rooms.sale.getName() + "\nthe room can fit " + Rooms.sale.getArea() + " people\nthe rent price is " + Rooms.sale.getPrice() + " euros for a day.");
	}
});
RoomButton.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent arg0)
	{
			txtrPleaseSelectA.setText("The selected room is:\n" + Rooms.kambarys.getName() + "\nthe room can fit " + Rooms.kambarys.getArea() + " people\nthe rent price is " + Rooms.kambarys.getPrice() + " euros for a day.");
	}
});
ClassroomButton.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent arg0)
	{
			txtrPleaseSelectA.setText("The selected room is:\n" + Rooms.klase.getName() + "\nthe room can fit " + Rooms.klase.getArea() + " people\nthe rent price is " + Rooms.klase.getPrice() + " euros for a day.");
	}
});
ChamberButton.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent arg0)
	{
			txtrPleaseSelectA.setText("The selected room is:\n" + Rooms.kambariukas.getName() + "\nthe room can fit " + Rooms.kambariukas.getArea() + " people\nthe rent price is " + Rooms.kambariukas.getPrice() + " euros for a day.");
	}
});
	}
}
