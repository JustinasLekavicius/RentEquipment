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

public class HelpMeChoose {

	private JTextField txtmoniSkaiius;
	private JTextField textField;
	private JTextField txtData;
	private JTextField txtPradia;
	private JTextField txtPabaiga;

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
			frame.setBounds(100, 100, 510, 373);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			txtmoniSkaiius = new JTextField();
			txtmoniSkaiius.setEditable(false);
			txtmoniSkaiius.setText("\u017Dmoni\u0173 skai\u010Dius:");
			txtmoniSkaiius.setColumns(10);
			txtmoniSkaiius.setBounds(12, 83, 109, 22);
			frame.getContentPane().add(txtmoniSkaiius);
			
			textField = new JTextField();
			textField.setText("Paskirtis:");
			textField.setEditable(false);
			textField.setColumns(10);
			textField.setBounds(12, 13, 91, 22);
			frame.getContentPane().add(textField);
			
			JSpinner spinner = new JSpinner();
			spinner.setModel(new SpinnerListModel(new String[] {"Konferencija", "VU SA susirinkimas", "Atvira diskusija", "Paskaita", "D\u0117stytoj\u0173 susirinkimas", "Kita"}));
			spinner.setBounds(12, 48, 109, 22);
			frame.getContentPane().add(spinner);
			
			JSpinner spinner_1 = new JSpinner();
			spinner_1.setModel(new SpinnerNumberModel(10, 0, 200, 10));
			spinner_1.setBounds(12, 118, 109, 22);
			frame.getContentPane().add(spinner_1);
			
			txtData = new JTextField();
			txtData.setText("Data:");
			txtData.setEditable(false);
			txtData.setColumns(10);
			txtData.setBounds(12, 153, 109, 22);
			frame.getContentPane().add(txtData);
			
			JSpinner spinner_2 = new JSpinner();
			spinner_2.setModel(new SpinnerDateModel(new Date(1523221200000L), null, null, Calendar.HOUR));
			spinner_2.setBounds(133, 193, 120, 22);
			frame.getContentPane().add(spinner_2);
			
			txtPradia = new JTextField();
			txtPradia.setText("Prad\u017Eia");
			txtPradia.setEditable(false);
			txtPradia.setColumns(10);
			txtPradia.setBounds(12, 193, 109, 22);
			frame.getContentPane().add(txtPradia);
			
			txtPabaiga = new JTextField();
			txtPabaiga.setText("Pabaiga");
			txtPabaiga.setEditable(false);
			txtPabaiga.setColumns(10);
			txtPabaiga.setBounds(12, 225, 109, 22);
			frame.getContentPane().add(txtPabaiga);
			
			JSpinner spinner_3 = new JSpinner();
			spinner_3.setModel(new SpinnerDateModel(new Date(1523221200000L), null, null, Calendar.DAY_OF_YEAR));
			spinner_3.setBounds(133, 225, 120, 22);
			frame.getContentPane().add(spinner_3);
		}

	}
	
