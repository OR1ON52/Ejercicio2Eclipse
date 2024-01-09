package ejercicioGit2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicioGit2 {

	
	public static boolean passwordVerifier(String a, String b) {
		if (a==b) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] cuenta = new String[8];
		int start=0;
		String starter;
		String passworder;
		int password;
		
		System.out.println("Para crear una nueva cuenta, pulse 1, para acceder a su cuenta, pulse 2");
		while (start!=1 || start!=2) {
	    starter = br.readLine();
		start=Integer.parseInt(starter);
		
        if(start==1) {
        	System.out.println("Registrese con su DNI y contraseña");
        	System.out.print("DNI: ");
        	String DNI=br.readLine();
        	System.out.println("Contraseña: ");
        	passworder = br.readLine();
        	password=Integer.parseInt(passworder);
        } else if(start==2) {
        	System.out.println("Introduzca su DNI y contraseña");
        } else {
        	System.out.println("Caracteres no validos");
        }
	}
	}
}
