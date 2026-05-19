import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import src.CONECTA;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Insets;

public class APPAGENDATRIAL1 {
	private CONECTA conexionBD = new CONECTA();
	ResultSet R;
	ResultSet RClientes;

	
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					APPAGENDATRIAL1 window = new APPAGENDATRIAL1();
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
	public APPAGENDATRIAL1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 911, 745);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 221, 238));
		desktopPane.setBounds(0, 0, 897, 680);
		frame.getContentPane().add(desktopPane);
		
		JLabel lblfondo = new JLabel(".");
		lblfondo.setBounds(0, 0, 897, 680);
		desktopPane.add(lblfondo);
		
		lblfondo.setIcon(new ImageIcon("fondo/wllppr.png"));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(100, 0, 0, 0));
		menuBar.setBackground(new Color(255, 202, 228));
		frame.setJMenuBar(menuBar);
		
		JMenuItem menuNotas = new JMenuItem("NOTAS");
		menuNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Notas c = new Notas();
				desktopPane.add(c);
				c.setVisible(true);   
				
				
			}
		});
		
		JMenuItem menuCalendario = new JMenuItem("CALENDARIO");
		menuBar.add(menuCalendario);
		menuCalendario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calendario c = new Calendario();
				desktopPane.add(c);
				c.setVisible(true);   
				
			}
		});
		
		JMenuItem mntmEscanear = new JMenuItem("CARGAR IMAGEN");
		mntmEscanear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Escanear c = new Escanear();
				desktopPane.add(c);
				c.setVisible(true);   
			}
		});
		menuBar.add(mntmEscanear);
		menuBar.add(menuNotas);
	}
}
