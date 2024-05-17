package solucionInfo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CuartaPantalla {

	private JFrame frame;
	private JTextField txtFotosHotelesmultiples;
	private TercerPantalla regreso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CuartaPantalla window = new CuartaPantalla();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CuartaPantalla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtFotosHotelesmultiples = new JTextField();
		txtFotosHotelesmultiples.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtFotosHotelesmultiples.setHorizontalAlignment(SwingConstants.CENTER);
		txtFotosHotelesmultiples.setText("Fotos Hotel (multiples)");
		txtFotosHotelesmultiples.setBounds(21, 6, 406, 177);
		frame.getContentPane().add(txtFotosHotelesmultiples);
		txtFotosHotelesmultiples.setColumns(10);
		
		JLabel lblNombreHotel1 = new JLabel("Nombre Hotel 1");
		lblNombreHotel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreHotel1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNombreHotel1.setBounds(116, 191, 186, 21);
		frame.getContentPane().add(lblNombreHotel1);
		
		JLabel lblDescripcinDelHotel = new JLabel("Descripción del hotel");
		lblDescripcinDelHotel.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcinDelHotel.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		lblDescripcinDelHotel.setBounds(21, 224, 406, 95);
		frame.getContentPane().add(lblDescripcinDelHotel);
		
		JButton btnNewButton = new JButton("<- Regresar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				regreso = new TercerPantalla();
				regreso.setVisibility(true);
			}
		});
		btnNewButton.setBounds(6, 323, 129, 39);
		frame.getContentPane().add(btnNewButton);
	}
	
	public void setVisibility(boolean visibility) {
		frame.setVisible(true);
	}

}
