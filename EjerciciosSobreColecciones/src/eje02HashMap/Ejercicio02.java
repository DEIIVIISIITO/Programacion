package eje02HashMap;



import java.util.HashMap;
/**
 d* Ejercicio Nº 2 
 * 
 * Implementa el control de acceso al área restringida de un programa.
 * Se debe pedir un nombre de usuario y una contraseña. Si el usuario
 * introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”.
 * El usuario tendrá un máximo de 3 oportunidades.
 * Si se agotan las oportunidades el programa dirá
 * “Lo siento, no tiene acceso al área restringida”.
 * Los nombres de usuario con sus correspondientes contraseñas deben estar
 * almacenados en una estructura de la clase HashMap.
 *
 * @author (Alberto López) 
 * @version (24/04/2018)
 */
import java.util.Scanner;

import javax.swing.JOptionPane;




public class Ejercicio02 {
	public static void main(String argv[]) {

		HashMap<String, String> thAcceso = new HashMap<String, String>();

		final int NUM_INTENTOS_MAX = 3; // número máximo de intentos
		int intentos = 0;
		

		Scanner sc = new Scanner(System.in);
		String usuario, clave;

		// Relleno el hashMap con usuario y contraseña
		thAcceso.put("admin", "admin");
		thAcceso.put("maria", "1234");
		thAcceso.put("root", "root");

		boolean acceso = false; // Tiene o no acceso
		do {

			usuario = JOptionPane.showInputDialog("Usuario :");
			clave = JOptionPane.showInputDialog("Contraseña :");

			// Si esta definido el nombre de usuario
			String contraseña = thAcceso.get(usuario);
			// Si no es null es igual
			if (contraseña != null && contraseña.equals(clave)) {
				acceso = true;
			} else {

				JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Informacion",
						JOptionPane.WARNING_MESSAGE);
			}
			intentos++;
		} while (!acceso && intentos < NUM_INTENTOS_MAX);

		if (acceso) {
			JOptionPane.showMessageDialog(null, "Acceso concedido", "Informacion", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Superado número máximo de intentos", "Informacion",
					JOptionPane.ERROR_MESSAGE);

		}
	}
}
