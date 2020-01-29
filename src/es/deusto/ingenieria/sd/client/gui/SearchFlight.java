package es.deusto.ingenieria.sd.client.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import es.deusto.ingenieria.sd.client.Controller.UserController;
import es.deusto.ingenieria.sd.server.data.dto.FlightInfoDTO;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SearchFlight extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private UserController controller;
	public List<FlightInfoDTO> flights;
	public Booking booking;
	public ListFlights lFlight;
	

	/**
	 * Create the panel.
	 */
	public SearchFlight(UserController controller) {
		this.setVisible(true);
		this.controller = controller;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblSearchAFlight = new JLabel("Search a Flight ");
		lblSearchAFlight.setForeground(Color.WHITE);
		lblSearchAFlight.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblSearchAFlight.setBounds(124, 23, 222, 26);
		getContentPane().add(lblSearchAFlight);
		
		JLabel labelOffer = new JLabel("");
		labelOffer.setBounds(332, 67, 63, 40);
		getContentPane().add(labelOffer);
//		ImageIcon imagen1 = new ImageIcon(getClass().getResource("/img/Offer.png"));
//		Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(labelOffer.getWidth(), labelOffer.getHeight(), Image.SCALE_DEFAULT));
//		labelOffer.setIcon(fondo1);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setForeground(Color.WHITE);
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFrom.setBounds(33, 178, 48, 14);
		getContentPane().add(lblFrom);
		
		textField = new JTextField();
		textField.setBounds(76, 175, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTo = new JLabel("To: ");
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTo.setBounds(280, 178, 30, 14);
		getContentPane().add(lblTo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(312, 176, 96, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setBounds(288, 11, 63, 46);
		getContentPane().add(labelLogo);
//		ImageIcon imagen2 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/FlightLogo2.png"));
//		Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_DEFAULT));
//		labelLogo.setIcon(fondo2);
		
		JLabel lblNumberOfPassengers = new JLabel("Number of passengers: ");
		lblNumberOfPassengers.setForeground(Color.WHITE);
		lblNumberOfPassengers.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNumberOfPassengers.setBounds(33, 216, 176, 17);
		getContentPane().add(lblNumberOfPassengers);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(196, 215, 30, 20);
		getContentPane().add(spinner);
		
		JButton btnClose = new JButton("Close");
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClose.setBounds(33, 255, 89, 23);
		getContentPane().add(btnClose);
		JComboBox cDate = new JComboBox();
		cDate.setModel(new DefaultComboBoxModel(new String[] {"", "01012020", "07012020", "11012020", "01022020"}));
		cDate.setBounds(317, 215, 91, 26);
		contentPane.add(cDate);
		JButton btnBook = new JButton("Search");
		btnBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			String dat =datecheck(cDate.getSelectedIndex());
			System.out.println("dato");
			flights = controller.searchFlight(lblFrom.getText(), lblTo.getText(), "01012020", (Integer) spinner.getValue());
			dispose();
			new ListFlights(controller, flights);
				
			}
		});
		
		btnBook.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBook.setBounds(339, 255, 89, 23);
		getContentPane().add(btnBook);
		
		JLabel lblBioBilbao = new JLabel("Bio - Bilbao");
		lblBioBilbao.setIcon(null);
		lblBioBilbao.setBounds(33, 67, 375, 94);
		contentPane.add(lblBioBilbao);
		
		
		
		JLabel labelFondo = new JLabel("");
		labelFondo.setBounds(0, 0, 450, 300);
		getContentPane().add(labelFondo);
//		ImageIcon imagen3 = new ImageIcon(getClass().getResource("/es/deusto/ingenieria/sd/client/gui/img/FondoT.jpg"));
//		Icon fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
//		labelFondo.setIcon(fondo3);
		
		
		
	}
	public String datecheck(int number) {
		String[] dates= new String[5];
		
		dates[1]= "01012020";
		dates[2]= "07012020";
		dates[3]= "11012020";
		dates[4]= "01022020";
	return dates[number];
		
		
	}
}
