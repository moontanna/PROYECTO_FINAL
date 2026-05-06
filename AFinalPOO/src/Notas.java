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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Notas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

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
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(58, 62, 312, 84);
		contentPane.add(textArea);
		
		JButton btnGUARDAR = new JButton("GUARDAR");
		btnGUARDAR.setBackground(new Color(236, 217, 255));
		btnGUARDAR.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGUARDAR.setBounds(60, 170, 84, 20);
		contentPane.add(btnGUARDAR);
		
		JButton btnBORRAR = new JButton("BORRAR");
		btnBORRAR.setBackground(new Color(236, 217, 255));
		btnBORRAR.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnBORRAR.setBounds(286, 170, 84, 20);
		contentPane.add(btnBORRAR);
		
		JButton btnVOLVER = new JButton("VOLVER");
		btnVOLVER.setBackground(new Color(236, 217, 255));
		btnVOLVER.setFont(new Font("Tahoma", Font.ITALIC, 10));
		btnVOLVER.setBounds(342, 233, 84, 20);
		contentPane.add(btnVOLVER);

		
	}
}
