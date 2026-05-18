import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ManejaPantallas {
	public class FormularioInterno extends JInternalFrame {
	    public FormularioInterno(String titulo) {
	        super(titulo, true, true, true, true);
	        setSize(300, 200);
	        setLocation(50, 50);
	        JLabel etiqueta = new JLabel("Contenido del formulario", SwingConstants.CENTER);
	        add(etiqueta);
	        setVisible(true);
	    }
	}
}
