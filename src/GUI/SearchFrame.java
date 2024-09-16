package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SystemAndMain.HotelSys;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;

public class SearchFrame extends JFrame {

	private JPanel contentPane;
	private JTextField searchId;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	FirstFrame firstF=null;
	private JTextField textName;
	public SearchFrame(JFrame fr) {
		
		firstF=(FirstFrame) fr;
		setTitle("Search");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JCheckBox removeCheck = new JCheckBox("Show updated list");
		removeCheck.setBounds(351, 41, 138, 21);
		contentPane.add(removeCheck);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		searchId = new JTextField();
		searchId.setBounds(126, 10, 96, 19);
		contentPane.add(searchId);
		searchId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter a Id");
		lblNewLabel.setBounds(20, 13, 96, 13);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 68, 498, 185);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(searchId.getText().isEmpty()) {
					textArea.setText("Please enter an ID");
				}
				else {
					if(HotelSys.getCustomer(Integer.parseInt(searchId.getText()))!=-1)
					{
						textArea.setText(" ");
						textArea.setText(HotelSys.displaySelected(HotelSys.getCustomer(Integer.parseInt(searchId.getText()))));
						searchId.setText("");
					}
					else
					{
						textArea.setText(" ");
						searchId.setText("");
						textArea.setText("There is no customer with the given ID  !!!");
					}
				}
			
			}
		});
		searchButton.setBounds(246, 9, 85, 21);
		contentPane.add(searchButton);
		
		JButton btnNewButton = new JButton("Remove");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(HotelSys.removeCustomer(textName.getText()))
				{
					
					if(removeCheck.isSelected())
					{
						textArea.append(textName.getText()+ "is deleted.\nAfter delete operation : \n ");
						textArea.setText(HotelSys.display());
						textName.setText("");
					}
					else
					{
						textArea.setText("You did not prefer to see updated list.\n");
						textName.setText("");
					}
						
				}
				else
				{
					
					textArea.setText("There is no reservaton name with given name");
					textName.setText("");
				}
				
			}
		});
		btnNewButton.setBounds(246, 41, 85, 21);
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Enter a Name");
		lblNewLabel_1.setBounds(20, 41, 85, 13);
		contentPane.add(lblNewLabel_1);
		
		textName = new JTextField();
		textName.setBounds(126, 42, 96, 19);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JButton menuButton = new JButton("Go to the Menu");
		menuButton.setBounds(351, 9, 109, 21);
		contentPane.add(menuButton);
		
		menuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				firstF.setVisible(true);
			}
		});
	}
}
