import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

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

	/**
	 * Create the frame.
	 */
	public Agenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 311);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 217, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNotas = new JButton("NOTAS");
		btnNotas.setBackground(new Color(238, 221, 255));
		btnNotas.setBounds(156, 82, 119, 20);
		contentPane.add(btnNotas);
		
		JButton btnCalendario = new JButton("CALENDARIO");
		btnCalendario.setBackground(new Color(238, 221, 255));
		btnCalendario.setBounds(156, 138, 119, 20);
		contentPane.add(btnCalendario);
		
		JButton btnEscanear = new JButton("ESCANEAR");
		btnEscanear.setBackground(new Color(238, 221, 255));
		btnEscanear.setBounds(156, 190, 119, 20);
		contentPane.add(btnEscanear);
		
		JLabel lblTitle = new JLabel("AGENDA DE SALUD");
		lblTitle.setForeground(new Color(128, 0, 128));
		lblTitle.setFont(new Font("Yu Gothic Medium", Font.BOLD, 16));
		lblTitle.setBounds(135, 23, 161, 31);
		contentPane.add(lblTitle);

	}
}
