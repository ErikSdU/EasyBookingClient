package es.deusto.ingenieria.sd.client.gui;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import es.deusto.ingenieria.sd.client.Controller.UserController;
import es.deusto.ingenieria.sd.server.data.dto.FlightInfoDTO;
import javax.swing.JList;

public class ListFlights extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	public UserController controller;
	public List<FlightInfoDTO> flights;
	private JPanel contentPane;

	
	
	
	public ListFlights(UserController controller, List<FlightInfoDTO> flights) {
		this.controller = controller;
		this.flights = flights;
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
			
		JList<String> list = new JList<String>(new DefaultListModel<String>());
		list.setBounds(29, 28, 468, 253);
		contentPane.add(list);
		for (int i = 0; i < flights.size(); i++) {
			String s = "36";
			((DefaultListModel)list.getModel()).addElement(flights);
			
		}
	}
}
