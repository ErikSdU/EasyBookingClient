package es.deusto.ingenieria.sd.client.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import es.deusto.ingenieria.sd.client.Controller.UserController;

import javax.swing.JPasswordField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserRegistration extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private UserController controller;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public UserRegistration(UserController controller) {
		this.setVisible(true);
		this.controller = controller;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 363);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmail.setBounds(128, 106, 48, 14);
		getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBounds(100, 145, 76, 14);
		getContentPane().add(lblPassword);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setBounds(128, 170, 48, 14);
		getContentPane().add(lblName);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsername.setBounds(100, 200, 76, 14);
		getContentPane().add(lblUsername);
		
		JLabel lblDefaultDepairtureAirport = new JLabel("Default depairture Airport:");
		lblDefaultDepairtureAirport.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDefaultDepairtureAirport.setBounds(12, 235, 164, 14);
		getContentPane().add(lblDefaultDepairtureAirport);
		
		textField = new JTextField();
		textField.setBounds(193, 103, 112, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(193, 167, 112, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(193, 198, 112, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(193, 229, 112, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.register(textField.getText(), textField_4.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText());
				new SearchFlight(controller);
				dispose();
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegister.setBounds(356, 299, 89, 23);
		getContentPane().add(btnRegister);
		
		JButton btnClose = new JButton("Close");
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new EasyBookingLog(controller);
				dispose();
			}
		});
		
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnClose.setBounds(68, 299, 89, 23);
		getContentPane().add(btnClose);
		
		JLabel lblRegistration = new JLabel("Register");
		lblRegistration.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblRegistration.setBounds(193, 44, 149, 37);
		getContentPane().add(lblRegistration);
		
		JLabel labelTwitterLogo = new JLabel("");
		labelTwitterLogo.setBounds(389, 170, 76, 69);
		getContentPane().add(labelTwitterLogo);
//		ImageIcon imagen1 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/TwitterLogo.png"));
//		Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(labelTwitterLogo.getWidth(), labelTwitterLogo.getHeight(), Image.SCALE_DEFAULT));
//		labelTwitterLogo.setIcon(fondo1);
		
		JLabel labelGoogle = new JLabel("");
		labelGoogle.setBounds(397, 92, 68, 53);
		getContentPane().add(labelGoogle);
		
		textField_4 = new JTextField();
		textField_4.setBounds(193, 133, 112, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
//		ImageIcon imagen2 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/GoogleLogo.jpg"));
//		Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(labelGoogle.getWidth(), labelGoogle.getHeight(), Image.SCALE_DEFAULT));
//		labelGoogle.setIcon(fondo2);
		
		JLabel labelFondo = new JLabel("");
		labelFondo.setBounds(10, 10, 477, 316);
		getContentPane().add(labelFondo);
//		ImageIcon imagen3 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/Fondo.jpg"));
//		Icon fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
//		labelFondo.setIcon(fondo3);

	}
}
