package solucionInfo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EntregaPantallas {

	public JFrame frmCotizadorAgencia;
	private JTextField textNombre;
	private JTextField textCantidadPersonas;
	private SegundaPantalla segundaPantalla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntregaPantallas window = new EntregaPantallas();
					window.frmCotizadorAgencia.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EntregaPantallas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCotizadorAgencia = new JFrame();
		frmCotizadorAgencia.getContentPane().setBackground(SystemColor.inactiveCaption);
		frmCotizadorAgencia.setTitle("Cotizador Agencia");
		frmCotizadorAgencia.setBounds(100, 100, 423, 563);
		frmCotizadorAgencia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCotizadorAgencia.getContentPane().setLayout(null);
		
		JLabel lblLogo = new JLabel("LOGO");
		lblLogo.setFont(new Font("Lucida Grande", Font.PLAIN, 33));
		lblLogo.setBounds(307, 6, 110, 95);
		frmCotizadorAgencia.getContentPane().add(lblLogo);
		
		JLabel lblCantidadPersonas = new JLabel("Cantidad de Personas");
		lblCantidadPersonas.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblCantidadPersonas.setBounds(23, 186, 186, 62);
		frmCotizadorAgencia.getContentPane().add(lblCantidadPersonas);
		
		textNombre = new JTextField();
		textNombre.setBounds(151, 121, 232, 35);
		frmCotizadorAgencia.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(23, 130, 93, 21);
		frmCotizadorAgencia.getContentPane().add(lblNewLabel_1);
		
		textCantidadPersonas = new JTextField();
		textCantidadPersonas.setColumns(10);
		textCantidadPersonas.setBounds(242, 202, 110, 35);
		frmCotizadorAgencia.getContentPane().add(textCantidadPersonas);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblCiudad.setBounds(23, 287, 93, 21);
		frmCotizadorAgencia.getContentPane().add(lblCiudad);
		
		JComboBox comboBoxCiudad = new JComboBox();
		comboBoxCiudad.setModel(new DefaultComboBoxModel(new String[] {"-Selecciona una opción-", "Orlando", "California", "kjasbdkbcj"}));
		comboBoxCiudad.setMaximumRowCount(3);
		comboBoxCiudad.setBounds(151, 287, 232, 27);
		frmCotizadorAgencia.getContentPane().add(comboBoxCiudad);
		
		JLabel lblVuelo = new JLabel("Vuelo");
		lblVuelo.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblVuelo.setBounds(23, 361, 93, 21);
		frmCotizadorAgencia.getContentPane().add(lblVuelo);
		
		JComboBox comboBoxVuelo = new JComboBox();
		comboBoxVuelo.setModel(new DefaultComboBoxModel(new String[] {"-Selecciona una opción-", "Con vuelo", "Sin vuelo"}));
		comboBoxVuelo.setMaximumRowCount(3);
		comboBoxVuelo.setBounds(151, 361, 232, 27);
		frmCotizadorAgencia.getContentPane().add(comboBoxVuelo);
		
		JButton btnSiguiente1 = new JButton("Siguiente ->");
		btnSiguiente1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				segundaPantalla = new SegundaPantalla();
				segundaPantalla.setVisibility(true);
				frmCotizadorAgencia.dispose();
			}
			
		});
		btnSiguiente1.setBounds(280, 481, 124, 35);
		frmCotizadorAgencia.getContentPane().add(btnSiguiente1);
	}
	public void setVisibility(boolean visibility) {
		frmCotizadorAgencia.setVisible(true);
	}
}
