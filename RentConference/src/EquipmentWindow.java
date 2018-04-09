import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EnumSet;

import javax.swing.*;

public class EquipmentWindow {
	
	static EquipmentWindow window = new EquipmentWindow();
	JFrame frame = new JFrame();
	private int total = 0;
	
	static void On()
	{
		window.frame.setVisible(true);
	}
	static void Off()
	{
		window.frame.setVisible(false);
		
	}
	public EquipmentWindow() {
		frame.setResizable(false);
		frame.setTitle("Rooms");
		frame.setBounds(100, 100, 447, 433);
		frame.getContentPane().setLayout(null);
		
		JTextPane Title = new JTextPane();
		Title.setEditable(false);
		Title.setFont(new Font("Arial", Font.PLAIN, 20));
		Title.setText("Please select the needed equipment");
		Title.setBounds(59, 12, 334, 32);
		frame.getContentPane().add(Title);
		
		JCheckBox projektoriusCheckBox = new JCheckBox("Projector (80 EUR)");
		projektoriusCheckBox.setBounds(8, 81, 156, 23);
		frame.getContentPane().add(projektoriusCheckBox);
		
		JCheckBox garsiakalbisCheckBox = new JCheckBox("Large Speaker (40 EUR)");
		garsiakalbisCheckBox.setBounds(8, 117, 212, 23);
		frame.getContentPane().add(garsiakalbisCheckBox);
		
		JCheckBox lazerisCheckBox = new JCheckBox("Laser pointer (15 EUR)");
		lazerisCheckBox.setBounds(8, 144, 212, 23);
		frame.getContentPane().add(lazerisCheckBox);
		
		JCheckBox mikrofonasCheckBox = new JCheckBox("Microphone (20 EUR)");
		mikrofonasCheckBox.setBounds(8, 171, 191, 23);
		frame.getContentPane().add(mikrofonasCheckBox);
		
		JCheckBox lentaCheckBox = new JCheckBox("White board (25 EUR)");
		lentaCheckBox.setBounds(224, 81, 218, 23);
		frame.getContentPane().add(lentaCheckBox);
		
		JCheckBox ekranasCheckBox = new JCheckBox("Projection screen (45 EUR)");
		ekranasCheckBox.setBounds(224, 144, 218, 23);
		frame.getContentPane().add(ekranasCheckBox);
		
		JCheckBox stiprintuvasCheckBox = new JCheckBox("Amplifier (60 EUR)");
		stiprintuvasCheckBox.setBounds(224, 117, 156, 23);
		frame.getContentPane().add(stiprintuvasCheckBox);
		
		JCheckBox Placeholder = new JCheckBox("Placeholder");
		Placeholder.setBounds(224, 171, 156, 23);
		frame.getContentPane().add(Placeholder);

		JButton BackButton = new JButton("Back");
		BackButton.setBounds(8, 380, 82, 25);
		frame.getContentPane().add(BackButton);
		
		JButton NextButton = new JButton("Next");
		NextButton.setBounds(318, 380, 117, 25);
		frame.getContentPane().add(NextButton);
		
		JTextArea TotalText = new JTextArea();
		TotalText.setFont(new Font("Dialog", Font.PLAIN, 20));
		TotalText.setEditable(false);
		TotalText.setText("Total: 0 EUR");
		TotalText.setBounds(75, 222, 286, 32);
		frame.getContentPane().add(TotalText);
		BackButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				EquipmentWindow.Off();
				MainWindow.On();
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
			
		
	}
}
