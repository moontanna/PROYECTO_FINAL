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
		setBounds(100, 100, 283, 353);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 221, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.getContentPane().setBackground(new Color(255, 225, 240));
		internalFrame.setBounds(-13, -28, 291, 351);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		JButton btnSeleccionar = new JButton("SELECCIONAR IMAGEN");
		btnSeleccionar.setBounds(52, 219, 173, 22);
		internalFrame.getContentPane().add(btnSeleccionar);
		btnSeleccionar.setBackground(new Color(238, 221, 255));
		btnSeleccionar.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		
		 
		guarda = new JLabel(".");
		guarda.setBounds(41, 42, 184, 167);
		internalFrame.getContentPane().add(guarda);
		
		JButton btnVOLVER = new JButton("CERRAR");
		btnVOLVER.setBounds(181, 291, 84, 20);
		internalFrame.getContentPane().add(btnVOLVER);
		btnVOLVER.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Escanear.this.setVisible(false);
			}

			
				
				
			
		});
		btnVOLVER.setFont(new Font("Tahoma", Font.ITALIC, 10));
		btnVOLVER.setBackground(new Color(236, 217, 255));
		
		JLabel lblEscanear = new JLabel("CARGAR IMAGEN");
		lblEscanear.setBounds(77, 10, 125, 22);
		internalFrame.getContentPane().add(lblEscanear);
		lblEscanear.setForeground(new Color(128, 0, 128));
		lblEscanear.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		
		JButton btnGuardarImg = new JButton("GUARDAR");
		btnGuardarImg.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		btnGuardarImg.setBackground(new Color(236, 217, 255));
		btnGuardarImg.setBounds(52, 251, 173, 22);
		internalFrame.getContentPane().add(btnGuardarImg);
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
