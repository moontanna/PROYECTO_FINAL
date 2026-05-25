import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import src.CONECTA;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
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
	private CONECTA conexionBD = new CONECTA();
	ResultSet R;
	ResultSet RNotas;
	
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
		
		initComponents();
	    CONECTA conexionBD = new CONECTA();
	    this.R = conexionBD.getFechas();
		 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 223, 239));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		R = conexionBD.getFechas();
		
		
		
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

				boolean respuesta =conexionBD.guardarNota(nota);

				if(respuesta) {

					JOptionPane.showMessageDialog(null,"Nota guardada");

				} else {

					JOptionPane.showMessageDialog(null,"Error al guardar");
						
				}//
					
					
			}
		});
		btnGUARDAR.setBackground(new Color(236, 217, 255));
		btnGUARDAR.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGUARDAR.setBounds(58, 156, 312, 20);
		contentPane.add(btnGUARDAR);
		
		JButton btnANTERIOR = new JButton("ANTERIOR");
		btnANTERIOR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nota;

				
				if (R == null) {
		            JOptionPane.showMessageDialog(null, "No hay conexión con la base de datos.");
		            return;
		        }
				try {

					if(R.previous()) {

						nota = R.getString("texto");

						textEscrito.setText(nota);

					} else

						JOptionPane.showMessageDialog(
						null,
						"Ya no hay más elementos en la tabla");

				} catch(SQLException e1) {

					e1.printStackTrace();
				}
				
				
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
		btnSIGUIENTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nota;

				
				try {
				    if(R != null && R.next()) {
				    	textEscrito.setText(R.getString(3)); // Índice 1 es más robusto
				    } else {
				        JOptionPane.showMessageDialog(null, "No hay más notas");
				        if (R != null) R.last();
				    }
				} catch (SQLException ex) {
				    ex.printStackTrace();
				}
			}
		});
		btnSIGUIENTE.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSIGUIENTE.setBackground(new Color(236, 217, 255));
		btnSIGUIENTE.setBounds(260, 198, 110, 20);
		contentPane.add(btnSIGUIENTE);
		Notas.this.setVisible(false);
		
	}


	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
}
