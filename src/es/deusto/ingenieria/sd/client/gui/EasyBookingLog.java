package es.deusto.ingenieria.sd.client.gui;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.border.EmptyBorder;

import es.deusto.ingenieria.sd.client.Controller.UserController;
import javax.swing.SwingConstants;

public class EasyBookingLog extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private UserController usercontroller;
	private JLabel lblUsername = new JLabel("");
	private JLabel lblTwitter = new JLabel("Twitter");
	private JButton btnClose = new JButton("Close");
	private JButton btnRegister = new JButton("Register");
	private JLabel lblEasyBooking = new JLabel("");
	private JLabel lblGoogle = new JLabel("");
	private JLabel lblFondo = new JLabel("");
	/**
	 * Create the frame.
	 */
	
	
	public EasyBookingLog(UserController usercontroller) {
		System.out.println("A");
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		this.usercontroller = usercontroller;
		this.setVisible(true);
			contentPane.setLayout(null);
			
			
			btnClose.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnClose.setBounds(24, 246, 89, 23);
			getContentPane().add(btnClose);
			
			btnClose.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					dispose();
				}
			});
			
			
			btnRegister.setBackground(Color.GRAY);
			btnRegister.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnRegister.setBounds(324, 246, 89, 23);
			getContentPane().add(btnRegister);
			btnRegister.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					dispose();
					new UserRegistration(usercontroller);
				}
			});
			
			
			
			lblEasyBooking.setBounds(43, 0, 370, 140);
			getContentPane().add(lblEasyBooking);
			lblTwitter.setHorizontalAlignment(SwingConstants.CENTER);
			lblTwitter.setBackground(Color.BLACK);
			//ImageIcon imagen1 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/EasyBooking.png"));
//			Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(lblEasyBooking.getWidth(), lblEasyBooking.getHeight(), Image.SCALE_DEFAULT));
//			lblEasyBooking.setIcon(fondo1);
			
			
			lblTwitter.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					dispose();
					new TwitterLog(usercontroller);
				}
			});
			lblTwitter.setBounds(75, 104, 99, 59);
			getContentPane().add(lblTwitter);
			
			//ImageIcon imagen2 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/TwitterLogo.png"));
			//Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(lblTwitter.getWidth(), lblTwitter.getHeight(), Image.SCALE_DEFAULT));
			//lblTwitter.setIcon(fondo2);
			
			
			lblGoogle.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					JOptionPane.showMessageDialog(null, "Please select Twitter");				
				}
			});
			lblGoogle.setBounds(237, 161, 99, 59);
			getContentPane().add(lblGoogle);
			//ImageIcon imagen4 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/GoogleLogo.jpg"));
//			Icon fondo4 = new ImageIcon(imagen4.getImage().getScaledInstance(lblGoogle.getWidth(), lblGoogle.getHeight(), Image.SCALE_DEFAULT));
//			lblGoogle.setIcon(fondo4);
			
			
			lblFondo.setBounds(5, 5, 426, 253);
			getContentPane().add(lblFondo);
			//ImageIcon imagen3 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/Fondo.jpg"));
//			Icon fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
//			lblFondo.setIcon(fondo3);

		}
	}
