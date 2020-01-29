package es.deusto.ingenieria.sd.client.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import es.deusto.ingenieria.sd.client.Controller.UserController;

public class TwitterLog extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private UserController controller;
	private JTextField mailField;
		private JTextField passField;
		
	/**
	 * Create the frame.
	 */
	public TwitterLog(UserController controller) {
		this.setVisible(true);
		this.controller=controller;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);

			
			JLabel lblName = new JLabel("Name: ");
			lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblName.setForeground(Color.WHITE);
			lblName.setBounds(73, 129, 48, 14);
			getContentPane().add(lblName);
			
			JLabel lblPassword = new JLabel("Password: ");
			lblPassword.setForeground(Color.WHITE);
			lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblPassword.setBounds(58, 174, 74, 15);
			getContentPane().add(lblPassword);
		
			
			JButton btnSignIn = new JButton("Sign In");
			btnSignIn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(check(mailField.getText(), passField.getText())) {
						dispose();
						new SearchFlight(controller);
					}else {
						JOptionPane.showMessageDialog(null, "incorrect login");
					}
					
				}
			});
			btnSignIn.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnSignIn.setBounds(306, 247, 89, 23);
			getContentPane().add(btnSignIn);
			
			JButton btnClose = new JButton("Close");
			btnClose.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					dispose();
					new EasyBookingLog(controller);
				}
			});
			btnClose.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnClose.setBounds(58, 247, 89, 23);
			getContentPane().add(btnClose);
			
			mailField = new JTextField();
			mailField.setBounds(144, 127, 125, 20);
			getContentPane().add(mailField);
			mailField.setColumns(10);
			
			passField = new JTextField();
			passField.setBounds(142, 172, 127, 20);
			getContentPane().add(passField);
			passField.setColumns(10);
			
			JLabel lblTwitter = new JLabel("Twitter");
			lblTwitter.setForeground(Color.WHITE);
			lblTwitter.setFont(new Font("Tahoma", Font.BOLD, 33));
			lblTwitter.setBounds(129, 60, 147, 40);
			getContentPane().add(lblTwitter);
			
			JLabel lblLogo = new JLabel("");
			lblLogo.setBounds(262, 47, 74, 62);
			getContentPane().add(lblLogo);
			
			
			
			JLabel lblFondoT = new JLabel("");
			lblFondoT.setBounds(0, 0, 454, 306);
			getContentPane().add(lblFondoT);
			//ImageIcon imagen2 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/FondoT.jpg"));
//			Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblFondoT.getWidth(), lblFondoT.getHeight(), Image.SCALE_DEFAULT));
//			lblFondoT.setIcon(fondo2);
//			ImageIcon imagen1 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/TwitterLogo.png"));
//			Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT));
//			lblLogo.setIcon(fondo1);
			
			
		}
		
		public boolean check(String email, String password) {
			System.out.println("log");
			if(controller.signIn(email, password) != null) {
				return true;
			}else {
				return false;
			}
		
		}
		
		
	}


