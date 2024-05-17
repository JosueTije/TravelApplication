package solucionInfo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TercerPantalla {

	private JFrame frame;
	private JTextField txtFotoHotel1;
	private JTextField txtFotoHotel2;
	private JTextField txtFotoHotel3;
	private JTextField txtFotoHotel4;
	private JTextField txtFotoHotel5;
	private JButton btnCotizarHotel1;
	private JTextField txtFotoHotel6;
	private JTextField txtFotoHotel7;
	private JTextField txtFotoHotel8;
	private JLabel lblNombreHotel2;
	private JButton btnInfoHotel2;
	private JButton btnCotizarHotel2;
	private JLabel lblNombreHotel3;
	private JButton btnInfoHotel3;
	private JButton btnCotizarHotel3;
	private JLabel lblNombreHotel4;
	private JButton btnInfoHotel4;
	private JButton btnCotizarHotel4;
	private JLabel lblNombreHotel5;
	private JButton btnInfoHotel5;
	private JButton btnCotizarHotel5;
	private JLabel lblNombreHotel6;
	private JButton btnInfoHotel6;
	private JButton btnCotizarHotel6;
	private JLabel lblNombreHotel7;
	private JButton btnInfoHotel7;
	private JButton btnCotizarHotel7;
	private JLabel lblNombreHotel8;
	private JButton btnInfoHotel8;
	private JButton btnCotizarHotel8;
	private JButton btnCotizar;
	private JButton btnRegresar1;
	private SegundaPantalla regreso;
	private CuartaPantalla info;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TercerPantalla window = new TercerPantalla();
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
	public TercerPantalla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogo = new JLabel("LOGO");
		lblLogo.setFont(new Font("Lucida Grande", Font.PLAIN, 33));
		lblLogo.setBounds(740, 6, 110, 95);
		frame.getContentPane().add(lblLogo);
		
		JLabel lblCiudadSeleccionada = new JLabel("Orlando/California");
		lblCiudadSeleccionada.setHorizontalAlignment(SwingConstants.CENTER);
		lblCiudadSeleccionada.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		lblCiudadSeleccionada.setBounds(6, 9, 722, 95);
		frame.getContentPane().add(lblCiudadSeleccionada);
		
		txtFotoHotel1 = new JTextField();
		txtFotoHotel1.setEditable(false);
		txtFotoHotel1.setHorizontalAlignment(SwingConstants.CENTER);
		txtFotoHotel1.setText("FOTO HOTEL 1");
		txtFotoHotel1.setBounds(27, 88, 186, 164);
		frame.getContentPane().add(txtFotoHotel1);
		txtFotoHotel1.setColumns(10);
		
		JLabel lblNombreHotel1 = new JLabel("Nombre Hotel 1");
		lblNombreHotel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreHotel1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNombreHotel1.setBounds(27, 253, 186, 21);
		frame.getContentPane().add(lblNombreHotel1);
		
		txtFotoHotel2 = new JTextField();
		txtFotoHotel2.setText("FOTO HOTEL 2");
		txtFotoHotel2.setHorizontalAlignment(SwingConstants.CENTER);
		txtFotoHotel2.setColumns(10);
		txtFotoHotel2.setBounds(244, 88, 186, 164);
		frame.getContentPane().add(txtFotoHotel2);
		
		txtFotoHotel3 = new JTextField();
		txtFotoHotel3.setText("FOTO HOTEL 3");
		txtFotoHotel3.setHorizontalAlignment(SwingConstants.CENTER);
		txtFotoHotel3.setColumns(10);
		txtFotoHotel3.setBounds(463, 88, 186, 164);
		frame.getContentPane().add(txtFotoHotel3);
		
		txtFotoHotel4 = new JTextField();
		txtFotoHotel4.setText("FOTO HOTEL 4");
		txtFotoHotel4.setHorizontalAlignment(SwingConstants.CENTER);
		txtFotoHotel4.setColumns(10);
		txtFotoHotel4.setBounds(690, 88, 186, 164);
		frame.getContentPane().add(txtFotoHotel4);
		
		txtFotoHotel5 = new JTextField();
		txtFotoHotel5.setText("FOTO HOTEL 5");
		txtFotoHotel5.setHorizontalAlignment(SwingConstants.CENTER);
		txtFotoHotel5.setColumns(10);
		txtFotoHotel5.setBounds(27, 336, 186, 164);
		frame.getContentPane().add(txtFotoHotel5);
		
		JButton btnInfoHotel1 = new JButton("+info");
		btnInfoHotel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				info = new CuartaPantalla();
				info.setVisibility(true);
			}
		});
		btnInfoHotel1.setForeground(SystemColor.controlHighlight);
		btnInfoHotel1.setBackground(SystemColor.windowText);
		btnInfoHotel1.setBounds(27, 286, 79, 29);
		frame.getContentPane().add(btnInfoHotel1);
		
		btnCotizarHotel1 = new JButton("cotizar");
		btnCotizarHotel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "El hotel se ha agregado a la cotización");

			}
		});
		btnCotizarHotel1.setForeground(SystemColor.desktop);
		btnCotizarHotel1.setBackground(SystemColor.desktop);
		btnCotizarHotel1.setBounds(134, 286, 79, 29);
		frame.getContentPane().add(btnCotizarHotel1);
		
		txtFotoHotel6 = new JTextField();
		txtFotoHotel6.setText("FOTO HOTEL 6");
		txtFotoHotel6.setHorizontalAlignment(SwingConstants.CENTER);
		txtFotoHotel6.setColumns(10);
		txtFotoHotel6.setBounds(244, 336, 186, 164);
		frame.getContentPane().add(txtFotoHotel6);
		
		txtFotoHotel7 = new JTextField();
		txtFotoHotel7.setText("FOTO HOTEL 7");
		txtFotoHotel7.setHorizontalAlignment(SwingConstants.CENTER);
		txtFotoHotel7.setColumns(10);
		txtFotoHotel7.setBounds(463, 336, 186, 164);
		frame.getContentPane().add(txtFotoHotel7);
		
		txtFotoHotel8 = new JTextField();
		txtFotoHotel8.setText("FOTO HOTEL 8");
		txtFotoHotel8.setHorizontalAlignment(SwingConstants.CENTER);
		txtFotoHotel8.setColumns(10);
		txtFotoHotel8.setBounds(690, 336, 186, 164);
		frame.getContentPane().add(txtFotoHotel8);
		
		lblNombreHotel2 = new JLabel("Nombre Hotel 2");
		lblNombreHotel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreHotel2.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNombreHotel2.setBounds(244, 253, 186, 21);
		frame.getContentPane().add(lblNombreHotel2);
		
		btnInfoHotel2 = new JButton("+info");
		btnInfoHotel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				info = new CuartaPantalla();
				info.setVisibility(true);
			}
		});
		btnInfoHotel2.setForeground(SystemColor.controlHighlight);
		btnInfoHotel2.setBackground(SystemColor.controlHighlight);
		btnInfoHotel2.setBounds(244, 286, 79, 29);
		frame.getContentPane().add(btnInfoHotel2);
		
		btnCotizarHotel2 = new JButton("cotizar");
		btnCotizarHotel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "El hotel se ha agregado a la cotización");
			}
		});
		btnCotizarHotel2.setForeground(SystemColor.desktop);
		btnCotizarHotel2.setBackground(SystemColor.desktop);
		btnCotizarHotel2.setBounds(351, 286, 79, 29);
		frame.getContentPane().add(btnCotizarHotel2);
		
		lblNombreHotel3 = new JLabel("Nombre Hotel 3");
		lblNombreHotel3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreHotel3.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNombreHotel3.setBounds(463, 253, 186, 21);
		frame.getContentPane().add(lblNombreHotel3);
		
		btnInfoHotel3 = new JButton("+info");
		btnInfoHotel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				info = new CuartaPantalla();
				info.setVisibility(true);
			}
		});
		btnInfoHotel3.setForeground(SystemColor.controlHighlight);
		btnInfoHotel3.setBackground(SystemColor.controlHighlight);
		btnInfoHotel3.setBounds(463, 286, 79, 29);
		frame.getContentPane().add(btnInfoHotel3);
		
		btnCotizarHotel3 = new JButton("cotizar");
		btnCotizarHotel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "El hotel se ha agregado a la cotización");
			}
		});
		btnCotizarHotel3.setForeground(SystemColor.desktop);
		btnCotizarHotel3.setBackground(SystemColor.desktop);
		btnCotizarHotel3.setBounds(570, 286, 79, 29);
		frame.getContentPane().add(btnCotizarHotel3);
		
		lblNombreHotel4 = new JLabel("Nombre Hotel 4");
		lblNombreHotel4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreHotel4.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNombreHotel4.setBounds(690, 253, 186, 21);
		frame.getContentPane().add(lblNombreHotel4);
		
		btnInfoHotel4 = new JButton("+info");
		btnInfoHotel4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				info = new CuartaPantalla();
				info.setVisibility(true);
			}
		});
		btnInfoHotel4.setForeground(SystemColor.controlHighlight);
		btnInfoHotel4.setBackground(SystemColor.controlHighlight);
		btnInfoHotel4.setBounds(690, 286, 79, 29);
		frame.getContentPane().add(btnInfoHotel4);
		
		btnCotizarHotel4 = new JButton("cotizar");
		btnCotizarHotel4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "El hotel se ha agregado a la cotización");
			}
		});
		btnCotizarHotel4.setForeground(SystemColor.desktop);
		btnCotizarHotel4.setBackground(SystemColor.desktop);
		btnCotizarHotel4.setBounds(797, 286, 79, 29);
		frame.getContentPane().add(btnCotizarHotel4);
		
		lblNombreHotel5 = new JLabel("Nombre Hotel 5");
		lblNombreHotel5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreHotel5.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNombreHotel5.setBounds(27, 516, 186, 21);
		frame.getContentPane().add(lblNombreHotel5);
		
		btnInfoHotel5 = new JButton("+info");
		btnInfoHotel5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				info = new CuartaPantalla();
				info.setVisibility(true);
			}
		});
		btnInfoHotel5.setForeground(SystemColor.controlHighlight);
		btnInfoHotel5.setBackground(SystemColor.controlHighlight);
		btnInfoHotel5.setBounds(27, 549, 79, 29);
		frame.getContentPane().add(btnInfoHotel5);
		
		btnCotizarHotel5 = new JButton("cotizar");
		btnCotizarHotel5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "El hotel se ha agregado a la cotización");
			}
		});
		btnCotizarHotel5.setForeground(SystemColor.desktop);
		btnCotizarHotel5.setBackground(SystemColor.desktop);
		btnCotizarHotel5.setBounds(134, 549, 79, 29);
		frame.getContentPane().add(btnCotizarHotel5);
		
		lblNombreHotel6 = new JLabel("Nombre Hotel 6");
		lblNombreHotel6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreHotel6.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNombreHotel6.setBounds(244, 512, 186, 21);
		frame.getContentPane().add(lblNombreHotel6);
		
		btnInfoHotel6 = new JButton("+info");
		btnInfoHotel6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				info = new CuartaPantalla();
				info.setVisibility(true);
			}
		});
		btnInfoHotel6.setForeground(SystemColor.controlHighlight);
		btnInfoHotel6.setBackground(SystemColor.controlHighlight);
		btnInfoHotel6.setBounds(244, 545, 79, 29);
		frame.getContentPane().add(btnInfoHotel6);
		
		btnCotizarHotel6 = new JButton("cotizar");
		btnCotizarHotel6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "El hotel se ha agregado a la cotización");
			}
		});
		btnCotizarHotel6.setForeground(SystemColor.desktop);
		btnCotizarHotel6.setBackground(SystemColor.desktop);
		btnCotizarHotel6.setBounds(351, 545, 79, 29);
		frame.getContentPane().add(btnCotizarHotel6);
		
		lblNombreHotel7 = new JLabel("Nombre Hotel 7");
		lblNombreHotel7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreHotel7.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNombreHotel7.setBounds(463, 512, 186, 21);
		frame.getContentPane().add(lblNombreHotel7);
		
		btnInfoHotel7 = new JButton("+info");
		btnInfoHotel7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				info = new CuartaPantalla();
				info.setVisibility(true);
			}
		});
		btnInfoHotel7.setForeground(SystemColor.controlHighlight);
		btnInfoHotel7.setBackground(SystemColor.controlHighlight);
		btnInfoHotel7.setBounds(463, 545, 79, 29);
		frame.getContentPane().add(btnInfoHotel7);
		
		btnCotizarHotel7 = new JButton("cotizar");
		btnCotizarHotel7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "El hotel se ha agregado a la cotización");
			}
		});
		btnCotizarHotel7.setForeground(SystemColor.desktop);
		btnCotizarHotel7.setBackground(SystemColor.desktop);
		btnCotizarHotel7.setBounds(570, 545, 79, 29);
		frame.getContentPane().add(btnCotizarHotel7);
		
		lblNombreHotel8 = new JLabel("Nombre Hotel 8");
		lblNombreHotel8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreHotel8.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNombreHotel8.setBounds(690, 512, 186, 21);
		frame.getContentPane().add(lblNombreHotel8);
		
		btnInfoHotel8 = new JButton("+info");
		btnInfoHotel8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				info = new CuartaPantalla();
				info.setVisibility(true);
			}
		});
		btnInfoHotel8.setForeground(SystemColor.controlHighlight);
		btnInfoHotel8.setBackground(SystemColor.controlHighlight);
		btnInfoHotel8.setBounds(690, 545, 79, 29);
		frame.getContentPane().add(btnInfoHotel8);
		
		btnCotizarHotel8 = new JButton("cotizar");
		btnCotizarHotel8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "El hotel se ha agregado a la cotización");
			}
		});
		btnCotizarHotel8.setForeground(SystemColor.desktop);
		btnCotizarHotel8.setBackground(SystemColor.desktop);
		btnCotizarHotel8.setBounds(797, 545, 79, 29);
		frame.getContentPane().add(btnCotizarHotel8);
		
		btnCotizar = new JButton("Cotizar");
		btnCotizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "La cotización se ha hecho exitosamente");
			}
		});
		btnCotizar.setForeground(SystemColor.desktop);
		btnCotizar.setBounds(770, 586, 113, 36);
		frame.getContentPane().add(btnCotizar);
		
		btnRegresar1 = new JButton("<- Regresar");
		btnRegresar1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				regreso = new SegundaPantalla();
				regreso.setVisibility(true);
				frame.dispose();
			}
		});
		btnRegresar1.setBounds(22, 590, 124, 35);
		frame.getContentPane().add(btnRegresar1);
		frame.setBounds(100, 100, 906, 656);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void setVisibility(boolean visibility) {
		frame.setVisible(true);
	}

}
