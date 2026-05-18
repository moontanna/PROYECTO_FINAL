import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Agenda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	private JDesktopPane desktopPane = new JDesktopPane();

	public void abrirVentanaInterna() throws java.beans.PropertyVetoException {
	    
	    Agenda calendarioo = new Agenda();
	    // 2. Configurar la ventana (tamaño, posición, propiedades)
					calendarioo.setSize(400, 300);
					calendarioo.setLocation(50, 50); // Posición relativa al DesktopPane
					calendarioo.setVisible(true);
					    
					    // 3. Añadir la ventana al DesktopPane
					    desktopPane.add(calendarioo);
					    
					    calendarioo.setSelected(true);
					}
	
	
	public void menuItemActionPerformed(java.awt.event.ActionEvent evt) {
		Calendario ventanacalenadio = new Calendario();
		ventanacalenadio.setVisible(true);}
			
	
	
	private void setSelected(boolean b) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Create the frame.
	 */
	public Agenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 311);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 217, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(32, 55, 125, 50);
		contentPane.add(menuBar);
		menuBar.setBackground(new Color(225, 225, 255));
		menuBar.setToolTipText(" \r\n");
		
		JMenu menuuu = new JMenu("MENÚ");
		menuBar.add(menuuu);
		
		JMenuItem MENUCALENDARIO = new JMenuItem("CALENDARIO");
		MENUCALENDARIO.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Calendario c = new Calendario();
				desktopPane.add(c);
				c.pack(); // Ajusta el tamaño al contenido
				c.setVisible(true);
				
			}
		});
		menuuu.add(MENUCALENDARIO);
		
		JMenuItem MENUNOTAS = new JMenuItem("NOTAS");
		MENUNOTAS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		menuuu.add(MENUNOTAS);
		MENUNOTAS.setHorizontalAlignment(SwingConstants.LEFT);
		
		JMenuItem MENUESCANEAR = new JMenuItem("ESCANEAR");
		menuuu.add(MENUESCANEAR);
		
		JLabel lblTitle = new JLabel("AGENDA DE SALUD");
		lblTitle.setBounds(221, 10, 161, 31);
		contentPane.add(lblTitle);
		lblTitle.setForeground(new Color(128, 0, 128));
		lblTitle.setFont(new Font("Yu Gothic Medium", Font.BOLD, 16));

		
	
		
		
	
		
		
	}
}
