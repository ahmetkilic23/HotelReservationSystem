package GUI;
import SystemAndMain.HotelSys;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Has_A.Customer;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FirstFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textCustomer;
	private JTextField textReservation;
	private JTextField textPerson;
	private JTextField textDay;
	
	HotelFrame HotelF= new HotelFrame(this);
	SearchFrame SearchF=new SearchFrame(this);

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public FirstFrame() {
		setTitle("Customer Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCustomer = new JTextField();
		textCustomer.setBounds(168, 32, 96, 19);
		contentPane.add(textCustomer);
		textCustomer.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Customer Id:");
		lblNewLabel.setBounds(10, 35, 134, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Reservation Name:");
		lblNewLabel_1.setBounds(10, 84, 134, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Number of Person:");
		lblNewLabel_2.setBounds(10, 132, 134, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number of Day:");
		lblNewLabel_3.setBounds(10, 179, 134, 13);
		contentPane.add(lblNewLabel_3);
		
		textReservation = new JTextField();
		textReservation.setBounds(168, 81, 96, 19);
		contentPane.add(textReservation);
		textReservation.setColumns(10);
		
		textPerson = new JTextField();
		textPerson.setBounds(168, 129, 96, 19);
		contentPane.add(textPerson);
		textPerson.setColumns(10);
		
		textDay = new JTextField();
		textDay.setBounds(168, 176, 96, 19);
		contentPane.add(textDay);
		textDay.setColumns(10);
		
		JButton btnNewButton = new JButton("Add Customer and Go Hotel Details");
		
		btnNewButton.setBounds(10, 244, 254, 21);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(392, 29, 404, 332);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
		JButton display = new JButton("Display");
		display.setBounds(277, 340, 85, 21);
		contentPane.add(display);
		
		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SearchF.setVisible(true);
				dispose();
				
			}
		});
		searchButton.setBounds(10, 340, 96, 21);
		contentPane.add(searchButton);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label.setForeground(new Color(255, 0, 0));
		label.setBounds(20, 275, 286, 19);
		contentPane.add(label);
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				if(textCustomer.getText().isEmpty() || textReservation.getText().isEmpty() || textPerson.getText().isEmpty() || textDay.getText().isEmpty())
				{
					label.setText("Fill the neccessary blanks !!!");
				}
				
				else
				{
					label.setText("");
				int id = Integer.parseInt(textCustomer.getText());
				if(HotelSys.getCustomer(id)!=-1)
				{
					label.setText("The customer id that you give is already exists !!!");
					textCustomer.setText("");
					textReservation.setText("");
					textPerson.setText("");
					textDay.setText("");
				}
				else
				{
					
				String name=textReservation.getText();
				int numOfPerson = Integer.parseInt(textPerson.getText());
				int numOfDay=Integer.parseInt(textDay.getText());
			
			
			
				textCustomer.setText("");
				textReservation.setText("");
				textPerson.setText("");
				textDay.setText("");
				HotelSys.addCustomer(id, name, numOfPerson, numOfDay);
			
				HotelF.setVisible(true);
				dispose();
				}
				
				}
//			if(comboBox.getSelectedIndex()==0) {
//				nazilli.setVisible(true);
//				dispose();
//				
//			}
//			else if(comboBox.getSelectedIndex()==1){
//				
//				fethiye.setVisible(true);
//				dispose();
//				
//			}
//			else
//			{
//				bodrum.setVisible(true);
//				dispose();
//			}
				
			}
		});
		
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(HotelSys.display().isEmpty()) {
					textArea.setText("The list is empty!");
				}
				else {
					textArea.setText(HotelSys.display());
				}
			}
		});
		
		
		textDay.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {,
				if(r.keyPress(KeyEvent.VK_ENTER)) {
					if(textCustomer.getText().isEmpty() || textReservation.getText().isEmpty() || textPerson.getText().isEmpty() || textDay.getText().isEmpty())
					{
						label.setText("Fill the neccessary blanks !!!");
					}
					
					else
					{
						label.setText("");
					int id = Integer.parseInt(textCustomer.getText());
					if(HotelSys.getCustomer(id)!=-1)
					{
						label.setText("The customer id that you give is already exists !!!");
						textCustomer.setText("");
						textReservation.setText("");
						textPerson.setText("");
						textDay.setText("");
					}
					else
					{
						
					String name=textReservation.getText();
					int numOfPerson = Integer.parseInt(textPerson.getText());
					int numOfDay=Integer.parseInt(textDay.getText());
				
				
				
					textCustomer.setText("");
					textReservation.setText("");
					textPerson.setText("");
					textDay.setText("");
					HotelSys.addCustomer(id, name, numOfPerson, numOfDay);
				
					HotelF.setVisible(true);
					dispose();
					}
					
					}
//				if(comboBox.getSelectedIndex()==0) {
//					nazilli.setVisible(true);
//					dispose();
//					
//				}
//				else if(comboBox.getSelectedIndex()==1){
//					
//					fethiye.setVisible(true);
//					dispose();
//					
//				}
//				else
//				{
//					bodrum.setVisible(true);
//					dispose();
//				}
					
				}

				}
			
		});
		
	}
}
