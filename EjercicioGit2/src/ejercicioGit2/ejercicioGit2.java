package ejercicioGit2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicioGit2 {

	
	public static boolean passwordVerifier(int a, int b) {
		if (a==b) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String[] DNI = new String[4];
		int[] password = new int[4];
		int numCuentas =0;
		int start=0;
		String starter;
		String wordle;
		
		System.out.println("Para registrar una nueva cuenta, pulse 1, para acceder a su cuenta pulse 2.");
		starter=lector.readLine();
		start = Integer.parseInt(starter);
		
		if(start==1) {
			if(numCuentas>=4) {
				System.out.println("Numero máximo de cuentas registradas");
			} else {
			numCuentas++;
			System.out.println("Introduce tu DNI y una contraseña de 4 dígitos:");
			System.out.print("DNI:");
			DNI[numCuentas]=lector.readLine();
			System.out.print("Pin de 4 dígitos:");
			wordle = lector.readLine();
			password[numCuentas]= Integer.parseInt(wordle);
			}
		}
	}
}
