import java.awt.Color;

/**
 * @author Zona programable.
 * 
 *         Esta clase contiene las constantes de colores que se usan en los
 *         videos. <br>
 *         Para llamar a alguna constante solo escribes.<br>
 *         
 *         Color colorAux = Constants.COLOR_NEON_MORADO1;
 */
public class Constants {

	public static final Color COLOR_ZP = Color.decode("#212F3D");
	public static final Color[] COLOR_ZP_ = new Color[10];
	public static final Color COLOR_WHITE = Color.WHITE;
	public static final Color[] COLOR_WHITE_ = new Color[10];

	public static final Color COLOR_LIGHT_PINK = Color.decode("#DFD0E1");

	public static final Color COLOR_NEON_MORADO1 = Color.decode("#C501E2");
	public static final Color COLOR_NEON_MORADO2 = Color.decode("#9A27F7");
	public static final Color COLOR_NEON_AZUL1 = Color.decode("#2B97FA");
	public static final Color COLOR_NEON_AZUL2 = Color.decode("#6664FF");
	public static final Color COLOR_NEON_CYAN1 = Color.decode("#01C4E7");
	public static final Color COLOR_NEON_CYAN2 = Color.decode("#15E6CC");
	public static final Color COLOR_NEON_VERDE1 = Color.decode("#2EF8A0");
	public static final Color COLOR_NEON_VERDE2 = Color.decode("#67FF6B");
	public static final Color COLOR_NEON_AMARILLO = Color.decode("#C6E602");
	public static final Color COLOR_NEON_NARANJA1 = Color.decode("#E7C500");
	public static final Color COLOR_NEON_NARANJA2 = Color.decode("#FF6A62");
	public static final Color COLOR_NEON_VIOLETA1 = Color.decode("#F82D97");
	public static final Color COLOR_NEON_VIOLETA2 = Color.decode("#E830CE");

	static {
		for (int i = 0; i < COLOR_ZP_.length; i++) {
			int alpha = (int) Math.round(25.4 * i);
			COLOR_ZP_[i] = new Color(//
					COLOR_ZP.getRed(), //
					COLOR_ZP.getGreen(), //
					COLOR_ZP.getBlue(), //
					alpha);

			COLOR_WHITE_[i] = new Color(255, 255, 255, alpha);
		}

	};

}
