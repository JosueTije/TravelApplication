package solucionInfo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SegundaPantalla {

	private JFrame frame;
	private JTextField textDíasDisney;
	private JTextField textDiasUniversal;
	private JTextField txtCantidadCuartos;
	private EntregaPantallas regresar;
	private TercerPantalla siguiente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SegundaPantalla window = new SegundaPantalla();
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
	public SegundaPantalla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 423, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogo = new JLabel("LOGO");
		lblLogo.setFont(new Font("Lucida Grande", Font.PLAIN, 33));
		lblLogo.setBounds(307, 6, 110, 95);
		frame.getContentPane().add(lblLogo);
		
		JLabel lblCiudadSeleccionada = new JLabel("Orlando/California");
		lblCiudadSeleccionada.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		lblCiudadSeleccionada.setBounds(90, 58, 301, 95);
		frame.getContentPane().add(lblCiudadSeleccionada);
		
		JLabel lblDiasDisney = new JLabel("Días en Disney:");
		lblDiasDisney.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblDiasDisney.setBounds(22, 165, 144, 21);
		frame.getContentPane().add(lblDiasDisney);
		
		JLabel lblDiasUniversal = new JLabel("Días en Universal:");
		lblDiasUniversal.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblDiasUniversal.setBounds(22, 219, 187, 21);
		frame.getContentPane().add(lblDiasUniversal);
		
		JLabel lblCuartosHotel = new JLabel("Cuartos de Hotel:");
		lblCuartosHotel.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblCuartosHotel.setBounds(22, 275, 187, 21);
		frame.getContentPane().add(lblCuartosHotel);
		
		JLabel lblFechaSalida = new JLabel("Fecha de Salida:");
		lblFechaSalida.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblFechaSalida.setBounds(22, 335, 187, 21);
		frame.getContentPane().add(lblFechaSalida);
		
		JLabel lblFechaRegreso = new JLabel("Fecha de Regreso:");
		lblFechaRegreso.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblFechaRegreso.setBounds(22, 400, 187, 21);
		frame.getContentPane().add(lblFechaRegreso);
		
		textDíasDisney = new JTextField();
		textDíasDisney.setText("Inserta # de días");
		textDíasDisney.setBounds(212, 165, 167, 26);
		frame.getContentPane().add(textDíasDisney);
		textDíasDisney.setColumns(10);
		
		textDiasUniversal = new JTextField();
		textDiasUniversal.setText("Inserta # de días");
		textDiasUniversal.setColumns(10);
		textDiasUniversal.setBounds(212, 218, 167, 26);
		frame.getContentPane().add(textDiasUniversal);
		
		txtCantidadCuartos = new JTextField();
		txtCantidadCuartos.setText("Cantidad de Cuartos");
		txtCantidadCuartos.setColumns(10);
		txtCantidadCuartos.setBounds(212, 274, 167, 26);
		frame.getContentPane().add(txtCantidadCuartos);
		
		JDateChooser dateFechaSalida = new JDateChooser();
		dateFechaSalida.setBounds(212, 335, 167, 26);
		frame.getContentPane().add(dateFechaSalida);
		
		JDateChooser dateFechaRegreso = new JDateChooser();
		dateFechaRegreso.setBounds(212, 395, 167, 26);
		frame.getContentPane().add(dateFechaRegreso);
		
		JButton btnSiguiente2 = new JButton("Siguiente ->");
		btnSiguiente2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				siguiente = new TercerPantalla();
				siguiente.setVisibility(true);
				frame.dispose();
			}
		});
		btnSiguiente2.setBounds(281, 485, 124, 35);
		frame.getContentPane().add(btnSiguiente2);
		
		JButton btnRegresar1 = new JButton("<- Regresar");
		btnRegresar1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				regresar = new EntregaPantallas();
				regresar.setVisibility(true);
				frame.dispose();
			}
		});
		btnRegresar1.setBounds(6, 485, 124, 35);
		frame.getContentPane().add(btnRegresar1);
	}
	public void setVisibility(boolean visible) {
		frame.setVisible(visible);
	}
	
}
