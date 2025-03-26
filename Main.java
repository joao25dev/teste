package curso_programacao;

import java.util.Scanner;	
import java.util.Locale;	

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		
			
			int N = sc.nextInt();
	    
			if (N % 2 == 0) {
			System.out.println("PAR");
			}
			else {
			System.out.println("IMPAR");
			}

				
		
		
		
			
		sc.close();
	
		
	}

}
