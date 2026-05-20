import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JInternalFrame;

public class Notas extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	ArrayList<String> ListaNotas = new ArrayList<String>();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notas frame = new Notas();
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
	public Notas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 223, 239));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("NOTAS");
		lblTitle.setForeground(new Color(128, 0, 128));
		lblTitle.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		lblTitle.setBounds(184, 10, 46, 22);
		contentPane.add(lblTitle);
		
		JTextArea textEscrito = new JTextArea();
		textEscrito.setBounds(58, 42, 312, 104);
		contentPane.add(textEscrito);
		
		JButton btnGUARDAR = new JButton("GUARDAR");
		btnGUARDAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nota = textEscrito.getText();				
				ListaNotas.add(nota);
			
				JOptionPane.showMessageDialog(null, "Se guardo tu nota");		
			}
		});
		btnGUARDAR.setBackground(new Color(236, 217, 255));
		btnGUARDAR.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGUARDAR.setBounds(58, 156, 312, 20);
		contentPane.add(btnGUARDAR);
		
		JButton btnANTERIOR = new JButton("ANTERIOR");
		btnANTERIOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String producto;
				String precio;
				
				
			}
		});
		btnANTERIOR.setBackground(new Color(236, 217, 255));
		btnANTERIOR.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnANTERIOR.setBounds(60, 198, 104, 20);
		contentPane.add(btnANTERIOR);
		
		JButton btnVOLVER = new JButton("CERRAR");
		btnVOLVER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Notas.this.setVisible(false);
			}

			
		});
		btnVOLVER.setBackground(new Color(236, 217, 255));
		btnVOLVER.setFont(new Font("Tahoma", Font.ITALIC, 10));
		btnVOLVER.setBounds(340, 8, 84, 20);
		contentPane.add(btnVOLVER);
		
		JButton btnSIGUIENTE = new JButton("SIGUIENTE");
		btnSIGUIENTE.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSIGUIENTE.setBackground(new Color(236, 217, 255));
		btnSIGUIENTE.setBounds(260, 198, 110, 20);
		contentPane.add(btnSIGUIENTE);
		Notas.this.setVisible(false);
		
	}
}
