package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Inheritance.BodrumHotel;
import Inheritance.FethiyeHotel;
import Inheritance.Hotel;
import Inheritance.NazilliHotel;
import SystemAndMain.HotelSys;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class HotelFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	
	FirstFrame firstF=null;
	private JTextField textnumofRooms;
	private JTextField textThemeofActivity;
	private final ButtonGroup buttonExtreme = new ButtonGroup();
	private final ButtonGroup buttonSpaMassage = new ButtonGroup();
	private final ButtonGroup buttonSauna = new ButtonGroup();
	private final ButtonGroup buttonBoatTour = new ButtonGroup();
	private final ButtonGroup buttonGYM = new ButtonGroup();
	private final ButtonGroup buttonChild = new ButtonGroup();
	
	public HotelFrame(JFrame fr) {
	
		firstF=(FirstFrame) fr;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel label = new JLabel("");
		label.setForeground(new Color(255, 0, 0));
		label.setFont(new Font("Tahoma", Font.ITALIC, 12));
		label.setBounds(10, 91, 236, 13);
		contentPane.add(label);
		JLabel lblNewLabel_4 = new JLabel("Extreme Sports Included?");
		contentPane.add(lblNewLabel_4);
		JLabel lblNewLabel_5 = new JLabel("Spa Massage Included?");
		contentPane.add(lblNewLabel_5);
		JRadioButton extremeYes = new JRadioButton("Yes");
		buttonExtreme.add(extremeYes);
		contentPane.add(extremeYes);
		JRadioButton extremeNo = new JRadioButton("No");
		buttonExtreme.add(extremeNo);
		contentPane.add(extremeNo);

		JRadioButton spaYes = new JRadioButton("Yes");
		buttonSpaMassage.add(spaYes);
		contentPane.add(spaYes);
		JRadioButton spaNo = new JRadioButton("No");
		buttonSpaMassage.add(spaNo);
		contentPane.add(spaNo);
		
		
		
		
		/////// BODRUM
		
		JRadioButton saunaYes = new JRadioButton("Yes");
		buttonSauna.add(saunaYes);
		
		contentPane.add(saunaYes);
		
		JRadioButton saunaNo = new JRadioButton("No");
		buttonSauna.add(saunaNo);
	
		contentPane.add(saunaNo);
		
		JRadioButton boatYes = new JRadioButton("Yes");
		buttonBoatTour.add(boatYes);
		
		contentPane.add(boatYes);
		
		JRadioButton boatNo = new JRadioButton("No");
		buttonBoatTour.add(boatNo);
		
		contentPane.add(boatNo);
		
		JLabel lblNewLabel_6 = new JLabel("Is Sauna Included?");
	
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Is Boat Tour Included?");
		
		contentPane.add(lblNewLabel_7);
		
		/////////////////////////////NAZILLI
		
		JRadioButton gymYes = new JRadioButton("Yes");
		buttonGYM.add(gymYes);
		
		contentPane.add(gymYes);
		
		JRadioButton gymNo = new JRadioButton("No");
		buttonGYM.add(gymNo);
		
		contentPane.add(gymNo);
		
		JRadioButton childYes = new JRadioButton("Yes");
		buttonChild.add(childYes);
		
		contentPane.add(childYes);
		
		JRadioButton childNo = new JRadioButton("No");
		buttonChild.add(childNo);
	
		contentPane.add(childNo);
		
		JLabel lblNewLabel_1 = new JLabel("Is GYM Included?");
		
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_8 = new JLabel("Is Child Club Included?");
		
		contentPane.add(lblNewLabel_8);
		
	
		
	
	
		
		

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox.getSelectedIndex()==1) {
					
					

					saunaYes.setBounds(0,0,0,0);
					
					saunaNo.setBounds(0,0,0,0);
					
					boatYes.setBounds(0,0,0,0);
					
					boatNo.setBounds(0,0,0,0);
					
					lblNewLabel_6.setBounds(0,0,0,0);
					
					lblNewLabel_7.setBounds(0,0,0,0);
					
					
					
					

					gymYes.setBounds(0,0,0,0);
					gymNo.setBounds(0,0,0,0);
					childYes.setBounds(0,0,0,0);
					childNo.setBounds(0,0,0,0);
					lblNewLabel_1.setBounds(0,0,0,0);
					lblNewLabel_8.setBounds(0,0,0,0);
					
					
					
					
					
					
					
					
					

					lblNewLabel_4.setBounds(10, 182, 131, 13);
					
					
					lblNewLabel_5.setBounds(10, 224, 131, 13);
					
					
					extremeYes.setBounds(183, 178, 103, 21);
					
					extremeNo.setBounds(302, 178, 103, 21);
					
					spaYes.setBounds(183, 220, 103, 21);
					
					spaNo.setBounds(302, 220, 103, 21);
					
					
				
					
				}else if(comboBox.getSelectedIndex()==2) {
					
					
					lblNewLabel_4.setBounds(0,0,0,0);
					
					
					lblNewLabel_5.setBounds(0,0,0,0);
					
					
					extremeYes.setBounds(0,0,0,0);
					
					extremeNo.setBounds(0,0,0,0);
					
					spaYes.setBounds(0,0,0,0);
					
					spaNo.setBounds(0,0,0,0);
					
					

					gymYes.setBounds(0,0,0,0);
					gymNo.setBounds(0,0,0,0);
					childYes.setBounds(0,0,0,0);
					childNo.setBounds(0,0,0,0);
					lblNewLabel_1.setBounds(0,0,0,0);
					lblNewLabel_8.setBounds(0,0,0,0);
					
					
					
					
					
					
					
					
					
					
					saunaYes.setBounds(150, 176, 103, 21);
					
					saunaNo.setBounds(292, 176, 103, 21);
					
					boatYes.setBounds(150, 222, 103, 21);
					
					boatNo.setBounds(292, 222, 103, 21);
					
					lblNewLabel_6.setBounds(10, 180, 113, 13);
					
					lblNewLabel_7.setBounds(10, 226, 113, 13);
					
				}else {
					
					lblNewLabel_4.setBounds(0,0,0,0);
					
					
					lblNewLabel_5.setBounds(0,0,0,0);
					
					
					extremeYes.setBounds(0,0,0,0);
					
					extremeNo.setBounds(0,0,0,0);
					
					spaYes.setBounds(0,0,0,0);
					
					spaNo.setBounds(0,0,0,0);
					
					
					
					
					saunaYes.setBounds(0,0,0,0);
					
					saunaNo.setBounds(0,0,0,0);
					
					boatYes.setBounds(0,0,0,0);
					
					boatNo.setBounds(0,0,0,0);
					
					lblNewLabel_6.setBounds(0,0,0,0);
					
					lblNewLabel_7.setBounds(0,0,0,0);
					
					
					
					
					
					
					
					
					
					
					
					
					gymYes.setBounds(171, 188, 103, 21);
					gymNo.setBounds(289, 188, 103, 21);
					childYes.setBounds(171, 236, 103, 21);
					childNo.setBounds(289, 236, 103, 21);
					lblNewLabel_1.setBounds(10, 192, 113, 13);
					lblNewLabel_8.setBounds(10, 240, 113, 13);
					
					
					
					
				}
				
				
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nazilli", "Fethiye", "Bodrum"}));
		comboBox.setBounds(146, 126, 100, 21);
		contentPane.add(comboBox);
		
		textnumofRooms = new JTextField();
		textnumofRooms.setBounds(150, 10, 96, 19);
		contentPane.add(textnumofRooms);
		textnumofRooms.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Number of Rooms:");
		lblNewLabel.setBounds(10, 13, 130, 13);
		contentPane.add(lblNewLabel);
		
		textThemeofActivity = new JTextField();
		textThemeofActivity.setBounds(150, 55, 96, 19);
		contentPane.add(textThemeofActivity);
		textThemeofActivity.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Theme of Activity:");
		lblNewLabel_2.setBounds(10, 58, 130, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("City:");
		lblNewLabel_3.setBounds(10, 130, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnAddHotel = new JButton("Add Hotel Information");
		btnAddHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double price = 0;
				Hotel hotel;
				if(textnumofRooms.getText().isEmpty() || textThemeofActivity.getText().isEmpty())
				{
					label.setText("Fill the neccessary blanks !!!");
				}
				else {
					label.setText(" ");
				int numOfRooms=Integer.parseInt(textnumofRooms.getText());
				String theme=textThemeofActivity.getText();
				
				if(comboBox.getSelectedIndex()==0)
				{
					hotel=new NazilliHotel();
					boolean gym;
					boolean child;
					if(gymYes.isSelected())
						gym=true;
					else
						gym=false;
					if(childYes.isSelected())
						child=true;
					else
						child=false;
					
					HotelSys.addHotel(numOfRooms,2,price,theme,gym,child);
					
					
					
					
				}
				else if(comboBox.getSelectedIndex()==1)
				{
					hotel=new FethiyeHotel();
					boolean extremeSports;
					boolean spaMassage;
					
					if(extremeYes.isSelected())
						extremeSports=true;
					else
						extremeSports=false;
					if(spaYes.isSelected())
						spaMassage=true;
					else
						spaMassage=false;
					
					
					HotelSys.addHotel(numOfRooms,3,price,theme,extremeSports,spaMassage);
				
					
					
				}
				else
				{
					hotel=new BodrumHotel();
					
					boolean sauna;
					boolean boatTour;
					
					if(saunaYes.isSelected())
						sauna=true;
					else
						sauna=false;
					if(boatYes.isSelected())
						boatTour=true;
					else
						boatTour =false;
					
					HotelSys.addHotel(numOfRooms,5,price,theme,sauna,boatTour);
				
				}
				
			}
				
				textnumofRooms.setText("");
				textThemeofActivity.setText("");
				comboBox.setSelectedIndex(-1);
				extremeYes.setBounds(0,0,0,0);
				extremeNo.setBounds(0,0,0,0);
				spaYes.setBounds(0,0,0,0);
				spaNo.setBounds(0,0,0,0);
				saunaYes.setBounds(0,0,0,0);
				saunaNo.setBounds(0,0,0,0);
				boatYes.setBounds(0,0,0,0);
				boatNo.setBounds(0,0,0,0);
				gymYes.setBounds(0,0,0,0);
				gymNo.setBounds(0,0,0,0);
				childYes.setBounds(0,0,0,0);
				childNo.setBounds(0,0,0,0);
				lblNewLabel_4.setBounds(0,0,0,0);
				lblNewLabel_5.setBounds(0,0,0,0);
				lblNewLabel_6.setBounds(0,0,0,0);
				lblNewLabel_7.setBounds(0,0,0,0);
				lblNewLabel_1.setBounds(0,0,0,0);
				lblNewLabel_8.setBounds(0,0,0,0);
			}
		});
		btnAddHotel.setBounds(272, 126, 164, 21);
		contentPane.add(btnAddHotel);
		
		JButton btnNewButton = new JButton("Go back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstF.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(325, 70, 85, 21);
		contentPane.add(btnNewButton);
		

	
		
		
		
		
		
	}

}
