import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Escanear extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escanear frame = new Escanear();
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
	public Escanear() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 221, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscanear = new JLabel("ESCANEAR");
		lblEscanear.setForeground(new Color(128, 0, 128));
		lblEscanear.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		lblEscanear.setBounds(177, 10, 76, 22);
		contentPane.add(lblEscanear);
		
		JButton btnSeleccionar = new JButton("SELECCIONAR IMAGEN");
		btnSeleccionar.setBackground(new Color(236, 217, 255));
		btnSeleccionar.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		btnSeleccionar.setBounds(110, 76, 190, 22);
		contentPane.add(btnSeleccionar);
		
		JButton btnVOLVER = new JButton("VOLVER");
		btnVOLVER.setFont(new Font("Tahoma", Font.ITALIC, 10));
		btnVOLVER.setBackground(new Color(236, 217, 255));
		btnVOLVER.setBounds(342, 233, 84, 20);
		contentPane.add(btnVOLVER);
		
		
	}
}
