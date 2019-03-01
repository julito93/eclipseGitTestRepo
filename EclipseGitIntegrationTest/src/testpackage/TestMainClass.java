/**
 * 
 */
package testpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		// TODO Auto-generated method stub
		System.out.println("Hello from the console!");
		System.out.println("How are you?");
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String answer=input.readLine();
		System.out.println("I'm " +answer + " too");
	}

}
