import java.awt.Color;
import javax.swing.JFrame;


/**
 * @author Zona programable.
 * 
 *         Crear una ventana basica en Java con el fondo en blanco.
 */
public class View extends JFrame {

	/**
	 * Constructor sin parametros, pero ejecuta el constructor de la super clase y
	 * el metodo initPrperties();
	 */
	public View() {
		super();
		this.initProperpies();

		/* _______El codigo de la mayoria de los videos va aqui :D __________ */
		// Lineas...

		/* __________________________________________________________________ */
	}

	/**
	 * Inicia las propiedades basicas para crear una ventana y sus acciones
	 */
	private void initProperpies() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// Cierra todo al dar click en boton rojo (X).
		this.setTitle("BasicUI.");// Titulo de la venatan.
		this.getContentPane().setBackground(Color.WHITE);// Pinta el fondo blanco.
	}

}
