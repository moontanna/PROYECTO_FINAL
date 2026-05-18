import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;

public class Escanear extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel guarda;

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
		setBounds(100, 100, 239, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 221, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setBounds(0, 0, 230, 264);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		JButton btnSeleccionar = new JButton("SELECCIONAR IMAGEN");
		btnSeleccionar.setBounds(8, 159, 190, 22);
		internalFrame.getContentPane().add(btnSeleccionar);
		btnSeleccionar.setBackground(new Color(236, 217, 255));
		btnSeleccionar.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		
		 
		guarda = new JLabel(".");
		guarda.setBounds(45, 42, 110, 106);
		internalFrame.getContentPane().add(guarda);
		
		JButton btnVOLVER = new JButton("CERRAR");
		btnVOLVER.setBounds(45, 204, 84, 20);
		internalFrame.getContentPane().add(btnVOLVER);
		btnVOLVER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Escanear.this.setVisible(false);
			}

			
				
				
			
		});
		btnVOLVER.setFont(new Font("Tahoma", Font.ITALIC, 10));
		btnVOLVER.setBackground(new Color(236, 217, 255));
		
		JLabel lblEscanear = new JLabel("ESCANEAR");
		lblEscanear.setBounds(66, 10, 76, 22);
		internalFrame.getContentPane().add(lblEscanear);
		lblEscanear.setForeground(new Color(128, 0, 128));
		lblEscanear.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		internalFrame.setVisible(true);
		
		btnSeleccionar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        btnSeleccionarArchivoActionPerformed(e);
		    }
		});
		
		
			  
		
	}
		//Aquí se carga la imágen desde el botón
		private void btnSeleccionarArchivoActionPerformed(java.awt.event.ActionEvent evt) {
		    JFileChooser fileChooser = new JFileChooser();
		    // Filtro para solo mostrar imágenes
		    fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Imágenes", "jpg", "png", "gif"));
		    
		    int resultado = fileChooser.showOpenDialog(this);
		    
		    if (resultado == JFileChooser.APPROVE_OPTION) {
		        File archivoSeleccionado = fileChooser.getSelectedFile();
		        try {
		            ImageIcon icon = new ImageIcon(archivoSeleccionado.getAbsolutePath());
		          
					// Mostrar en etiqueta o botón
		            guarda.setIcon(icon); 
		        } catch (Exception ex) {
		        	 Path origen = archivoSeleccionado.toPath();

		             // Nombre del archivo
		             String nombreImagen = archivoSeleccionado.getName();

		             // Carpeta destino
		             Path destino = Paths.get("imagenes/" + nombreImagen);

		             // Copiar imagen a la carpeta imagenes
		             try {
						Files.copy(
						     origen,
						     destino,
						     StandardCopyOption.REPLACE_EXISTING 
						     );
					       // Mostrar imagen guardada
			            ImageIcon icon = new ImageIcon(destino.toString());

			            guarda.setIcon(icon);

			            JOptionPane.showMessageDialog(this, "Imagen guardada en la carpeta imagenes");

			        } catch (Exception em) {

			            JOptionPane.showMessageDialog(this,"Error: " + em.getMessage());
					}
		        }
		    }
		
	}
}
