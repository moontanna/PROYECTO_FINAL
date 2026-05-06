import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class Calendario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
	public Calendario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 223, 239));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
			JLabel lblTitle = new JLabel("CALENDARIO");
			lblTitle.setForeground(new Color(128, 0, 128));
			lblTitle.setFont(new Font("Yu Gothic", Font.BOLD, 13));
			lblTitle.setBounds(169, 13, 95, 22);
			contentPane.add(lblTitle);
			
			JLabel lblDia = new JLabel("DIA");
			lblDia.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			lblDia.setBounds(53, 51, 28, 15);
			contentPane.add(lblDia);
			
			JLabel lblEvento = new JLabel("EVENTO");
			lblEvento.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			lblEvento.setBounds(53, 79, 63, 18);
			contentPane.add(lblEvento);
			
			JLabel lblHora = new JLabel("HORA");
			lblHora.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			lblHora.setBounds(53, 111, 34, 18);
			contentPane.add(lblHora);
			
			JLabel lblMes = new JLabel("MES");
			lblMes.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			lblMes.setBounds(150, 51, 52, 15);
			contentPane.add(lblMes);
			
			JLabel lblAnio = new JLabel("PERIODO");
			lblAnio.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			lblAnio.setBounds(257, 51, 68, 15);
			contentPane.add(lblAnio);
			
			JComboBox comboBoxDIA = new JComboBox();
			comboBoxDIA.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
			comboBoxDIA.setBounds(80, 45, 49, 20);
			contentPane.add(comboBoxDIA);
			
			JComboBox comboBoxMES = new JComboBox();
			comboBoxMES.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
			comboBoxMES.setBounds(177, 45, 68, 20);
			contentPane.add(comboBoxMES);
			
			JComboBox comboBoxANIO = new JComboBox();
			comboBoxANIO.setModel(new DefaultComboBoxModel(new String[] {"2025", "2026", "2027", "2028", "2029", "2030"}));
			comboBoxANIO.setBounds(318, 45, 52, 20);
			contentPane.add(comboBoxANIO);
			
			JTextField textField = new JTextField();
			textField.setBounds(111, 76, 153, 18);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
			comboBox.setBounds(97, 107, 75, 20);
			contentPane.add(comboBox);
			
			JLabel lblMinutos = new JLabel("MINUTOS");
			lblMinutos.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			lblMinutos.setBounds(182, 111, 63, 18);
			contentPane.add(lblMinutos);
			
			JComboBox comboBoxMINUTOS = new JComboBox();
			comboBoxMINUTOS.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
			comboBoxMINUTOS.setBounds(247, 107, 63, 20);
			contentPane.add(comboBoxMINUTOS);
			
			JList list = new JList();
			list.setBounds(53, 153, 317, 70);
			contentPane.add(list);
			
			JButton btnVOLVER = new JButton("VOLVER");
			btnVOLVER.setFont(new Font("Tahoma", Font.ITALIC, 10));
			btnVOLVER.setBackground(new Color(236, 217, 255));
			btnVOLVER.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnVOLVER.setBounds(342, 233, 84, 20);
			contentPane.add(btnVOLVER);

		

	}
}
