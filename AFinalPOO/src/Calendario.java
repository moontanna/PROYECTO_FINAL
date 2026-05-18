import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;

public class Calendario extends JInternalFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JDesktopPane desktopPanecalandario = new JDesktopPane();
	LocalDate hoy = LocalDate.now();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendario frame = new Calendario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//public class Calendarioo extends JFrame {
	public Calendario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 223, 239));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		 
		        
		       
		    
		

		
			JLabel lblTitle = new JLabel("CALENDARIO");
			lblTitle.setForeground(new Color(128, 0, 128));
			lblTitle.setFont(new Font("Yu Gothic", Font.BOLD, 13));
			lblTitle.setBounds(169, 13, 95, 22);
			contentPane.add(lblTitle);
			
			JLabel lblDia = new JLabel("DIA");
			lblDia.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			lblDia.setBounds(53, 78, 28, 15);
			contentPane.add(lblDia);
			
			JLabel lblHora = new JLabel("HORA");
			lblHora.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			lblHora.setBounds(53, 111, 34, 18);
			contentPane.add(lblHora);
			
			JLabel lblMes = new JLabel("MES");
			lblMes.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			lblMes.setBounds(150, 78, 52, 15);
			contentPane.add(lblMes);
			
			JLabel lblAnio = new JLabel("PERIODO");
			lblAnio.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			lblAnio.setBounds(260, 78, 68, 15);
			contentPane.add(lblAnio);
			
			JComboBox comboBoxMES = new JComboBox();
			comboBoxMES.setBackground(new Color(255, 255, 255));
			comboBoxMES.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
			comboBoxMES.setBounds(182, 72, 68, 20);
			contentPane.add(comboBoxMES);
			
			JComboBox comboBoxANIO = new JComboBox();
			comboBoxANIO.setBackground(new Color(255, 255, 255));
			comboBoxANIO.setModel(new DefaultComboBoxModel(new String[] {"2025", "2026", "2027", "2028", "2029", "2030"}));
			comboBoxANIO.setBounds(318, 72, 52, 20);
			contentPane.add(comboBoxANIO);
			comboBoxMES.setSelectedIndex(hoy.getMonthValue()-1);
			comboBoxANIO.setSelectedIndex(hoy.getYear()-2026);
			
			JComboBox comboHORA = new JComboBox();
			comboHORA.setBackground(new Color(255, 255, 255));
			comboHORA.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
			comboHORA.setBounds(97, 107, 75, 20);
			contentPane.add(comboHORA);
			
			JLabel lblMinutos = new JLabel("MINUTOS");
			lblMinutos.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			lblMinutos.setBounds(182, 111, 63, 18);
			contentPane.add(lblMinutos);
			
			JComboBox comboBoxMINUTOS = new JComboBox();
			comboBoxMINUTOS.setBackground(new Color(255, 255, 255));
			comboBoxMINUTOS.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
			comboBoxMINUTOS.setBounds(247, 107, 63, 20);
			contentPane.add(comboBoxMINUTOS);
			
			
			LocalDateTime ahora = LocalDateTime.now();
			comboHORA.setSelectedIndex(ahora.getHour());
			comboBoxMINUTOS.setSelectedIndex(ahora.getMinute());
			desktopPanecalandario.setBackground(new Color(221, 238, 255));
			desktopPanecalandario.setBounds(0, 0, 434, 270);
			contentPane.add(desktopPanecalandario);
			
			JButton btnANTERIOR = new JButton("ANTERIOR");
			btnANTERIOR.setBackground(new Color(255, 255, 255));
			btnANTERIOR.setBounds(53, 158, 149, 20);
			desktopPanecalandario.add(btnANTERIOR);
			
			JButton btnBORRAR = new JButton("BORRAR EVENTO");
			btnBORRAR.setBackground(new Color(255, 213, 255));
			btnBORRAR.setBounds(125, 226, 178, 20);
			desktopPanecalandario.add(btnBORRAR);
			
			JButton btnGUARDAR = new JButton("GUARDAR");
			btnGUARDAR.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
				}
			});
			btnGUARDAR.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnGUARDAR.setBackground(new Color(236, 217, 255));
			btnGUARDAR.setBounds(53, 199, 312, 20);
			desktopPanecalandario.add(btnGUARDAR);
			
			
	     
			
			
			
			JButton btnVOLVER = new JButton("CERRAR");
			btnVOLVER.setBounds(350, 10, 84, 20);
			desktopPanecalandario.add(btnVOLVER);
			btnVOLVER.setFont(new Font("Tahoma", Font.ITALIC, 10));
			btnVOLVER.setBackground(new Color(236, 217, 255));
			
			JButton btnSIGUIENTE = new JButton("SIGUIENTE");
			btnSIGUIENTE.setBackground(new Color(240, 240, 240));
			btnSIGUIENTE.setBounds(216, 158, 149, 20);
			desktopPanecalandario.add(btnSIGUIENTE);
			
			JLabel lblEvento = new JLabel("EVENTO");
			lblEvento.setBounds(53, 43, 63, 18);
			desktopPanecalandario.add(lblEvento);
			lblEvento.setForeground(new Color(0, 0, 128));
			lblEvento.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			
			
			JTextField textField = new JTextField();
			textField.setBounds(110, 40, 259, 18);
			desktopPanecalandario.add(textField);
			textField.setColumns(10);
			
			JComboBox comboBoxDIA = new JComboBox();
			comboBoxDIA.setBackground(new Color(255, 255, 255));
			comboBoxDIA.setBounds(81, 75, 49, 20);
			desktopPanecalandario.add(comboBoxDIA);
			comboBoxDIA.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
			
			comboBoxDIA.setSelectedIndex(hoy.getDayOfMonth()-3);
			btnVOLVER.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Calendario.this.setVisible(false);
					
				}
				
			});
			btnBORRAR.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Escanear c = new Escanear();
					
					c.setVisible(true);   
					
				}
			});
			btnANTERIOR.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});

			

	}
}
