import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EjemploEj2 {

	public static void main(String[] args) throws IOException, InterruptedException {
        
		//Ejecuta los comandos introducidos
        //Windows
    	final String commands[] = {"cmd", "/C", "dir"};
    	//Linux
    	//final String commands[] = {"ls", "/"};
    	
    	Process process = new ProcessBuilder(commands).start(); // se crea el proceso
    	
    	//Esto hace lo mismo pero pasandole los comandos desde args
    	//Process process1 = new ProcessBuilder(args).start(); // se crea el proceso
        
		//Se lee la salida
		InputStream is = (InputStream) process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		//Esperamos que el proceso termine
		
		int exitValue = process.waitFor();
		System.out.println("\nCodigo de salida: "+ exitValue);
		
	}
}
