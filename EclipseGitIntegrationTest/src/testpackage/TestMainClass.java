/**
 * 
 */
package testpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

/**
 * @author jcampaz
 *
 */
public class TestMainClass {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		JOptionPane.showMessageDialog(null, "Hello from the message dialog!");
		JOptionPane.showMessageDialog(null, "How are you?");
		String answer;
		answer=JOptionPane.showInputDialog(null);
		JOptionPane.showMessageDialog(null, "I'm "+answer+" too");
		
	}

}
