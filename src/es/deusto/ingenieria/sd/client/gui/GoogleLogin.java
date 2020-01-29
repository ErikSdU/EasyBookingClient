package es.deusto.ingenieria.sd.client.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GoogleLogin extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public GoogleLogin() {
		setBackground(Color.WHITE);

setLayout(null);
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setForeground(Color.BLACK);
		lblName.setBounds(84, 129, 48, 14);
		add(lblName);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBounds(58, 174, 74, 15);
		add(lblPassword);
	
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSignIn.setBounds(295, 247, 89, 23);
		add(btnSignIn);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnClose.setBounds(58, 247, 89, 23);
		add(btnClose);
		
		JLabel lblGoogle = new JLabel("");
		lblGoogle.setBounds(87, 33, 240, 85);
		add(lblGoogle);
		
		ImageIcon imagen2 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/Google.jpg"));
		Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblGoogle.getWidth(), lblGoogle.getHeight(), Image.SCALE_DEFAULT));
		lblGoogle.setIcon(fondo2);
		
		textField = new JTextField();
		textField.setBounds(147, 127, 121, 20);
		add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(147, 172, 121, 17);
		add(passwordField);
	}
}
