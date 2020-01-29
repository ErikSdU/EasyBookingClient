package es.deusto.ingenieria.sd.client.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Booking extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	
	/**
	 * Create the panel.
	 */
	public Booking() {
		setLayout(null);
		
		JLabel lblBooking = new JLabel("Booking reservation");
		lblBooking.setForeground(Color.WHITE);
		lblBooking.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblBooking.setBounds(121, 11, 258, 38);
		add(lblBooking);
		
		JLabel lblUser = new JLabel("User: ");
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUser.setBounds(35, 78, 48, 14);
		add(lblUser);
		
		JLabel lblAir = new JLabel("");
		lblAir.setBounds(253, 60, 205, 88);
		add(lblAir);
		
		textField = new JTextField();
		textField.setBounds(90, 75, 96, 20);
		add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(90, 106, 96, 20);
		add(passwordField);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(10, 109, 60, 17);
		add(lblPassword);
		
		JLabel lblPassenger = new JLabel("Passenger 1");
		lblPassenger.setForeground(Color.WHITE);
		lblPassenger.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassenger.setBounds(21, 152, 104, 26);
		add(lblPassenger);
		
		JLabel lblUser_1 = new JLabel("Username: ");
		lblUser_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUser_1.setBounds(22, 189, 72, 14);
		add(lblUser_1);
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(46, 214, 48, 14);
		add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 186, 96, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(90, 211, 96, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPassenger_1 = new JLabel("Passenger 2");
		lblPassenger_1.setForeground(Color.WHITE);
		lblPassenger_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassenger_1.setBounds(255, 159, 104, 19);
		add(lblPassenger_1);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsername.setBounds(276, 189, 64, 14);
		add(lblUsername);
		
		JLabel lblName_1 = new JLabel("Name: ");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName_1.setBounds(300, 214, 48, 14);
		add(lblName_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(362, 186, 96, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(362, 211, 96, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblSelectYourPayment = new JLabel("Select your payment method: ");
		lblSelectYourPayment.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSelectYourPayment.setBounds(10, 268, 176, 14);
		add(lblSelectYourPayment);
		
		JComboBox boxAir = new JComboBox();
		boxAir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(boxAir.getSelectedIndex()== 1) {
//					ImageIcon imagen2 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/Lufthansa.png"));
//					Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblAir.getWidth(), lblAir.getHeight(), Image.SCALE_DEFAULT));
//					lblAir.setIcon(fondo2);
				}else if(boxAir.getSelectedIndex()== 2) {
//					ImageIcon imagen3 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/Iberia.png"));
//					Icon fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(lblAir.getWidth(), lblAir.getHeight(), Image.SCALE_DEFAULT));
//					lblAir.setIcon(fondo3);
				}
			}
		});
		boxAir.setBounds(196, 264, 104, 22);
		add(boxAir);
		boxAir.addItem(" ");
		boxAir.addItem("Visa");
		boxAir.addItem("MasterCard");
			
		
		
		JButton btnBook = new JButton("Book");
		btnBook.setBounds(389, 312, 89, 23);
		add(btnBook);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(22, 312, 89, 23);
		add(btnClose);
		
		
		
		
		JLabel lblFont = new JLabel("");
		lblFont.setBounds(0, 0, 512, 363);
		add(lblFont);
//		ImageIcon imagen1 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/Sky.jpg"));
//		Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(lblFont.getWidth(), lblFont.getHeight(), Image.SCALE_DEFAULT));
//		lblFont.setIcon(fondo1);

	}
}
